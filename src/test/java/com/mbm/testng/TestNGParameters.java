/*
 * Assert.assertTrue()
 * Assert.assertFalse()
 * Assert.assertEquals()
 */

package com.mbm.testng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGParameters {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setUp(String browser, String url) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Webdriver executable\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Webdriver executable\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
	}
	
	@Test(priority = 1)
	void logoTest() {
		WebElement logo =  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
	}
	
	@Test(priority = 2)
	void homePageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM", "Title is not matched");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
