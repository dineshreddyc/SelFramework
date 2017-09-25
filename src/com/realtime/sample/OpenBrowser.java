package com.realtime.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
	}

}
