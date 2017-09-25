package com.realtime.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;
	
	@Test
	public void chromeBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://facebook.com");
	}
	
	@Test
	public void firefoxBrowser()
	{
	System.setProperty("webdriver.gecko.driver", "G:\\Selenium\\Downloads\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://google.com");
	}
	
	@Test
	public void edgeBrowser()
	{
	System.setProperty("webdriver.edge.driver", "G:\\Selenium\\Downloads\\Selenium 3.4\\MicrosoftWebDriver.exe");
	driver=new EdgeDriver();
	driver.get("https://flipkart.com");
	}

}
