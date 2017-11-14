package com.paulliu.springcloud.learning.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liusonglin
 * Date:2017/11/14
 * Description:
 */
@Slf4j
@Component
public class MyAccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
//        pre：可以在请求被路由之前调用
//        routing：在路由请求时候被调用
//        post：在routing和error过滤器之后被调用
//        error：处理请求时发生错误时被调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return true;
    }
}
