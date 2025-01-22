package com.mySpringBootProject.demoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sayHelloController {

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
