package top.jinhaoplus.wechathelper.wechat.api.response;

public class APIResponse extends ErrorResponse{
    /**
     * 是否获取到所需返回结果
     */
    public boolean aquired;

    public boolean getAquired() {
        return aquired;
    }

    public void setAquired(boolean aquired) {
        this.aquired = aquired;
    }
}
