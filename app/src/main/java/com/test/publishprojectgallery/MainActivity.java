package com.test.publishprojectgallery;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.yiqihudong.imageutil.ContextManager;
import com.yiqihudong.imageutil.ImageSelectedHelper;
import com.yiqihudong.imageutil.utils.ImageLoaderUtil;
import com.yiqihudong.imageutil.view.ImageCropCallback;

import java.util.ArrayList;

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
    }
}
