package com.test.publishprojectgallery;

import android.app.Application;

import com.yiqihudong.imageutil.ImageSelectedHelper;

/**
 * Created by tanghongbin on 2017/11/14.
 */

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageSelectedHelper.initProviderAuth(this,"com.yiqihudong.myutils.special.main");
    }
}
