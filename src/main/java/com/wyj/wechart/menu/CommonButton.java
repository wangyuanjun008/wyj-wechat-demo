package com.wyj.wechart.menu;
/**
 * 子菜单项 :没有子菜单的菜单项，有可能是二级菜单项，也有可能是不含二级菜单的一级菜单。
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午3:54:53
 */
public class CommonButton extends Button {
    
    private String type;
    
    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}