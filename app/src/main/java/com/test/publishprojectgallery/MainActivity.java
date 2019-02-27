package com.test.publishprojectgallery;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebViewFragment;
import android.widget.ImageView;

import com.android_base.core.common.adapter.CustomBaseAdapter;
import com.android_base.core.fragments.XRBaseWebviewFragment;
import com.android_base.core.fragments.XRCommonListFragment;
import com.android_base.core.fragments.XRCommonRefreshFragment;
import com.android_base.core.module.BaseWebviewHandler;
import com.bumptech.glide.Glide;
import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;
import com.yiqihudong.imageutil.ContextManager;
import com.yiqihudong.imageutil.ImageSelectedHelper;
import com.yiqihudong.imageutil.utils.ImageLoaderUtil;
import com.yiqihudong.imageutil.view.ImageCropCallback;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ArrayList<String> arrayList = new ArrayList();
    String url = "http://img0.imgtn.bdimg.com/it/u=3368323297,2417132385&fm=27&gp=0.jpg";

    {
        arrayList.add(url);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContextManager.init(this);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoWall(url);
            }
        });
        ImageLoaderUtil.displayImage(url, imageView);
    }

    private void photoWall(String url) {
    }
}
