package com.wyj.wechart.test;

import com.wyj.wechart.utils.CommonUtil;
/**
 * URL转码
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月27日 下午5:35:02
 */
public class TransCodeUrlTest {
    /**
     * 生成URL编码
     * 
     * @param args
     */
    public static void main(String[] args) {
        String source = "http://f35b322c.ngrok.io/oauth";
        System.out.println(CommonUtil.urlEncodeUTF8(source));
    }
}
