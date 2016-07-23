package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest4 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/");
		driver.manage().window().maximize();
		WebElement dist=driver.findElement(By.id("dist-option"));
		Select dstSelect=new Select(dist);
		//dstSelect.selectByIndex(9);
		//dstSelect.selectByValue("district/main.aspx?dsname=kadapa");
		dstSelect.selectByVisibleText("Kadapa");
	}

}
