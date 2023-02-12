package com.mbm.testng;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 1)
	void TestOne() {
		System.out.println("This is test1");
	}
	
	@Test(priority=2)
	void TestTwo() {
		System.out.println("This is test2");
	}
	
	@Test(priority=3)
	void TestThree() {
		System.out.println("This is test3");
	}
	
	@Test(priority=4, enabled = false)
	void TestFour() {
		System.out.println("This is test4");
	}
}
