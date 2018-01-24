package com.wyj.wechart.message.req;
/**
 * 请求消息之视频消息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:43:10
 */
public class VideoMessage  extends BaseMessage{

    // 视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
    private String MediaId;
    // 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }
    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
    public String getThumbMediaId() {
        return ThumbMediaId;
    }
    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
    
    
    
}
