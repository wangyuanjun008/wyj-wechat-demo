package com.wyj.wechart.message.req;
/**
 * 请求消息之文本消息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:31:49
 */
public class TextMessage extends BaseMessage{
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
