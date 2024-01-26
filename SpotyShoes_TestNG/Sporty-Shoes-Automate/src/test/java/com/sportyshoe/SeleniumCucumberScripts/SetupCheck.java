package com.sportyshoe.SeleniumCucumberScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test;

public class SetupCheck {




	@Test
	public void test_setup_selenium()
	{
		WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize(); driver.get("http://localhost:9010/");


		String text = driver.findElement(By.xpath("//div[@class='container mt- 3']/descendant::p[1]")).getText();


		System.out.println(text);


		System.out.println(driver.getTitle());
	}


}
