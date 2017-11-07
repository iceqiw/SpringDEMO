package org.ice.server.api.common.apicommon.vo;


import lombok.Data;

@Data
public class ResponseMsg {


    public static ResponseMsg success(String message, Object data) {
        return new ResponseMsg(0, message, data);
    }

    public static ResponseMsg success(String message) {
        return new ResponseMsg(0, message, "");
    }


    private Integer code;
    private String message;
    private Object data;

    public ResponseMsg(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
