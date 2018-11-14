package com.crafstvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.genericutilities.BasePage;

public class SignInPage extends BasePage
{
	@FindBy(id ="emailId")
	private WebElement email;
	
	@FindBy(id="continueBtn")
	private WebElement continueBtn;

	@FindBy(id="facebookSignInBtn")
	private WebElement facebookBtn;
	
	@FindBy(id="set-password")
	private WebElement setpwd;
	
	@FindBy(id="userRegister")
	private WebElement registerBtn;
	
	@FindBy(id="userPassword")
	private WebElement enterPassword;
	
	@FindBy(id="loginCheck")
	private WebElement loginBtn;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin()
	{
		verifyElementPresent(loginBtn);
		loginBtn.click();
	}
	public void setpassword(String pwd)
	{
		verifyElementPresent(enterPassword);
		enterPassword.sendKeys(pwd);
	}
	
	public void setEmail(String emailaddress)
	{
		verifyElementPresent(email);
		email.sendKeys(emailaddress);
		
	}
	
	
	public void clickOnContinue()
	{
		verifyElementPresent(continueBtn);
		continueBtn.click();
	}
	
	public void clickOnFacebookBtn()
	{
		verifyElementPresent(facebookBtn);
		facebookBtn.click();
	}
	
	public void setPassword(String pwd)
	{
		verifyElementPresent(setpwd);
		setpwd.sendKeys(pwd);
	}
	
	public void clickOnRegisterBtn()
	{
		verifyElementPresent(registerBtn);
		registerBtn.click();
	}
	
}
