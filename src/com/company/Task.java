package com.company;


public class Task {
    String description;
    int identify;
    Status status;
    private static int counter = 1;

    public Task(String description, Status status) {
        this.description = description;
        this.identify = counter;
        this.status = status;
        counter ++;
    }

    @Override
    public String toString() {
        if (status.toString().equals("DONE")){
            return identify + " [x] " + description + " " + status;
        }
        else{
            return identify + " [ ] " + description + " " + status;
        }
    }
}
