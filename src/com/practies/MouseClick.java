package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Flipkart.com");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]/a/span[1]"));
		WebElement asus=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[1]/ul/li[7]/a/span"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		mouse.moveToElement(asus).click().build().perform();

	}

}
