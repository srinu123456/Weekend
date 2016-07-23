package com.testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public static void Login()
{
	String expName="Welcome Admin";
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrm.com/");
	driver.manage().window().maximize();
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
}
