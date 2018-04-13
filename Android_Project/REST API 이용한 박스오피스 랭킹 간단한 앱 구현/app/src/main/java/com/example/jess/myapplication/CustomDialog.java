package com.example.jess.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class CustomDialog extends Dialog {

    private Context c;
    private ImageView imagelogo;
    private AnimationDrawable animationDrawable;



    public CustomDialog(Context context) {
        super(context);
        // 1. 일단 로딩 화면에 TitleBar이라던 지, 불필요한 Bar들이 있으면 안되니, FEATURE_NO_TITLE 특성을 적용시켜 없애줍니다.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //  위 코드를 집어넣어 화면 어느 부분을 클릭해도 없어지지 않게 설정해 둡니다.
        setCanceledOnTouchOutside(false);

        c = context;

    }

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.custom_dialog);
        imagelogo = (ImageView) findViewById(R.id.img_android);
        Animation anim = AnimationUtils.loadAnimation(c , R.anim.loading);
        imagelogo.setAnimation(anim);

    }

    @Override
    public void show()
    {
        super.show();

    }

    @Override
    public  void dismiss()
    {
        super.dismiss();
    }



}

