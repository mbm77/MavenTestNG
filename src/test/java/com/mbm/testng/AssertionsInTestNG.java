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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	WebDriver driver;
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Webdriver executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 1)
	void logoTest() {
		WebElement logo =  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
		//Assert.assertFalse(logo.isDisplayed(), "Logo not displayed on the page");
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
