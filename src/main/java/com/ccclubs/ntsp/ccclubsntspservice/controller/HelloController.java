package com.ccclubs.ntsp.ccclubsntspservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.ccclubsntspservice.controller.HelloController
 * @date: 2018-05-03 11:14
 * @des: 测试代码
 */
@RestController
@RequestMapping("/say")
public class HelloController {
  @GetMapping("say")
  public String say() {
    return "hello";
  }
}
