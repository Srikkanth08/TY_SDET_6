package com.vtiger.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFiles 
{
	public String readDataFromPropertyfiles(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("../SDET_HYD_6/PropertieFiles.properties");
		Properties prop = new Properties();
		prop.load(fis);
		prop.getProperty(key);
		
		return prop.getProperty(key);
	}
}
