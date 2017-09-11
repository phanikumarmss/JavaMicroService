package com.example.appengine.helloworld;

import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class HelloServletTest 
{	
	static WebDriver driver;
	@BeforeClass
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}
	@AfterClass
	public static void cleanUp(){
		driver.quit();		
	}
	@Test
	public void test() 
	{
		try
		{
			System.out.println("Entered Testing environmenet");
			driver.get("https://pubsub-1.appspot.com/");
			Assert.assertEquals("PapaJohns", driver.getTitle());
			//Assert.fail("Not yet implemented");
		}
		catch (Exception e) {
            e.printStackTrace();
		}
	}
}