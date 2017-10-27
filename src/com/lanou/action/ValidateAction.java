package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.validation.SkipValidation;

/**
 * Created by dllo on 17/10/25.
 */
public class ValidateAction extends ActionSupport {
    private String username;
    private String password;

    /**
     * 该方法会先于所有的Action方法执行
     * 在该方法中对表单数据进行合法验证
     * 如果验证通过会继续执行Action方法
     * 如果验证不通过,默认会返回input
     */
    @Override
    public void validate() {
        super.validate();

        if (StringUtils.isBlank(username)){
            //验证没通过
            //向系统中加入错误信息
            addFieldError("username","用户名不能为空");
            //第二种加错误的方式
            addActionError("赶紧填入密码");
        }
        if (StringUtils.isBlank(password)){
            addFieldError("password","密码不能为空");
        }
    }

    public String login() {
        System.out.println("username"+username);
        return SUCCESS;
    }

    /**
     * 用来标记某个action方法不需要验证 跳过验证
     * @return
     */
    @SkipValidation
    public String findAll(){
        System.out.println("findAll 已被调用");
        return SUCCESS;
    }


    public String register(){
        return SUCCESS;
    }
    //针对某个方法进行验证
    public void validateRegister(){
        System.out.println("验证注册方法");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
