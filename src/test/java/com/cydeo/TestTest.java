package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class TestTest {
    static WebDriver driver;


    /**
     * Method to setup webdriver
     */
    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    /**
     * Method to kill web driver
     */
    @AfterAll
    static void killDriver() {
        driver.close();
    }

    /**
     * Sample test
     */
    @Test
    public void checkGmailLink() {
        driver.get("https://www.google.com/");

       WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));

       assertEquals(gmailLink.getText(), "Gmail");
   }

}
