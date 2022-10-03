package com.sai.lc.api;

import javax.validation.constraints.Email;

public class CommunicationDTO {

    @Email(message = "please give a valid Email")
    private String email;

    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
