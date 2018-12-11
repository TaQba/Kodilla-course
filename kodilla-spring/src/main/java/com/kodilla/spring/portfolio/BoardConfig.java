package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean
    @Scope("prototype")
    public TaskList getToDoList() {
         TaskList list = new TaskList();
         list.addTask("to do 1");
         list.addTask("to do 2");
         return list;
    }

    @Bean
    @Scope("prototype")
    public TaskList getDoneList() {
        TaskList list = new TaskList();
        list.addTask("done 1");
        list.addTask("done 2");
        list.addTask("done 3");
        return list;
    }

    @Bean
    @Scope("prototype")
    public TaskList getInProgressList() {
        TaskList list = new TaskList();
        list.addTask("progress 1");
        list.addTask("progress 2");
        list.addTask("progress 3");
        list.addTask("progress 4");
        return list;
    }

}
