package com.kong.androidui.bean.base;

import java.io.Serializable;

/**
 * Created by xinzhendi-031 on 2017/9/27.
 */
public class BaseBean implements Serializable {
    private long id;

    public long getId() {
        return id;
    }

    public BaseBean setId(long id) {
        this.id = id;
        return this;
    }
}
