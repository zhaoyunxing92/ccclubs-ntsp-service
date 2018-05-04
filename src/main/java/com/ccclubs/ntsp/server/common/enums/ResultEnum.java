package com.ccclubs.ntsp.server.common.enums;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.common.enums.ResultEnum
 * @date: 2018-05-04 11:04
 * @des:
 */
public enum ResultEnum {


  PAYSUCCESS(0, "支付成功"),

  PARAMETER_ERROR(100, "参数异常！"),

  SPRING_MVC_PARAMETER_IS_NULL_ERROR(200, "请求体为空！");

  private Integer code;
  private String msg;

  ResultEnum(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public Integer getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
