package com.sai.lc.controllers;

import com.sai.lc.api.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @RequestMapping("/sendEmail")
    public String sendEmail(@ModelAttribute EmailDTO emailDTO){
        return "send-email-page";
    }

    @RequestMapping("/process-email")
    public String processEmail(@ModelAttribute EmailDTO emailDTO){
        return "process-email-page";
    }
}
