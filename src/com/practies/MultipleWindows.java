package com.practies;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		String homePage=driver.getWindowHandle();
		System.out.println(homePage);
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
	 Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator iterator=windows.iterator();
		
		while (iterator.hasNext())
		{
			String currentwindowId=iterator.next().toString();
			if (!currentwindowId.equals(homePage))
			{
				driver.switchTo().window(currentwindowId);
				driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a/img")).click();
			}
			
		}

	}

}
