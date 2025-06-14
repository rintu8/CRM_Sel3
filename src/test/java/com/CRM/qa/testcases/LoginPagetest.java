package com.CRM.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.Loginpage;



public class LoginPagetest extends TestBase {
	
	Loginpage loginpage;
	
	//Create a constructor to initialize the testbase constructor
	
	public LoginPagetest() {
		
		super();
	}
	
	//next initialize by @beforemethod and cleate a setup method to initialize from the testBase class
	
	@BeforeMethod
	public void setup() {
		Initialization();
		//create an object of LoginPage class
		 loginpage = new Loginpage();
	}
	
	@Test(priority=1)
	public void VerifyTitle() {
		boolean title = loginpage.TitleDisplayed();
		System.out.println("The status of title displayd is : "+title);
		
	}
	
	@Test(priority=2)
	public void getTitle() {
		String title1 = loginpage.getTitle();
		System.out.println("The status of title displayd is : "+title1);
		Assert.assertEquals(title1, "Test login");
	}
	
	@Test(priority=3)
	public void Logintest() {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
