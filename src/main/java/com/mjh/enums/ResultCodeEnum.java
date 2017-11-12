package com.mjh.enums;

/**
 * @author constantine on 2017/11/11
 */
public enum ResultCodeEnum {
    ERROR(-1,"发生了错误"),
    SUCCESS(1,"成功"),
    ;

    private Integer code;
    private String msg;

    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
