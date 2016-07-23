package com.practies;

import org.openqa.selenium.ie.InternetExplorerDriver;



public class IeBrowser {

	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\admin\\Downloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("Http://yahoo.com");
	}

}
