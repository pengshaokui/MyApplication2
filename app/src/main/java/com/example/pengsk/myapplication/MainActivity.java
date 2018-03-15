package com.example.pengsk.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.text);
        ShareSDK.initSDK(this);
        String mo="10";
        text.setText(Integer.parseInt(mo) / 100f + "");
//        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");
//        UMConfigure.init(this, "58edcfeb310c93091c000be2", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");
        Button butn = findViewById(R.id.butn);

//        butn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int  d = new Random().nextInt(3);

//                text.setText(d + "   " + (int) d);
//            }
//        });
//        A a=new A();
//        String[]  strings=new String[]{"http:xxxxxx","ww.baidu"};
//        a.addData(strings);
//                PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                new ShareAction(MainActivity.this).withText("hello")
//                        .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN)
//                        .setCallback(new UMShareListener() {
//                            @Override
//                            public void onStart(SHARE_MEDIA share_media) {
//
//                            }
//
//                            @Override
//                            public void onResult(SHARE_MEDIA share_media) {
//
//                            }
//
//                            @Override
//                            public void onError(SHARE_MEDIA share_media, Throwable throwable) {
//
//                            }
//
//                            @Override
//                            public void onCancel(SHARE_MEDIA share_media) {
//
//                            }
//                        }).open();
                SinaWeibo.ShareParams sinasp = new SinaWeibo.ShareParams();
                sinasp.setText("ceshi ");
                sinasp.setImageUrl("http://d.hiphotos.baidu.com/image/pic/item/8601a18b87d6277fcdb9b01d24381f30e924fc68.jpg");

                Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);
                setShareCallback(MainActivity.this, weibo, 1);
// 执行图文分享
                weibo.share(sinasp);

            }
        });
    }
    public static void setShareCallback(final Context context, Platform platform, final int from) {
        if (platform == null) return;
        try {
            platform.setPlatformActionListener(new PlatformActionListener() {
                @Override
                public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                }

                @Override
                public void onError(Platform platform, int i, Throwable throwable) {
                }

                @Override
                public void onCancel(Platform platform, int i) {
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    class  A{
        private List<String[]>  imgList;

        public List<String[]> getImgList() {
            return imgList;
        }

        public void setImgList(List<String[]> imgList) {
            this.imgList = imgList;
        }

        private void addData(String[] strings){

            imgList.add(strings);
        }

    }
}
