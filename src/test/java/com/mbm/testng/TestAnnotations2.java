package com.mbm.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations2 {
	@BeforeSuite
	void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("after suite");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("before test");
		System.out.println();
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("after test");
		System.out.println();
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	void afterMethod() {
		System.out.println("after method");
	}
	
	
	
	@Test
	void test3() {
		System.out.println("This is test3....");
	}
	
	@Test
	void test4() {
		System.out.println("This is test4....");
	}
	
	@Test
	void test5() {
		System.out.println("This is test5....");
	}
	
	@Test
	void test6() {
		System.out.println("This is test6....");
	}

}
