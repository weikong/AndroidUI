package com.kong.androidui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.kong.androidui.R;
import com.kong.androidui.activity.base.ABaseActivity;
import com.kong.androidui.adapter.MainListAdapter;
import com.kong.androidui.bean.MainListBean;

import java.util.ArrayList;
import java.util.List;

public class MainUIActivity extends ABaseActivity {

    private ListView listView;
    private MainListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);
        initView();
    }

    @Override
    protected void initView() {
        listView = (ListView) findViewById(R.id.listview);
        adapter = new MainListAdapter(this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        intentToActivity(MainActivity.class);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
            }
        });
        String[] viewNames = getResources().getStringArray(R.array.main_list);
        List<MainListBean> list = new ArrayList<>();
        for (String name : viewNames) {
            MainListBean bean = new MainListBean();
            bean.setName(name);
            list.add(bean);
        }
        adapter.setData(list);
    }
}
