package com.ccclubs.ntsp.server.controller.pay;

import com.ccclubs.ntsp.server.controller.pay.from.PayFrom;
import com.ccclubs.ntsp.server.service.NTspPayService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("pay")
public class NtspAppPayController {
  @Autowired
  private NTspPayService nTspPayService;

  @PostMapping("/wechat")
  public String wechatPay(PayFrom from) {
    return "";
  }
}
