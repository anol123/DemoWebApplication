package com.mySpringBootProject.demoWebApp.todos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private static List<Todo> todolist = new ArrayList<>();
    private static int todoCount=0;

    static{
        todolist.add(new Todo(++todoCount, "anol","Spring", LocalDate.now().plusYears(1), false));
        todolist.add(new Todo(++todoCount, "asdf","Java", LocalDate.now().plusYears(2), false));
        todolist.add(new Todo(++todoCount, "xyzv","DevOps", LocalDate.now().plusYears(3), false));
    }

    public static List<Todo> listTodo(){
        return todolist;
    }

}
