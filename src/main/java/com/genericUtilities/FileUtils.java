package com.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	
	/**
	 * This method is for reading data from properties file
	 * @param key
	 * @return
	 * @throws Exception
	 */

	public String readDataFromPropertyFile(String key) throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.Filepath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
		
		
	}
	
	
		
	}
	

