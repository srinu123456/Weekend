package com.testngsample;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTest 
{

	@Test(priority=3,enabled=false)
	public static void Gmail()
	{
		System.out.println("Gmail");
	}
	@Test(priority=1,enabled=false)
	public static void yahoo()
	{
		System.out.println("yahoo");
	}
	@Test(priority=2)
	public static void Facebook()
	{
		System.out.println("Facebook");
	}

	@BeforeMethod
	public static void Start()
	{
		System.out.println("Start");
	}
	
}
