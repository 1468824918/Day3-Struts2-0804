package com.lanou.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by dllo on 17/10/25.
 */
public class TestInterceptor extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        long startTime=System.currentTimeMillis();
        System.out.println("拦截前");
        String result = invocation.invoke();
        System.out.println("拦截后");
        long endTime=System.currentTimeMillis();
        System.out.println("时间为:"+ (endTime-startTime) + "ms");
        return result;
    }
}
