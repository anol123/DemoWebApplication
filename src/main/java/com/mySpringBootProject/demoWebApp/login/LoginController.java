package com.mySpringBootProject.demoWebApp.login;

import com.mySpringBootProject.demoWebApp.todos.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value="login-form",method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "loginForm";
    }

    @RequestMapping(value="login-form", method = RequestMethod.POST)
    public String loginForm(@RequestParam String name, @RequestParam String password, ModelMap model){
//        model.put("name", name);
//        model.put("password", password);
        //System.out.println("This is printed "+ name);
        return "loginForm";
    }

    @RequestMapping(value="list-todo", method=RequestMethod.GET)
    public String listTodos(ModelMap model ){
        TodoService todoService = new TodoService();
        model.put("listTodo", todoService.listTodo());
        return "listTodo";
    }
}
