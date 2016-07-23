package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("vasu.584");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("PersistentCookie")).click();
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		System.out.println(check.getAttribute("checked"));
		if (check.isSelected())
		{
			
			check.click();
			System.out.println(check.getAttribute("checked"));
		}

	}

}
