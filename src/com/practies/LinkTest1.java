package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
		String	linkName=list.get(i).getText();
		if (linkName.equals("Settings"))
		{
			list.get(i).click();
		}
		}
	}

}
