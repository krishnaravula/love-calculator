package com.sai.lc.controllers;

import com.sai.lc.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.util.List;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO)
    {

        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String showResultPage (@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult bindingResult){


        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for(ObjectError temp:allErrors) {
                System.out.println(temp);
            }
            return "home-page";
        }
        return "result-page";
    }

}
