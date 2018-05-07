package com.ccclubs.ntsp.server.controller.pay.form;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Class：WeChatPayForm
 * @Author：11212
 * @Date：2018/5/710:21
 * @Description：TODO
 **/
public class WeChatPayForm extends PayForm {
    @NotEmpty(message = "字段body必填")
    private String body;
    /**
     * 终端IP，用户端实际ip
     */
    @NotEmpty(message = "字段spbillCreateIp必填")
    private String spbillCreateIp;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }
}
