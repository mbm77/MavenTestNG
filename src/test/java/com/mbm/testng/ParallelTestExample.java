package com.mbm.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestExample {
	WebDriver driver;
	
	@Test(priority = 1)
	void logoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement logo = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	void homePageTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM", "Title Mismatch");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}

}
