package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		List<WebElement> list=driver.findElements(By.xpath(".//*[starts-with(@id,'yui_3_12_0_1_1468664')]/a"));
		System.out.println(list.size());
		list.get(0).click();
			}

}
