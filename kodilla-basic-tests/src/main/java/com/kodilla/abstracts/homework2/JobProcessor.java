package com.kodilla.abstracts.homework2;

public class JobProcessor {
    public void process(Job job) {
        System.out.println(job.getjob() + " get per month " + job.getsalary() + " $");
        job.giveResponsibilities();
    }
}

