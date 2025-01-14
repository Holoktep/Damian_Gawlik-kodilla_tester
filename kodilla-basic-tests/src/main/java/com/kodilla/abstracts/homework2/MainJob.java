package com.kodilla.abstracts.homework2;

public class MainJob {
    public static void main(String[] args) {
        Job driver = new Driver();
        Job plumber = new Plumber();

        JobProcessor processor = new JobProcessor();
        processor.process(driver);

        processor = new JobProcessor();
        processor.process(plumber);

        Person person1 = new Person("Tomek", 34, plumber);
        person1.show();

    }
}
