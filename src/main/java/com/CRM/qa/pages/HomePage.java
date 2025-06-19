package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CRM.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//PageFactory
	
	@FindBy(xpath = "//nav[@class='menu']//li[@id='menu-item-43']s")  
	WebElement HomeTitle;
	
	@FindBy(xpath = "//h1[text()='Hello']")  
	WebElement HomePagetext;
	
	
public boolean HomeTitleDisplayed() {
		
		return HomeTitle.isDisplayed();
		
	}

public void ClickHomeTitle() {
	
	HomeTitle.isDisplayed();
	HomeTitle.click();
}
	

public void VerifyTextOnHomePage() {
	
	HomePagetext.isDisplayed();
	
}


}
