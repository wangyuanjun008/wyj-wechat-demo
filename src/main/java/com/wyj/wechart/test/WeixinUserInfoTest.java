package com.wyj.wechart.test;

import org.junit.Test;

import com.wyj.wechart.pojo.WeixinUserInfo;
import com.wyj.wechart.utils.CommonUtil;
/**
 * 获取用户信息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月27日 下午11:01:40
 */
public class WeixinUserInfoTest {

    @Test
    public void testWeixinUserInfo() {

        // 获取接口访问凭证(替换为自己的appid和秘钥。)
        String accessToken = CommonUtil.getToken("xxxx", "xxxx").getAccessToken();
        /**
         * 获取用户信息
         */
        WeixinUserInfo user = CommonUtil.getUserInfo(accessToken, "OpenID");
        System.out.println("OpenID：" + user.getOpenId());
        System.out.println("关注状态：" + user.getSubscribe());
        System.out.println("关注时间：" + user.getSubscribeTime());
        System.out.println("昵称：" + user.getNickname());
        System.out.println("性别：" + user.getSex());
        System.out.println("国家：" + user.getCountry());
        System.out.println("省份：" + user.getProvince());
        System.out.println("城市：" + user.getCity());
        System.out.println("语言：" + user.getLanguage());
        System.out.println("头像：" + user.getHeadImgUrl());
    }

}
