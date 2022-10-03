package com.sai.lc.validator;

import com.sai.lc.api.UserRegistrationDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserNameValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
       return UserRegistrationDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","userName.Empty","Username Cant be Empty");

       String userName= ((UserRegistrationDTO)target).getUserName();

       if (!userName.contains("_")){
           errors.rejectValue("userName","userName.invalidString","String must contains _");
       }

    }
}
