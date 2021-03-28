package com.Tata.Nexon.utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericFunctions {

	static FileInputStream fis;

	public static String GetCurrentMethodName() 
	{
		StackTraceElement[] CurrentMethodName = Thread.currentThread().getStackTrace();
		return CurrentMethodName.toString();
	}

	public static String ReadProperty(String Key) throws IOException {
		String Property = null;
		try {
		 fis = new FileInputStream(
				"C:\\Users\\Dhananjay\\eclipse-workspace\\Jarvis\\Nexon\\src\\test\\java\\com\\Tata\\Nexon\\Data\\ConfigProperties.properties");
		Properties prop = new Properties();
		prop.load(fis);
		 Property = prop.getProperty(Key);
		
		}
		catch (Exception e)
		{
			System.out.println("Unable to Read the file because of "+e.toString());
		}
		return Property;
	}
	
}
