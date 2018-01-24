package com.wyj.wechart.message.resp;
/**
 * 图片消息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:51:36
 */
public class ImageMessage extends BaseMessage {
    
    private Image Image;

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}