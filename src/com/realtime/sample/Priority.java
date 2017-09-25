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

public class Priority {
	
		
	@Test(priority=5)
	public void method5()
	{
		System.out.println("this is method5");
	}
	
	@Test(priority=3)
	public void method3()
	{
		System.out.println("this is method3");
	}
	
	@Test(priority=1)
	public void method1()
	{
		System.out.println("this is method1");
	}
	
	@Test(priority=4)
	public void method4()
	{
		System.out.println("this is method4");
	}
	
	@Test(priority=2)
	public void method2()
	{
		System.out.println("this is method2");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is before test ");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("this is after test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("this is before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("this is after Suite");
	}
}
