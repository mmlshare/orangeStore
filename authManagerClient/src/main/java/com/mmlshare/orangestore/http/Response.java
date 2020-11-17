package com.mmlshare.orangestore.http;


public class Response {
    private int status;
    private String msg;
    private Object data;

    private final static int SUCCESS_STATUS = 0;
    private final static int FAIL_STATUS = 0;

    public Response(int status, String msg, Object data) {

        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Response() {
    }

    public final static Response createSuccessMsg(String msg) {
        return new Response(SUCCESS_STATUS, msg, null);
    }

    public final static Response createSuccessMsgWithData(String msg, Object data) {
        return new Response(SUCCESS_STATUS, msg, data);
    }

    public final static Response createFailMsg(String msg) {
        return new Response(FAIL_STATUS, msg, null);
    }

    public final static Response createFailMsgWithMsg(String msg, Object data) {
        return new Response(FAIL_STATUS, msg, data);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
