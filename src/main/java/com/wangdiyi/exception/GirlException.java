package com.wangdiyi.exception;

import com.wangdiyi.enums.ResultEnum;

/**
 * 只有runtime异常会进行事务回滚
 * Created by uas on 2017/5/24.
 */
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
