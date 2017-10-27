package com.lanou.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by dllo on 17/10/25.
 */
public class LoginInterceptor extends MethodFilterInterceptor{
    @Override
    public String doIntercept(ActionInvocation invocation) throws Exception {
        //从Context中取出信息,如果能取出来,不进行拦截,取不出来就拦截到登录页面
        Object username = ServletActionContext.getServletContext().getAttribute("user");
        if (username == null) {
            return "login";
        }
        return invocation.invoke();
    }

}
