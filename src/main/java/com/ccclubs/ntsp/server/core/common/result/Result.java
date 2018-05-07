package com.ccclubs.ntsp.server.core.common.result;

import java.io.Serializable;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.core.common.result.Result
 * @date: 2018-05-04 10:55
 * @des:
 */
public class Result implements Serializable {
  private static final long serialVersionUID = -3521418231757012532L;

  private String message;
  private Boolean success;
  private String error;
  private String attach;
  private Object data;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getAttach() {
    return attach;
  }

  public void setAttach(String attach) {
    this.attach = attach;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
