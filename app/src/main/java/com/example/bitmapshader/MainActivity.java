package com.example.bitmapshader;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.bitmapshader.view.RoundImageView;

/**
 * 位图着色器、各种形状：
 * Android BitmapShader 实现圆形、圆角图片
 */
public class MainActivity extends AppCompatActivity {
    private RoundImageView mQiQiu;
    private RoundImageView mMeiNv ;

    private int count=1;
    private int num=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        initView();
    }

    public void initView(){
        mQiQiu = (RoundImageView) findViewById(R.id.id_qiqiu);
        mMeiNv = (RoundImageView) findViewById(R.id.id_meinv);

        mQiQiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count==1){
                    mQiQiu.setType(RoundImageView.TYPE_ROUND);
                    count=2;
                }else {
                    mQiQiu.setType(RoundImageView.TYPE_CIRCLE);
                    count=1;
                }
            }
        });

        mMeiNv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num==1){
                    mMeiNv.setBorderRadius(90);
                    num=2;
                }else {
                    mMeiNv.setBorderRadius(20);
                    num=1;
                }
            }
        });
    }

}
