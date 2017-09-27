package com.kong.androidui.adapter.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinzhendi-031 on 2017/9/27.
 */
public abstract class BaseListViewAdapter<TYPE> extends BaseAdapter {

    protected List<TYPE> datas = new ArrayList<>();
    protected LayoutInflater layoutInflater;

    protected Context mContext;

    public BaseListViewAdapter(Context context) {
        this.mContext = context;
        layoutInflater = LayoutInflater.from(context);
    }

    public void setData(List<TYPE> datas) {
        if (datas == null)
            return;
        this.datas.clear();
        this.datas.addAll(datas);
    }

    public void addItem(TYPE data) {
        if (data == null)
            return;
        this.datas.add(data);
    }

    public void addData(List<TYPE> datas) {
        if (datas == null)
            return;
        this.datas.addAll(datas);
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas == null ? null : datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
