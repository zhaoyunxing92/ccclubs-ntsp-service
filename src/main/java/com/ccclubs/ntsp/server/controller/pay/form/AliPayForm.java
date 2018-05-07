package com.ccclubs.ntsp.server.controller.pay.form;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Class：AliPayForm
 * @Author：11212
 * @Date：2018/5/710:15
 * @Description：TODO
 **/
public class AliPayForm extends PayForm {

    @NotEmpty(message = "字段subject必填")
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
