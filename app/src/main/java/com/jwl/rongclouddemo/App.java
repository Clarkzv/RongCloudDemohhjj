package com.jwl.rongclouddemo;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Administrator on 2018/4/19/0019.
 */

public class App extends Application {

    public static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        RongIM.init(this);
    }
}
