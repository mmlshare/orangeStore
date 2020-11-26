package com.mmlshare.auth.handler;

import com.mmlshare.base.http.response.Response;
import com.mmlshare.base.utils.text.json.FastJsonUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UrlAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        Response httpResponse = Response.createSuccessMsg("登陆成功");
        response.getWriter().write(FastJsonUtil.obj2Json(httpResponse));
    }
}
