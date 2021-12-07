package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public String parseInput(String s){
        String array[] = s.split(" ");
        ArrayList<String> res = new ArrayList<>();
        res.add(array[0]);
        String c = array[1];
        for(int i = 2; i < array.length; i++){
            c = c + " " + array[i];
        }
        res.add(c);
        return res.get(1);
    }
}
