package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;

/**
 * Created by dllo on 17/10/25.
 */
public class XMLAction extends ActionSupport{

    private String username;
    private String password;
    private String idcard;

    public String login(){
        ServletActionContext.getServletContext().setAttribute("user",username);
        return SUCCESS;
    }

    public String register(){
        return SUCCESS;
    }
    @SkipValidation
    public String findAll() throws Exception {
        return "success";
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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }


}
