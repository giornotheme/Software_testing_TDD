package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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


}