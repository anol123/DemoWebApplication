package com.mySpringBootProject.demoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("login-form")
    public String loginForm(){
//        model.put("name", name);
//        model.put("password", password);
        return "loginForm";
    }
}
