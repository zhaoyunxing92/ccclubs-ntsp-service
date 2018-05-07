package com.ccclubs.ntsp.server.core.config.handler;

import com.ccclubs.ntsp.server.core.common.enums.ResultEnum;
import com.ccclubs.ntsp.server.core.common.result.Result;
import com.ccclubs.ntsp.server.util.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.core.config.handler.NtspAppGlobalExceptionHandler
 * @date: 2018-05-04 0:19
 * @des: 统一异常处理
 */
@ControllerAdvice
@ResponseBody
public class NtspAppGlobalExceptionHandler {
  // 定义要处理的异常类
  @ExceptionHandler({BindException.class, MethodArgumentNotValidException.class, HttpMessageNotReadableException.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Result validExceptionHandle(Exception ex) {

    if (ex instanceof BindException) {
      BindException bingException = (BindException) ex;
      return ResultUtil.error(ResultEnum.PARAMETER_ERROR, bingException.getAllErrors());
    } else if (ex instanceof MethodArgumentNotValidException) {
      MethodArgumentNotValidException methodArgumentNotValidException = (MethodArgumentNotValidException) ex;
      return ResultUtil.error(ResultEnum.PARAMETER_ERROR, methodArgumentNotValidException.getBindingResult().getAllErrors());
    } else if (ex instanceof HttpMessageNotReadableException) {
      HttpMessageNotReadableException httpMessageNotReadableException = (HttpMessageNotReadableException) ex;

      return ResultUtil.error(ResultEnum.SPRING_MVC_PARAMETER_IS_NULL_ERROR.getCode(), httpMessageNotReadableException.getMessage());
    } else {
      return ResultUtil.error(ResultEnum.PARAMETER_ERROR, ex.getMessage());
    }

  }

  //org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' not supported
  @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Result ExceptionHandle(HttpRequestMethodNotSupportedException ex) {
    return ResultUtil.error(ResultEnum.PARAMETER_ERROR, ex.getMessage());
  }
}
