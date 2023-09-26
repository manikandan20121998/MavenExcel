package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {
	
	public RegisterPage() {
	PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//a[@role='button'])[3]")
	private WebElement createbtn;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signup;

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSignup() {
		return signup;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
