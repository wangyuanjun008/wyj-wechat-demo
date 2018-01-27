package com.wyj.wechart.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wyj.wechart.menu.Button;
import com.wyj.wechart.menu.CommonButton;
import com.wyj.wechart.menu.ComplexButton;
import com.wyj.wechart.menu.Menu;
import com.wyj.wechart.pojo.AccessToken;
import com.wyj.wechart.utils.WeixinUtil;
/**
 * 菜单管理器类
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午4:12:08
 */
public class MenuManager {
    private static Logger log = LoggerFactory.getLogger(MenuManager.class);

    public static void main(String[] args) {
        // 第三方用户唯一凭证
        String appId = "wx17fdedc3d6d0b68e";
        // 第三方用户唯一凭证密钥
        String appSecret = "c3b3d919d65a781ba7db58d9d8dfb515";

        // 调用接口获取access_token
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);

        if (null != at) {
            // 调用接口创建菜单
            int result = WeixinUtil.createMenu(getMenu(), at.getToken());

            // 判断菜单创建结果
            if (0 == result)
                log.info("菜单创建成功！");
            else
                log.info("菜单创建失败，错误码：" + result);
        }
    }

    /**
     * 组装菜单数据
     * 
     * @return
     */
    private static Menu getMenu() {
        CommonButton btn11 = new CommonButton();
        btn11.setName("天气预报");
        btn11.setType("view");
        btn11.setKey("11");
        btn11.setUrl("http://www.weather.com.cn/weather/101190101.shtml");

        CommonButton btn12 = new CommonButton();
        btn12.setName("公交查询");
        btn12.setType("view");
        btn12.setKey("12");
        btn12.setUrl("http://www.gongjiao.com/");
        
        CommonButton btn13 = new CommonButton();
        btn13.setName("百度地图");
        btn13.setType("view");
        btn13.setKey("13");
        btn13.setUrl("https://map.baidu.com/");
        
        CommonButton btn14 = new CommonButton();
        btn14.setName("滴滴出行");
        btn14.setType("click");
        btn14.setKey("14");

        CommonButton btn21 = new CommonButton();
        btn21.setName("csdn");
        btn21.setType("click");
        btn21.setKey("21");

        CommonButton btn22 = new CommonButton();
        btn22.setName("博客园");
        btn22.setType("click");
        btn22.setKey("22");

        CommonButton btn23 = new CommonButton();
        btn23.setName("开发头条");
        btn23.setType("click");
        btn23.setKey("23");

        CommonButton btn24 = new CommonButton();
        btn24.setName("云栖社区");
        btn24.setType("click");
        btn24.setKey("24");

        CommonButton btn25 = new CommonButton();
        btn25.setName("github");
        btn25.setType("click");
        btn25.setKey("25");

        CommonButton btn31 = new CommonButton();
        btn31.setName("淘宝网");
        btn31.setType("click");
        btn31.setKey("31");

        CommonButton btn32 = new CommonButton();
        btn32.setName("电影天堂");
        btn32.setType("click");
        btn32.setKey("32");

        CommonButton btn33 = new CommonButton();
        btn33.setName("小游戏");
        btn33.setType("click");
        btn33.setKey("33");

        
        /**
         * 微信：  mainBtn1,mainBtn2,mainBtn3底部的三个一级菜单。
         */
        
        ComplexButton mainBtn1 = new ComplexButton();
        mainBtn1.setName("生活便利");
        //一级下有4个子菜单
        mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13, btn14 });
        
        ComplexButton mainBtn2 = new ComplexButton();
        mainBtn2.setName("学习社区");
        mainBtn2.setSub_button(new CommonButton[] { btn21, btn22, btn23, btn24, btn25 });

        
        ComplexButton mainBtn3 = new ComplexButton();
        mainBtn3.setName("娱乐一下");
        mainBtn3.setSub_button(new CommonButton[] { btn31, btn32, btn33 });

        
        /**
         * 封装整个菜单
         */
        Menu menu = new Menu();
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

        return menu;
    }
}