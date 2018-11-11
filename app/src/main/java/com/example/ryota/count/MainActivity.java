package com.example.ryota.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //--ここで変数を宣言する!
    TextView textView;
    int count;
    TextView textView2;
    int count2;
    TextView textView3;
    int count3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ここで変数を初期化!
        textView = (TextView) findViewById(R.id.textView);
        count = 0;
        textView2 = (TextView) findViewById(R.id.textView2);
        count2 = 0;
        textView3 = (TextView) findViewById(R.id.textView3);
        count3 = 0;

    }

    public void add(View v) {
        count = count + 1;

        textView.setText(count + "回ボタンが押されました！");
    }

    public void mainasu(View v) {
        count = count - 1;

        textView.setText(count + "回ボタンが押されました！");
    }

    public void add2(View v) {
        count2 = count2 + 1;

        textView2.setText(count2 + "回ボタンが押されました！");
    }

    public void sum(View v) {
        count3 = count + count2;

        textView3.setText("合計の値は" + count3 + "です！");
    }

}