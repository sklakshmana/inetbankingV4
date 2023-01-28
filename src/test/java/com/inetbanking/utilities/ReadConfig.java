package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties pro;
	
	public ReadConfig()
	{
		
		//System.out.println(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		File src=new File("./Configuration/config.properties");
		//File src=new File(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);			
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}				
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUserName()
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	public String getPassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	public String getChromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIepath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	public String getFirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}
