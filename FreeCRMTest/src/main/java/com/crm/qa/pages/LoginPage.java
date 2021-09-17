package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase{

	//Page Factory - OR(obj repo):
 
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type = 'submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	// we have to initialize these web elements, so we will create the constructor of this class.
	
	// Initialization of the Page Objects
	public LoginPage(){
		PageFactory.initElements(driver, this);   // this is the current class object, you can also write as LoginPage.
	}
	
	// Actions:   (features available on the Login page)
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String user,String pwd){
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
}
