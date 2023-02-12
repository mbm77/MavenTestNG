package com.mbm.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestExample2 {
	WebDriver driver;
	
	@Test
	void loginTest() {
		System.setProperty("webdriver.chrome.driver","D:\\Webdriver executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username= driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement msg = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
		Assert.assertTrue(msg.isDisplayed());
		System.out.println("Login Successfull");
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
	

}
