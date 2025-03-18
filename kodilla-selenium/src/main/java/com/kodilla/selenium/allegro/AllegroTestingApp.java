package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");    // [1]
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.ebay.pl/");

        WebElement categoryField = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        Select categorySelect = new Select(categoryField);
        categorySelect.selectByIndex(9);


        WebElement inputField = driver.findElement(By.name("_nkw")); // [4]
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}

