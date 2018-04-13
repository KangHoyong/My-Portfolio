package com.example.jess.myapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;



import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {


    //private Button btnLoad;
    //private CustomDialog customDialog;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager  mLayoutManager;
    public TextView tv_result;

    ArrayList<MovieItem> itemArrayList;

    // 오늘 날짜에서 - 1 Day 뺀 날짜 구하기 = 영화 진흥원 API 일별 랭킹 불러오는 부분은 어제 날짜로 검색해야함 (갱신이 다음날 되기때문)
    private String getDate()
    {
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        // 어제 날짜 구하기
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        String noeDate = sdf.format(calendar.getTime());

        Log.d("Date result >> " , noeDate);
        return noeDate;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // array list
        itemArrayList = new ArrayList<>(); // 데이터
        mRecyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //tv_result = (TextView) findViewById(R.id.tv_result);
        //tv_result.setMovementMethod(new ScrollingMovementMethod()); // 스크롤 기능 추가

        MyAsyncTask mProcessTask = new MyAsyncTask();
        mProcessTask.execute();
        //initView();

    }



    //AsyncTask 생성 - 모든 네트워크 로직을 여기서 작성해 준다.
    public class MyAsyncTask extends AsyncTask<String, Void, MovieItem[]> {

        // 객체 생성
        CustomDialog customDialog = new CustomDialog(MainActivity.this);
        OkHttpClient client = new OkHttpClient();

        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
            customDialog.show();
        }

        @Override
        protected  MovieItem[] doInBackground(String... params)
        {
            HttpUrl.Builder urlBuilder = HttpUrl.parse("http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json").newBuilder();
            urlBuilder.addQueryParameter("key", "93b55f1c229a6bff0dc86934d58f0a0f");
            urlBuilder.addQueryParameter("targetDt", getDate());
            // 그 전날날짜로 해야함 예를 들면 오늘 4월11이면 4월 10일 검색해야함 4월 11일 데이터는 4월12일 날 검색됩니다.
            String url = urlBuilder.build().toString();


            Request request = new Request.Builder()
                    .url(url)
                    .build();

            try {
                Response response = client.newCall(request).execute();

                // gson 을 이용해서 json을 자바 객체로 반환
                Gson gson= new GsonBuilder().create();
                JsonParser parser = new JsonParser();

                JsonElement rootObject = parser.parse(response.body().charStream())
                        .getAsJsonObject().get("boxOfficeResult")
                        .getAsJsonObject().get("dailyBoxOfficeList");
                MovieItem[] posts = gson.fromJson(rootObject, MovieItem[].class);

                return posts;

            } catch (Exception e)
            {
                e.printStackTrace();
            }

            return null;

        }

        @Override
        protected  void onPostExecute(MovieItem[] result)
        {
            super.onPostExecute(result);
            customDialog.dismiss();

            // json 오브젝트 반환
            if(result.length > 0) {
                for (MovieItem post : result)
                {
                    itemArrayList.add(post);
                }
            }
            /*
            if(result.length > 0 ) {
                for (MovieItem post : result)
                {
                    tv_result.append(String.valueOf(post.getRank())+"\n");
                    tv_result.append(post.getMovieNm()+"\n");
                    tv_result.append(post.getOpenDt()+"\n");
                }
            }
            // 요청결과를 여기서 처리한다. 화면 출력
            //Log.d("Result >> " , result.toString());
            //tv_result.setText(result.toString());

            // Adapter setting
            */
            mAdapter = new Adapter(itemArrayList);
            mRecyclerView.setAdapter(mAdapter);

        }

    }
    /*
    private void initView()
    {
        btnLoad = (Button) findViewById(R.id.btn_load);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog = new CustomDialog(MainActivity.this);
                customDialog.show();

            }
        });
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        customDialog.dismiss();
    }
    */

}
