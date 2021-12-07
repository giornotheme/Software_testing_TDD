package com.company;

import java.util.ArrayList;

public class TaskManager {

    public String parseInput(String s){
        String[] array = s.split(" ");
        ArrayList<String> res = new ArrayList<>();
        res.add(array[0]);
        StringBuilder c = new StringBuilder(array[1]);
        for(int i = 2; i < array.length; i++){
            c.append(" ").append(array[i]);
        }
        res.add(c.toString());
        return res.get(1);
    }
}
