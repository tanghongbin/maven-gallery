package com.test.publishprojectgallery;

import android.app.ProgressDialog;
import android.content.Context;
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

    {
        arrayList.add("http://qiuniu.xingrui-cn.com/null1629684062467655456.jpg");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContextManager.init(this);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageSelectedHelper.selectSinglePic(MainActivity.this, true, new ImageCropCallback() {
                    @Override
                    public void call(String url) {
                        Log.i("TAG","打印图片地址:" + url);
                        ImageLoaderUtil.displayImage("file:"+url,imageView);
                    }
                });
            }
        });
        XRBaseWebviewFragment.createFragment(CustomWebHandler.class,"http://baidu.com")
    }
    class CustomWebHandler extends BaseWebviewHandler {

        public CustomWebHandler(Context mContext, BridgeWebView mBridgeWebView) {
            super(mContext, mBridgeWebView);
        }

        @Override
        protected void init() {
            mBridgeWebView.registerHandler("jsCallApp", new BridgeHandler() {
                @Override
                public void handler(String data, CallBackFunction function) {

                }
            });
            mBridgeWebView.callHandler("appCallJs", "testData",new CallBackFunction() {
                @Override
                public void onCallBack(String data) {

                }
            });
        }
    }
}
