package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class HomePage extends TestBase {
	
	private static final boolean True = false;

	//PageFactory
	
	@FindBy(xpath = "//nav[@class='menu']//li[@id='menu-item-43']s")  
	WebElement HomeTitle;
	
	@FindBy(xpath = "//h1[text()='Hello']")  
	WebElement HomePagetext;
	

	//Now initialize these repositories
	
	public 	HomePage() {
		
		PageFactory.initElements(driver, this);
		
		// What this does is it initializes the above repositories with the 
		//driver defined in TestBase
		
	}
	
	
public boolean HomeTitleDisplayed() {
		
		return HomeTitle.isDisplayed();
		
	}

public boolean ClickHomeTitle() {
	
	HomeTitle.isDisplayed();
	HomeTitle.click();
	return True;
	
	
}
	

public boolean VerifyTextOnHomePage() {
	
	HomePagetext.isDisplayed();
	
	return HomePagetext.isDisplayed();
	
}


}
