package com.testing.lambdatest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utility {

	public static void verify(String expectedvalue, String actualvalue) {
		
		if(expectedvalue.equalsIgnoreCase(actualvalue)) {
			System.out.print("the test is passed");
		}else {
			System.out.println("the test is failed");
		}	
		
	}
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}
	

	
	
	
	
	
}
