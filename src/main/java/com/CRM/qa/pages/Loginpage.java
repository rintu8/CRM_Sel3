package com.CRM.qa.pages;

import com.CRM.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends TestBase {

	
	//PageFactory
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//h2[contains(text(), 'Test login')]")  
	WebElement Title;
	
	
	
	//Now initialize these repositories
	
	public 	Loginpage() {
		
		PageFactory.initElements(driver, this);
		
		// What this does is it initializes the above repositories with the 
		//driver defined in TestBase
		
	}
	
	//Define Actions
	
	public boolean TitleDisplayed() {
		
		return Title.isDisplayed();
		
	}
	
public String getTitle() {
		
		return Title.getText();
		
	}
	
	
	public HomePage login(String un,String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	
}
