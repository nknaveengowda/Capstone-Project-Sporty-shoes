package com.sportyshoes.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        driver = new ChromeDriver();
        
        driver.get("http://localhost:9010/");
    }

    @Test
    public void testLogin() {
        
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        // Provide login information
        emailInput.sendKeys("naveen@gmail.com");
        passwordInput.sendKeys("Password1234");

        // Click on the Login button
        loginButton.click();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            //driver.quit();
        }
    }
}