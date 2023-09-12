 package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities 
{

	public String getProperty(String key) throws IOException 
	{
		String spath = "/Users/harneetkaur/eclipse-workspace/CucumberFramework/properties/application.properties";
		FileInputStream fileinput = new FileInputStream(spath);
		
		Properties prop = new Properties();
		prop.load(fileinput);
		
		String value = prop.getProperty(key) ;
		return value;
	}

}
