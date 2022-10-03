package com.sai.lc.validator;

import com.sai.lc.api.CommunicationDTO;
import com.sai.lc.api.UserRegistrationDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmailValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
       return UserRegistrationDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"communicationDTO.email","userName.Empty","ema Cant be Empty");

       CommunicationDTO communicationDTO= ((UserRegistrationDTO)target).getCommunicationDTO();
       String userEmail = communicationDTO.getEmail();

       if (!userEmail.endsWith("@sai.com")){
           errors.rejectValue("communicationDTO.email","email.invalidString","String must contains sai.com");
       }

    }
}
