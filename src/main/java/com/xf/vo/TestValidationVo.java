package com.xf.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

public class TestValidationVo {

    @Length(min = 6,max = 20,message = "用户名长度不合法")
    String userName;

    @Length(min = 6,max = 20,message = "密码长度不合法")
    String password;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$",message = "邮箱地址不合法")
    String regEmail;
    @Pattern(regexp = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$",message = "手机号码不合法")
    String mobile;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
