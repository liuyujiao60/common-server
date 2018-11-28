package com.common.user.contant;

import com.server.core.exception.ExceptionEnums;

public enum UserExceptionEnums implements ExceptionEnums {

    USER_PARAM_ERROR("200001","用户参数异常");

    private String code;

    private String message;

    private UserExceptionEnums(String code,String message){
        this.code=code;
        this.message=message;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
