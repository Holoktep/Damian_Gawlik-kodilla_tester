package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaSearch extends AbstractSearch {

    @FindBy(css = "input[type='text']")
    private WebElement searchField;

    @FindBy(css = "#elements-wrapper .description")
    private List<WebElement> searchResults;

    public KodillaSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int searchForPhrase(String phrase) {
        searchField.clear();
        searchField.sendKeys(phrase);
        return searchResults.size();
    }
}








