package com.ccclubs.ntsp.server.controller.pay.form;

import com.ccclubs.ntsp.server.core.common.form.NtspBaseForm;

import javax.validation.constraints.NotNull;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.controller.pay.form.PayForm
 * @date: 2018-05-04 10:18
 * @des:
 */
public class PayForm extends NtspBaseForm<String> {
    private static final long serialVersionUID = -4870696143840817989L;

    @NotNull(message = "字段amount不能为空")
    private Long amount;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
