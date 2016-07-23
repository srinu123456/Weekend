package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheck {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement check=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> checklist=check.findElements(By.tagName("input"));
		
		System.out.println(checklist.size());
		for (int i = 0; i <checklist.size(); i++) 
		{
			if (checklist.get(i).getText().equals("Butter")) 
			{
				checklist.get(i).click();
			}
			/*System.out.println(checklist.get(i).getAttribute("value")+"----"+checklist.get(i).getAttribute("checked"));
			checklist.get(i).click();*/
		}

	}

}
