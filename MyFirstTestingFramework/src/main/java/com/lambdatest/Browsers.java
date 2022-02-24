package com.lambdatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class Browsers extends Base{
	
	public static WebDriver dr;
	public static WebDriver OpenBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdsaj\\OneDrive\\Desktop\\MyFirstTestingFramework\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();}
		else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sdsaj\\OneDrive\\Desktop\\MyFirstTestingFramework\\Drivers\\geckodriver.exe");
		dr=new FirefoxDriver();}
		else if(Browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sdsaj\\OneDrive\\Desktop\\MyFirstTestingFramework\\Drivers\\msedgedriver.exe");
		dr=new EdgeDriver();
		}
		else {
			System.out.println("You have entered wrong web browser key");
		}
		return dr;
	}
	

}
