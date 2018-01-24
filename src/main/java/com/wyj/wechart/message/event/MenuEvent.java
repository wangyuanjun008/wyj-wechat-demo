package com.wyj.wechart.message.event;
/**
 * 自定义菜单事件
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:39:34
 */
public class MenuEvent extends BaseEvent {
    // 事件KEY值，与自定义菜单接口中KEY值对应
    private String EventKey;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }
}
