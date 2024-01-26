package com.sportyshoes.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlaceOrderTest {

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
    public void testPlaceOrder() {
        // Click on the "Cart" button
        WebElement cartButton = driver.findElement(By.linkText("Cart"));
        cartButton.click();

        // Introduce a short delay (Not recommended in real-world scenarios)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the "Place Order" button
        WebElement placeOrderButton = driver.findElement(By.id("place-order")); // Replace with actual ID or selector
        placeOrderButton.click();

        // Introduce a short delay (Not recommended in real-world scenarios)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        

        // Print a success message
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        System.out.println(successMessage.getText());
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            //driver.quit();
        }
    }
}