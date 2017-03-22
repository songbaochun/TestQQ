package com.example.testqq.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.testqq.R;
import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.asd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splik(MainActivity.this, new Intent(MainActivity.this, HomepageActivity.class));
            }
        });
    }
}
