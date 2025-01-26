package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task{
    public TaskHacked (String task, int duration) {
        super(task, duration);
    }
    public void modifyDuration(int newDuration) {
        duration = newDuration;
    }
}
