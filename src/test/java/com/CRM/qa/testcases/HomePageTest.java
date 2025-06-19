package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.Loginpage;

public class HomePageTest extends TestBase {
	
	
	HomePage homepage;
	
	HomePageTest(){
		
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		Initialization();
		//create an object of LoginPage class
		homepage = new HomePage();
	}
	

	@Test(priority=4)
	public void VerifyHomeTitle() {
		homepage.HomeTitleDisplayed();
	}
	

	@Test(priority=5)
	public void ClickHomeTitle() {
		homepage.ClickHomeTitle();
	}
	
	@Test(priority=6)
	public void VerifytsHomePage() {
		homepage.VerifyTextOnHomePage();
	}


}
