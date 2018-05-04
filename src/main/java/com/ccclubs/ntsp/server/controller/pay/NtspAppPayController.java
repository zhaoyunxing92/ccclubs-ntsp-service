package com.ccclubs.ntsp.server.controller.pay;

import com.ccclubs.ntsp.server.common.enums.ResultEnum;
import com.ccclubs.ntsp.server.common.result.Result;
import com.ccclubs.ntsp.server.controller.pay.form.PayForm;
import com.ccclubs.ntsp.server.service.NTspPayService;
import com.ccclubs.ntsp.server.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
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

  @PostMapping("/wechat")
  public Result wechatPay(@Validated PayForm form) {
    return ResultUtil.success(ResultEnum.PAYSUCCESS);
  }
}
