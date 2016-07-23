package com.practies;

import java.util.ArrayList;
import java.util.List;

public class ArraaL {

	public static void main(String[] args) 
	{
		
		List <String> l=new ArrayList <>();
		l.add("QTP");
		l.add("Selenium");
		l.add("LoadRunner");
		l.add("Jmeter");
		System.out.println(l.size());
		for (int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}

}
