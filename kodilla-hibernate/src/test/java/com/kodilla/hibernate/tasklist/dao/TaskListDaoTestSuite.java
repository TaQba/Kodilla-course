package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test: Task List NAME";
    private static final String DESCRIPTION = "Test: Task List DESCRIPTION";

    @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList task = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(task);

        //Then
        int id = task.getId();
        TaskList readTask = taskListDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());

        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoFindByListName() {
        //Given
        TaskList tasklist = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(tasklist);
        String listName = tasklist.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.delete(id);
    }
}
