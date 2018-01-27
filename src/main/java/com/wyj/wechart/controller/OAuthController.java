package com.wyj.wechart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wyj.wechart.pojo.SNSUserInfo;
import com.wyj.wechart.pojo.WeixinOauth2Token;
import com.wyj.wechart.utils.AdvancedUtil;
/**
 * 授权后的回调请求处理
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月27日 下午5:31:09
 */
@Controller
@RequestMapping("/oauth")
public class OAuthController {

    @RequestMapping()
    public ModelAndView index(String code,String state){
        ModelAndView mv = new ModelAndView("/index");
        
        // 用户同意授权
        if (!"authdeny".equals(code)) {
            // 获取网页授权access_token
            WeixinOauth2Token weixinOauth2Token = AdvancedUtil.getOauth2AccessToken("wx17fdedc3d6d0b68e", "c3b3d919d65a781ba7db58d9d8dfb515", code);
            // 网页授权接口访问凭证
            String accessToken = weixinOauth2Token.getAccessToken();
            // 用户标识
            String openId = weixinOauth2Token.getOpenId();
            // 获取用户信息
            SNSUserInfo snsUserInfo = AdvancedUtil.getSNSUserInfo(accessToken, openId);
            // 设置要传递的参数
            mv.addObject("snsUserInfo", snsUserInfo);
            mv.addObject("state", state);
        }
        return mv;
    }
    
}
