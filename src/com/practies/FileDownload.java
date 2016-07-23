package com.practies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Seleniumhq.org");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
