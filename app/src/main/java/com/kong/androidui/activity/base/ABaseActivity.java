package com.kong.androidui.activity.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ABaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void initView() {

    }

    protected void intentToActivity(Class<?> c) {
        Intent intent = new Intent();
        intent.setClass(this, c);
        startActivity(intent);
    }
}
