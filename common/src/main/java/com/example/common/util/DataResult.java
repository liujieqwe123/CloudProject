package com.example.common.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DataResult<T> implements Serializable {
    private static  final Integer successCode = 0;
    private Integer code;
    private String message;

    @JsonProperty
    private T data;

    public DataResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public DataResult() {
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> DataResult success(T data){
        return new DataResult(successCode,"success",data);
    }

    public static <T> DataResult success(String msg,T data){
        return new DataResult(successCode,msg,data);
    }

    public static DataResult Void(){
        return new DataResult(successCode,"success",null);
    }


}
