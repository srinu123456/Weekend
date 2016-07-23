package com.testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AfterTestBeforeTest 
{
	public static FirefoxDriver driver;
	public static String expName="Welcome Admin";
	
	@BeforeTest
	public static void Launch()
	{
		 driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public static void Login()
	{
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		String actName=driver.findElement(By.id("welcome")).getText();
		if (expName.equals(actName)) 
		{
			System.out.println("AdminLogin Successfully");
		}else
		{
			System.out.println("AdminLogin Fail");
		}
	}
	@AfterTest
	public static void Close()
	{
		driver.close();
	}

}
