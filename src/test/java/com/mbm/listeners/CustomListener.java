package com.mbm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{
	
	

	public void onStart(ITestContext arg) {
		System.out.println("Starts test execution..."+arg.getName());
	}
	
	public void onFinish(ITestContext arg) {
		System.out.println("Finish the execution..."+arg.getName());
	}
	
	public void onTestStart(ITestResult arg0) {
		System.out.println("starts test......"+arg0.getName());
	}
	
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("skipped test......."+arg0.getName());
	}
	
	public void onTestFailure(ITestResult arg0) {
		System.out.println("failure test......."+arg0.getName());
	}
	
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("success test......."+arg0.getName());
	}
}
