package com.wyj.wechart.message.resp;

/**
 * 音乐消息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:55:28
 */
public class MusicMessage extends BaseMessage {

    // 音乐
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        Music = music;
    }
}