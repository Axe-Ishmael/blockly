package com.google.blockly.android.demo.Post_receive;

/**
 * Created by admin on 2017/7/25.
 */

public class uploadReceive {
    public String status;
    public String errMsg;
//    public JSONObject jsonObject;   现在没用 为以后扩展做准备


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
