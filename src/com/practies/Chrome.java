package com.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");

		ChromeDriver d=new ChromeDriver();
		d.get("Http://FaceBook.com");
	}

}
