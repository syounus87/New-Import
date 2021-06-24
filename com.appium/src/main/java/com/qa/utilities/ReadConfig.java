package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;

	public ReadConfig()
	{
		File src = new File("./src/main/resources/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getUserName()
	{
		String usr=prop.getProperty("username");
		return usr;
	}
	
	public String getpassword()
	{
		String pwd=prop.getProperty("password");
		return pwd;
	}
	
	public String getapppath()
	{
	String apppath=prop.getProperty("applicationpath");
	return apppath;
	}
}
