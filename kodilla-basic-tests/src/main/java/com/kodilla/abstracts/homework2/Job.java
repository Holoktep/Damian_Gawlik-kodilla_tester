package com.kodilla.abstracts.homework2;

public abstract class Job {
    private int salary;
    private String job;

    public Job (int salary, String job) {
        this.salary = salary;
        this.job = job;
    }

    public int getsalary() {
        return salary;
    }

    public String getjob() {
        return job;
    }

    public abstract void giveResponsibilities(); {

    }
}
