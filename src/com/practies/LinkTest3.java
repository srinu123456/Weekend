package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest3 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Bing.com");
		driver.manage().window().maximize();
		WebElement header=driver.findElement(By.className("sw_tb"));
		List<WebElement> headerlist=header.findElements(By.tagName("a"));
		System.out.println(headerlist.size());
		for (int i = 0; i < headerlist.size(); i++) 
		{
			System.out.println(headerlist.get(i).getText());
		}
		

	}

}
