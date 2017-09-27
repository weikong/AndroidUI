package com.kong.androidui.bean;

import com.kong.androidui.bean.base.BaseBean;

/**
 * Created by xinzhendi-031 on 2017/9/27.
 */
public class MainListBean extends BaseBean {
    private String name;

    public String getName() {
        return name;
    }

    public MainListBean setName(String name) {
        this.name = name;
        return this;
    }
}
