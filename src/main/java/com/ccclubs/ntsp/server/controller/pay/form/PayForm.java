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
  @NotNull(message = "字段【money】不能为空")
  @Range(min = 1, max = 100, message = "金额在{min}~{max}之间")
  private Long money;

  @NotNull(message = "字段【time】不能为空")
  @Past(message = "时间只能是过去格式")
  private Date time;

  @NotEmpty(message = "用户名必填")
  @Length(max = 20, min = 6, message = "用户名在{min}~{max}之间")
  private String username;


  public Long getMoney() {
    return money;
  }

  public void setMoney(Long money) {
    this.money = money;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
