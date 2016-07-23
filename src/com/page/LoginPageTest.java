package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest 
{
@Test
public void userLoginTest()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	
	LoginPage login_page=PageFactory.initElements(driver,LoginPage.class);
	login_page.login("Admin","admin");
	/*adminlogin login_page1=PageFactory.initElements(driver,adminlogin.class);
	login_page1.admin();*/
}
}
