package com.sportyshoes.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Initialize WebDriver
		driver = new ChromeDriver();
		// Navigate to the registration page
		driver.get("http://localhost:9010/register");
	}

	@Test
	public void testRegistration() {
		
		WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Provide registration information
		WebElement nameInput = driver.findElement(By.id("name"));
		WebElement emailInput = driver.findElement(By.id("email"));
		WebElement passwordInput = driver.findElement(By.id("password"));

		nameInput.sendKeys("Naveen");
		emailInput.sendKeys("naveen@gmail.com");
		passwordInput.sendKeys("Password1234");

		// Click on the Register button
		registerButton.click();
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			//driver.quit();
		}
	}
}