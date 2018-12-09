package com.kodilla.spring.portfolio;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void checkBoardConfigurator() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList list = board.getToDoList();
        TaskList listDone = board.getDoneList();
        TaskList listInPro = board.getInProgressList();
        
        //Then
        Assert.assertEquals(2, list.getSize());
        Assert.assertEquals(3, listDone.getSize());
        Assert.assertEquals(4, listInPro.getSize());
    }


    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList list = board.getToDoList();
        list.addTask("Last to do");
        TaskList listDone = board.getDoneList();
        listDone.addTask("Last done");
        TaskList listInPro = board.getInProgressList();
        listInPro.addTask("Last in progress");

        //Then
        Assert.assertEquals("Last to do", list.getList().get(list.getSize()-1));
        Assert.assertEquals("Last done", listDone.getList().get(listDone.getSize()-1));
        Assert.assertEquals("Last in progress", listInPro.getList().get(listInPro.getSize()-1));
    }

}
