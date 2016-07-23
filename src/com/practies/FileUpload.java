package com.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://tinypic.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(".//*[@id='the_file']")).sendKeys("D:\\vasu.txt");
		
		driver.findElement(By.xpath(".//*[@id='the_file']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\upload.exe");
	}

}
