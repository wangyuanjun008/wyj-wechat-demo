package com.wyj.wechart.message.resp;
/**
 * 视频消息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:54:03
 */
public class VideoMessage extends BaseMessage {
    // 视频
    private Video Video;

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }
}
