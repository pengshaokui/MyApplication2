package com.example.pengsk.myapplication;

import android.util.Log;

/**
 * Created by pengsk on 2018/3/2.
 */

public class testA {
    public static void main(String[] args) {
        // 582df15de91b3f12d8e710073e43f4f81.001000200011234567890201601272224443777868048028634285QhdRsdj+sdjTDNdandroidcAKOVCNEvcwRtfL0com.netease.hyxd.yyxx.papaex1...ext2...http://sdkapi.papa91.com/pay/pay_callback/test

        String s = "582df15de91b3f12d8e710073e43f4f81.001000200011234567890201601272224443777868048028634285QhdRsdj+sdjTDNdandroidcAKOVCNEvcwRtfL0com.netease.hyxd.yyxx.papaex1...ext2...http://sdkapi.papa91.com/pay/pay_callback/test";
     String ss=   StringUtils.md5(s);
        Log.e("siugn= ",ss);
    }
}
