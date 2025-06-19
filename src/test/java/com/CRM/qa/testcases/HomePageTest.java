package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.Loginpage;

public class HomePageTest extends TestBase {
	
	
	HomePage homepage;
	Loginpage loginpage;
	
	HomePageTest(){
		
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		Initialization();
		//create an object of LoginPage class and HomePageClass
		homepage = new HomePage();
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
	
	

	@Test(priority=4)
	public void VerifyHomeTitle() {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.HomeTitleDisplayed();
	}
	

	
	@Test(priority=5)
	public void VerifytsHomePage() {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.ClickHomeTitle();
		homepage.VerifyTextOnHomePage();
	}


	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
