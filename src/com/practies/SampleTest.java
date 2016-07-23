package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {

	
	public static void main(String[] args)
	{
		String expTitle="selenium - Yahoo India Search Results";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Yahoo.com");
		
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		driver.findElement(By.id("UHSearchWeb")).click();
		
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		if (expTitle.contains(actTitle)) 
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}

}
