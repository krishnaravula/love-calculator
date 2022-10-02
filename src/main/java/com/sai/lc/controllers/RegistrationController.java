package com.sai.lc.controllers;

import com.sai.lc.api.UserRegistrationDTO;
import com.sai.lc.propertyeditor.NamePropertyEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.text.*;
import java.util.Currency;
import java.util.Date;
import java.util.List;

@Controller
public class RegistrationController {

    @RequestMapping("/registration")
    public String setRegistrationUser(@ModelAttribute("userRegistrationInfo")UserRegistrationDTO userRegistrationDTO){
        return "registration-page";
    }

    @RequestMapping("/registration-sucess")
    public String registrationSucess(@Valid  @ModelAttribute("userRegistrationInfo")UserRegistrationDTO registrationDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();

            for (ObjectError error:allErrors){
                System.out.println(error);
            }
            return "registration-page";
        }
        return "registration-success";
    }

    @InitBinder
    public void testInitBinder(WebDataBinder binder){

//        binder.setDisallowedFields("name");
//        StringTrimmerEditor editor = new StringTrimmerEditor(true);
//        binder.registerCustomEditor(String.class,"name",editor);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor customDateEditor =new CustomDateEditor(dateFormat,true);
        binder.registerCustomEditor(Date.class,"dob",customDateEditor);


        NumberFormat numberFormat = new DecimalFormat("##,###.00");
        CustomNumberEditor customNumberEditor = new CustomNumberEditor(BigDecimal.class,numberFormat,true);
        binder.registerCustomEditor(BigDecimal.class,"netWorth",customNumberEditor);
        NamePropertyEditor nameEditor = new NamePropertyEditor();

        binder.registerCustomEditor(Currency.class,"currency",nameEditor);


    }
}
