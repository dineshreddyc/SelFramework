package com.realtime.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigateBrowser {
	
	WebDriver driver;
	
	@BeforeClass
	public void navigateBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://facebook.com");
	}
	
	@Test(priority=1)
	public void enterUserDetails()
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		
	}
	
	@Test(priority=2)
	public void enterPassword()
	{
		driver.findElement(By.id("pass")).sendKeys("hello");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
