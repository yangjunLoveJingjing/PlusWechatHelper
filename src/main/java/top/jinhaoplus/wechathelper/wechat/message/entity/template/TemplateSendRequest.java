package top.jinhaoplus.wechathelper.wechat.message.entity.template;

import java.util.Map;

public class TemplateSendRequest {
    //接收者openid
    private String touser;
    //模板ID
    private String template_id;
    //模板跳转链接
    private String url;
    //跳小程序所需数据,不需跳小程序可不用传该数据
    private MiniProgram miniprogram;
    //模板数据
    private Map<String, TemplateDataItem> data;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MiniProgram getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(MiniProgram miniprogram) {
        this.miniprogram = miniprogram;
    }

    public Map<String, TemplateDataItem> getData() {
        return data;
    }

    public void setData(Map<String, TemplateDataItem> data) {
        this.data = data;
    }
}
