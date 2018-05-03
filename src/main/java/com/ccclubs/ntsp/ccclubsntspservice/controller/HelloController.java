package com.ccclubs.ntsp.ccclubsntspservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
/**
 * @author sunny
 * @class: com.ccclubs.ntsp.ccclubsntspservice.controller.HelloController
 * @date: 2018-05-03 11:14
 * @des: 测试代码
 */
@RestController
@RequestMapping("/say")
public class HelloController {

=======
@RestController
@RequestMapping("/say")
public class HelloController {
>>>>>>> 7b0614f5130c0c86ea8ccc4fc1dcdddc8ca4165a
  @GetMapping("say")
  public String say() {
    return "hello";
  }
}
