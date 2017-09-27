package com.kong.androidui.activity;

import android.os.Bundle;

import com.kong.androidui.R;
import com.kong.androidui.activity.base.ABaseActivity;

public class MainActivity extends ABaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
