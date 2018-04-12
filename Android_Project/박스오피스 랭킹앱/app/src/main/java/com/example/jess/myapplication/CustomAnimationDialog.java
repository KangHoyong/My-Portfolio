package com.example.jess.myapplication;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.*;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class CustomAnimationDialog extends Dialog {

    private Context c;
    private ImageView imgLogo;
    public CustomAnimationDialog(Context context)
    {
        super(context);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setCanceledOnTouchOutside(false);


        c=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        imgLogo = (ImageView) findViewById(R.id.img_android);
        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(c, R.drawable.frame_loading);
        imgLogo.setAnimation(anim);
    }

    @Override
    public void show() {
        super.show();
    }
    @Override
    public void dismiss() {
        super.dismiss();
    }
}
