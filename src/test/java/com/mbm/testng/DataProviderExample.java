package com.mbm.testng;

import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="LoginDataProvider", dataProviderClass = CustomDataProvider.class)
	public void loginTest(String email, String pwd) {
		System.out.println(email+" "+pwd);
		
	}
	
	
	
}
