package com.ccclubs.ntsp.server.util;

import com.ccclubs.ntsp.server.common.enums.ResultEnum;
import com.ccclubs.ntsp.server.common.result.Result;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.util.ResultUtil
 * @date: 2018-05-04 10:54
 * @des:
 */
public class ResultUtil {
  /**
   * @param resultEnum
   * @param object
   * @return
   */
  public static Result success(ResultEnum resultEnum, Object object) {
    Result result = new Result();
    result.setSuccess(true);
    result.setData(object);
    return result;
  }

  /**
   * @param resultEnum
   * @return
   */
  public static Result success(ResultEnum resultEnum) {
    Result result = new Result();

    // result.setData (null);
    return result;
  }

  /**
   * 错误
   *
   * @param resultEnum
   * @return
   */
  public static Result error(ResultEnum resultEnum) {
    Result result = new Result();
    result.setSuccess(false);
    // result.setData (null);
    return result;
  }

  /**
   * 错误
   *
   * @param resultEnum
   * @param msg
   * @return
   */
  public static Result error(ResultEnum resultEnum, List<ObjectError> msg) {
    Result result = new Result();
    result.setSuccess(false);
    result.setMessage(errorsToString(msg));
    // result.setData (null);
    return result;
  }

  /**
   * 错误
   *
   * @param resultEnum
   * @param msg
   * @return
   */
  public static Result error(ResultEnum resultEnum, String msg) {
    Result result = new Result();
    result.setSuccess(false);
    result.setMessage(msg);
    // result.setData (null);
    return result;
  }

  /**
   * 错误的状态码
   *
   * @param code
   * @param msg
   * @return
   */
  public static Result error(Integer code, String msg) {
    Result result = new Result();
    result.setSuccess(false);
    result.setMessage(msg);
    return result;
  }

  /**
   * @param errors
   * @return
   */
  public static String errorsToString(List<ObjectError> errors) {
    StringBuilder errorsStr = new StringBuilder();
    if (errors.isEmpty()) {
      return errorsStr.toString();
    }
    for (ObjectError error : errors) {
      errorsStr.append(error.getDefaultMessage()).append(",");
    }
    return errorsStr.substring(0, errorsStr.lastIndexOf(","));
  }

}
