package com.practies;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profile {

	public static void main(String[] args)
	{
		//Create Profile Object
		ProfilesIni pr=new ProfilesIni();
		//Create FireFox Profile Object Initiating to Profile Object 
		FirefoxProfile fp=pr.getProfile("neeraja");
		//Launching FireFox With Profile We Created
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("Http://Gmail.com");
		
	}

}
