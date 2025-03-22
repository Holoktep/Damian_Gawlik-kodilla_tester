package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;

public abstract class AbstractSearch {
    protected WebDriver driver;

    public AbstractSearch(WebDriver driver){
        this.driver = driver;
    }
}
