package com.realtime.sample;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertandVerify {

	
	@Test
	public void testAssert()
	{
		String fname="dinesh";
		String fname1="reddy";
		try {
		Assert.assertEquals(fname1, fname);
		}catch(Error e) {
			
			System.out.println("missmatch");
		}
		System.out.println("please continue a program");
	}
}
