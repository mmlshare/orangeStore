package com.mmlshare.auth.handler;

import com.mmlshare.base.http.response.Response;
import com.mmlshare.base.utils.text.json.FastJsonUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UrlAuthenticationFailHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        response.setContentType("application/json;charset=UTF-8");
        Response httpResponse = Response.createFailMsg(exception.getMessage());
        response.getWriter().write(FastJsonUtil.obj2Json(httpResponse));
    }
}
