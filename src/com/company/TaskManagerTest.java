package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TaskManagerTest {

    @Test
    void parseInputAdd() {
        //Arrange
        String expectedOutput = "Learn Python";
        TaskManager tm = new TaskManager();
        //Act

        //Assert
        assertEquals(expectedOutput, tm.parseInput("+ Learn Python"));
    }
    @Test
    void updateTaskList(){
        TaskManager tm = new TaskManager();
        Task t1 = new Task("Learn Python", Status.TO_DO);
        Task t2 = new Task("Learn TDD", Status.TO_DO);
        ArrayList<Task> expected_task_list = new ArrayList<>();
        expected_task_list.add(t1);
        expected_task_list.add(t2);
        tm.updateList(expected_task_list);

        assertEquals(expected_task_list, tm.getTaskList());
    }
}