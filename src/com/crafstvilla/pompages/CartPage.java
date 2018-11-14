package com.crafstvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.genericutilities.BasePage;



public class CartPage extends BasePage
{
	@FindBy(id="address-email")
	private WebElement email;
	
	@FindBy(id="address-first-name")
	private WebElement firstName;
	
	@FindBy(id="address-mobileno")
	private WebElement mobileNo;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String emailid)
	{
		verifyElementPresent(email);
		email.sendKeys(emailid);
	}
	
	public void setFirstName(String fName)
	{
		verifyElementPresent(firstName);
		firstName.sendKeys(fName);
	}
	
	public void setMobile(String mob)
	{
		verifyElementPresent(mobileNo);
		mobileNo.sendKeys(mob);
	}

}
