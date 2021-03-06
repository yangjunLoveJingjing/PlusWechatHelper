package top.jinhaoplus.wechathelper.wechat.message.replyers.impl;

import top.jinhaoplus.wechathelper.wechat.message.entity.passive.receive.ReceiveEventMessage;
import top.jinhaoplus.wechathelper.wechat.message.entity.passive.send.SendMessage;
import top.jinhaoplus.wechathelper.wechat.message.replyers.SimpleReplyer;

public abstract class InternalEventReplyer extends SimpleReplyer<ReceiveEventMessage> {

    @Override
    public SendMessage reply(ReceiveEventMessage receiveEventMessage, SendMessage defaultSendMessage) {
        defaultSendMessage = super.reply(receiveEventMessage, defaultSendMessage);
        return doReply(receiveEventMessage, defaultSendMessage);
    }

    public abstract SendMessage doReply(ReceiveEventMessage receiveEventMessage, SendMessage sendMessage);
}
