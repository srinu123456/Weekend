package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args)
	{
		String expTitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_P")).click();
		String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle)) 
		{
			System.out.println("Link IS Working Correctly");
		}else
		{
			System.out.println("Link IS Not Working Correctly");
		}

	}

}
