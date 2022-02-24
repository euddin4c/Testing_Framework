package com.lambdatest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Base{

	public static WebDriver dr;
	@BeforeMethod
	@Parameters("browser")
	public void OpenBrowsers(String browser) {
		dr=Browsers.OpenBrowser(browser);
		dr.manage().window().maximize();
		dr.get("https://accounts.lambdatest.com/login");
	}
	@AfterMethod
	public static void CloseBrowser() {
		dr.close();	
	}
	
	
	
	
}
