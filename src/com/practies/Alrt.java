package com.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alrt {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("matchStartPlace")).sendKeys("HYDERABAD");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a/font")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();//Click on Ok
		//al.dismiss();  //Close the Alert

	}

}
