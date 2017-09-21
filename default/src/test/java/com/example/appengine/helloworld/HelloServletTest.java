package com.example.appengine.helloworld;

import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HelloServletTest 
{	
	static WebDriver driver;
	@BeforeClass
	public void setUp() throws Exception {
		//driver = new FirefoxDriver();
		driver=new HtmlUnitDriver();
	}
	@AfterClass
	public static void cleanUp(){
		driver.quit();		
	}
	void setPoints(float[] d)
	{
		
	}
	@Test
	public void test() 
	{
		try
		{
			System.out.println("Entered Testing environmenet");
			driver.get("https://pubsub-1.appspot.com/");
			Assert.assertEquals("PapaJohns", driver.getTitle());
		}
		catch (Exception e) {
            e.printStackTrace();
		}
	}
}
