package com.sportyshoes.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        // Navigate to the login page
        driver.get("http://localhost:9010/");

        // Login 
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        emailInput.sendKeys("naveen@gmail.com");
        passwordInput.sendKeys("Password1234");
        loginButton.click();
    }

    @Test
    public void testAddToCart() {
        // Navigate to the product page 
        //driver.get("http://localhost:9010/login");

        // Click on the "Add to Cart" button for product 
        WebElement addToCartButton = driver.findElement(By.id("cart201")); // ID or selector
        addToCartButton.click();

        // Introduce a short delay (Not recommended in real-world scenarios)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print successful addition message 
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        System.out.println(successMessage.getText());
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
           // driver.quit();
        }
    }
}