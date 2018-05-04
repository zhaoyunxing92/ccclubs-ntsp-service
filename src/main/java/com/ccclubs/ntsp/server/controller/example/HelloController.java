package com.ccclubs.ntsp.server.controller.example;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunny
 * @class: HelloController
 * @date: 2018-05-03 11:14
 * @des: 测试代码
 */
@RestController
@RequestMapping("/example")
public class HelloController {
  @GetMapping("/say")
  public String say(@NotEmpty(message = "name不为空") String name) {
    return "hello " + name;
  }
}
