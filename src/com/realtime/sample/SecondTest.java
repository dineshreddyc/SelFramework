package com.realtime.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
	
		
	@Test(priority=5)
	public void method5()
	{
		System.out.println("this is my second First method5");
	}
	
	@Test(priority=3)
	public void method3()
	{
		System.out.println("this is  first Second method3");
	}
	
	@Test(priority=1)
	public void method1()
	{
		System.out.println("this is first Second method1");
	}
	
	@Test(priority=4)
	public void method4()
	{
		System.out.println("this is first Second method4");
	}
	
	@Test(priority=2)
	public void method2()
	{
		System.out.println("this is first Second method2");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is first Second before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this is first Second after class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is first Second before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is first Second after method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is first Second before test ");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("this is first Second after test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("this is first Second test Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("this is first Second test Suite");
	}
}
