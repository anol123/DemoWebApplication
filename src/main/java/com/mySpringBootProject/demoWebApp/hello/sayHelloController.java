package com.mySpringBootProject.demoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sayHelloController {

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }

    @RequestMapping("login")
    public String login_jsp(@RequestParam String name, String password, ModelMap model){
        model.put("name_1", name);
        System.out.println("Request param is " + name);
        return "login";
    }
}
