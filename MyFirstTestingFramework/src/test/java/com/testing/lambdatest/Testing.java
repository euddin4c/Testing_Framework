package com.testing.lambdatest;

import org.apache.commons.math3.analysis.function.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lambdatest.Base;
@Listeners(com.lambdatest.ItestListener.class)
public class Testing extends Base{
	private static Logger log=Utility.getLog(Utility.class);

	@Test(priority=1)
	public static void RealCredentials() {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		String actualvalue=dr.getTitle();
		String expectedvalue="Welcome - LambdaTest";
		log.info("real credentials");
		Utility.verify(expectedvalue, actualvalue);	
	}
	@Test(priority=2)
	public static void FakeCredentials() {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb96@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wY");
		dr.findElement(By.id("login-button")).click();
		String actualvalue=dr.getTitle();
		String expectedvalue="Welcome - LambdaTest";
		System.out.println("fake credentials");
		Utility.verify(expectedvalue, actualvalue);	
	}
	@Test(priority=3)
	public static void RealTimeTabCheck() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/a")).click();
		String actualvalue=dr.getTitle();
		String expectedvalue="Realtime Browser Test";
		log.info("real time testing tab");
		Utility.verify(expectedvalue, actualvalue);
		
		
	}
	@Test(priority=4)
	public static void LTBrowserTabCheck() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[5]/a[2]")).click();
		String actualvalue=dr.getTitle();
		String expectedvalue="Lambdatest";
		log.info("LT browser tab check");
		Utility.verify(expectedvalue, actualvalue);
	}
	@Test(priority=5)
	public static void TestLogTabCheck() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[7]/a")).click();
		String actualvalue=dr.getTitle();
		String expectedvalue="Test Logs";
		log.info("test log tab check");
		Utility.verify(expectedvalue, actualvalue);
	
	
	
	
}
	@Test(priority=6)	
	public static void IssueTrackerTab() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[8]/a")).click();
		Thread.sleep(4000);
		String actualvalue=dr.getTitle();
		String expectedvalue="Lambdatest";
		log.info("issue tracker tab check");
		Utility.verify(expectedvalue, actualvalue);

}

	@Test(priority=7)	
	public static void IntregationTab() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[9]/a")).click();
		Thread.sleep(4000);
		String actualvalue=dr.getTitle();
		String expectedvalue="Integrations - LambdaTest.com";
		log.info("intregation tab check");
		Utility.verify(expectedvalue, actualvalue);

}
	@Test(priority=8)	
	public static void projects() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[10]/a")).click();
		Thread.sleep(4000);
		String actualvalue=dr.getTitle();
		String expectedvalue="LambdaTest";
		log.info("projects tab check");
		Utility.verify(expectedvalue, actualvalue);

}
	
	@Test(priority=9)	
	public static void WebTesting() throws InterruptedException {
		dr.get("https://accounts.lambdatest.com/login");
		dr.findElement(By.id("email")).sendKeys("sdsajeeb73@gmail.com");
		dr.findElement(By.name("password")).sendKeys("4!fFKtBNRfR9wYz");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/a")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@id=\"input-text\"]")).sendKeys("https://www.osaconsultingtech.com");
		dr.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/main-realtime-testing-component/div/app-test-detail/div[1]/div[1]/div/div[1]/form/div[3]/button")).click();
		Thread.sleep(3000);
		log.info("real test button is working");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
