package com.kong.androidui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kong.androidui.R;
import com.kong.androidui.bean.MainListBean;

/**
 * Created by xinzhendi-031 on 2017/9/27.
 */
public class MainListAdapter extends BaseListViewAdapter {

    public MainListAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.adapter_main_list, null);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Object object = getItem(position);
        if (object instanceof MainListBean) {
            MainListBean bean = (MainListBean) object;
            viewHolder.tvName.setText(bean.getName());
        }
        return convertView;
    }

    class ViewHolder {
        private TextView tvName;
    }
}
