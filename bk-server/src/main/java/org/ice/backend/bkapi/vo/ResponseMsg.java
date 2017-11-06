package org.ice.backend.bkapi.vo;


import lombok.Data;

@Data
public class ResponseMsg {

    public ResponseMsg(int code, String message) {
        this.code=code;
        this.message=message;
    }

    public static  ResponseMsg success(String message){
        return new ResponseMsg(0,message);
    }

    private  Integer code;
    private String message;
}
