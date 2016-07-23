package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Flipkart.com");
		driver.manage().window().maximize();
		WebElement women=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[3]/a/span[1]"));

		Actions mosuse=new Actions(driver);
		mosuse.moveToElement(women).build().perform();
		
	}

}
