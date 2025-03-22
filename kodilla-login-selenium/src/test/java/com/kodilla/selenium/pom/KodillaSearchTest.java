package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaSearchTest {

    KodillaSearch kodillaSearch;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Holoc\\IdeaProjects\\Damian_Gawlik-kodilla_tester\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        kodillaSearch = new KodillaSearch(driver);
    }

    @Test
    public void testCaseInsensitiveSearch() {
        String phrase1 = "NoteBook";
        String phrase2 = "notebook";

        int result1 = kodillaSearch.searchForPhrase(phrase1);
        int result2 = kodillaSearch.searchForPhrase(phrase2);

        assertEquals(result1, result2);
    }

    @Test
    public void testNoteBook() {
        String phrase = "NoteBook";
        int search = kodillaSearch.searchForPhrase(phrase);
        assertEquals(2, search);
    }

    @Test
    public void testSchool() {
        String phrase = "School";
        int search = kodillaSearch.searchForPhrase(phrase);
        assertEquals(1, search);
    }

    @Test
    public void testBrand() {
        String phrase = "Brand";
        int search = kodillaSearch.searchForPhrase(phrase);
        assertEquals(1, search);
    }

    @Test
    public void testBusiness() {
        String phrase = "Business";
        int search = kodillaSearch.searchForPhrase(phrase);
        assertEquals(0, search);
    }

    @Test
    public void testGaming() {
        String phrase = "Gaming";
        int search = kodillaSearch.searchForPhrase(phrase);
        assertEquals(1, search);
    }

    @Test
    public void testPowerful() {
        String phrase = "Powerful";
        int search = kodillaSearch.searchForPhrase(phrase);
        assertEquals(0, search);

    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}
