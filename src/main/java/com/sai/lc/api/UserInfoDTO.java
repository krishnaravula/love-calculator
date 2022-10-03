package com.sai.lc.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

    @NotBlank(message = "* User Name cant be blank")
    @Size(min = 3,max = 30,message = "{userName.size}")
    private String userName;

    private String crushName;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
