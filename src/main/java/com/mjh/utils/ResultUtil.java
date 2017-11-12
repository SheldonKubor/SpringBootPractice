package com.mjh.utils;

import com.mjh.model.Result;

/**
 * @author constantine on 2017/11/11
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setResultCode(1);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setMsg("error");
        result.setResultCode(-1);
        return result;
    }
}
