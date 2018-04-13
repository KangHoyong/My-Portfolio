package com.example.jess.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private ArrayList<MovieItem> mData_set;

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tv_rank , tv_movieNm , tv_openDt, tv_salesAmt;


        // ViewHolder
        public MyViewHolder(View view) {
            super(view);

            tv_rank = (TextView) view.findViewById(R.id.tv_rank);
            tv_movieNm = (TextView) view.findViewById(R.id.tv_movieNm);
            tv_openDt = (TextView) view.findViewById(R.id.tv_opneDt);
            tv_salesAmt = (TextView) view.findViewById(R.id.tv_salesAmt);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    // 생성자
    public Adapter(ArrayList<MovieItem> myDataset) {
        mData_set = myDataset;
    }


    // Create new views (invoked by the layout manager)

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);


        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }


    // 관리자 호출 부분
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_rank.setText(String.valueOf(mData_set.get(position).getRank())); // 형변환 필요 String
        holder.tv_movieNm.setText(mData_set.get(position).getMovieNm());
        holder.tv_openDt.setText(mData_set.get(position).getOpenDt());
        holder.tv_salesAmt.setText(String.valueOf(mData_set.get(position).getSalesAmt())); // 형변환 필요 String
    }

    @Override
    public int getItemCount() {
        return mData_set.size();
    }
}
