package com.mbm.grid;

import java.net.URI;
import java.time.Duration;
import java.util.HashMap;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogintestOnWindowsusingChrome {
	WebDriver driver;
	
	
	@Test(priority = 1)
	void setUp() {
		
		String nodeURL = "http://192.168.2.134:4444/wd/hub";
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		System.setProperty("webdriver.chrome.driver","D:\\Webdriver executable\\chromedriver.exe");
		
		driver = new RemoteWebDriver( (CommandExecutor) new URL(nodeURL), cap);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test(priority = 2)
	void login() {
		
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
		driver.close();
	}
}
