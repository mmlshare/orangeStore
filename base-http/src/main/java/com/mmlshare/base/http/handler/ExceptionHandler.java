package com.mmlshare.base.http.handler;

import com.mmlshare.base.beans.exception.CustomerRuntimeException;
import com.mmlshare.base.http.response.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public Response handException(CustomerRuntimeException exception) {
        return Response.createFailMsg(exception.getMessage());
    }
    
}
