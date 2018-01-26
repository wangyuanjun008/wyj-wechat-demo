package com.wyj.wechart.message.resp;

/**
 * 语音消息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午1:52:49
 */
public class VoiceMessage extends BaseMessage {

    // 语音
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}
