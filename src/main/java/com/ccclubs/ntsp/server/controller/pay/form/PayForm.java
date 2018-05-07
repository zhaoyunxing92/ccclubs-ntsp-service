package com.ccclubs.ntsp.server.controller.pay.form;

import com.ccclubs.ntsp.server.common.form.NtspBaseForm;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

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
