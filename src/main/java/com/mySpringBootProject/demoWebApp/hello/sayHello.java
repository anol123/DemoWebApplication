package com.mySpringBootProject.demoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHello {

    @RequestMapping("say-hello")
    public String sayHello(){
        return "sayHello";
    }
}
