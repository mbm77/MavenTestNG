package com.mbm.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	@Test(priority = 1)
	void setup() {
		System.out.println("This is setup test");
	}
	
	@Test(priority = 3)
	void searchCustomer() {
		Assert.assertEquals(1, 1);
		System.out.println("This is search customer");
		
		
	}
	
	@Test(priority = 4)
	void teardown() {
		System.out.println("closing browser");
	}
	
	@Test(priority = 2)
	void addCustomer() {
		System.out.println("This is add customer");
	}
	
	

}
