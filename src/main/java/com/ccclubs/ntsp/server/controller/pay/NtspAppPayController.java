package com.ccclubs.ntsp.server.controller.pay;

import com.ccclubs.ntsp.server.core.common.enums.ResultEnum;
import com.ccclubs.ntsp.server.core.common.result.Result;
import com.ccclubs.ntsp.server.controller.pay.form.AliPayForm;
import com.ccclubs.ntsp.server.controller.pay.form.WeChatPayForm;
import com.ccclubs.ntsp.server.service.NTspPayService;
import com.ccclubs.ntsp.server.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.controller.pay.NtspAppPayController
 * @date: 2018-05-04 10:10
 * @des:
 */
@RestController
@RequestMapping("/pay")
public class NtspAppPayController {
    @Autowired
    private NTspPayService nTspPayService;

    /**
     * 微信支付
     *
     * @param form
     * @return
     */
    @PostMapping("/wechatPay")
    public Result wechatPay(@RequestBody @Validated WeChatPayForm form) {
        Long amount = form.getAmount();
        String body = form.getBody();
        String spbillCreateIp = form.getSpbillCreateIp();
        return ResultUtil.success(ResultEnum.PAYSUCCESS);
    }

    /**
     * 支付宝支付
     *
     * @param form
     * @return
     */
    @PostMapping("/aliPay")
    public Result aliPay(@RequestBody @Validated AliPayForm form) {
        Long amount = form.getAmount();
        String subject = form.getSubject();
        return ResultUtil.success(ResultEnum.PAYSUCCESS);
    }
}
