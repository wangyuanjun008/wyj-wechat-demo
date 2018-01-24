package com.wyj.wechart.message.resp;
/**
 * 视频model
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:53:28
 */
public class Video {
    // 媒体文件id
    private String MediaId;
    // 缩略图的媒体id
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
