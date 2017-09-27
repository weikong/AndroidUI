package com.kong.androidui.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.kong.androidui.R;
import com.kong.androidui.activity.base.ABaseActivity;
import com.kong.androidui.adapter.MainListAdapter;
import com.kong.androidui.bean.MainListBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ABaseActivity {

    private ListView listView;
    private MainListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void initView() {
        listView = (ListView) findViewById(R.id.listview);
        adapter = new MainListAdapter(this);
        listView.setAdapter(adapter);
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
