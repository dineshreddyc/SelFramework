package com.realtime.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertestng {
	
	
	@Parameters({"first-name","last-name"})
	@Test
	public void methodParameter(String fn, String ln)
	{
		System.out.println("parameter Example data(" +fn+" " +ln+  ")");
	}

}
