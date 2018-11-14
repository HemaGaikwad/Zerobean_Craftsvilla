package com.crafstvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.genericutilities.BasePage;

public class HomePage extends BasePage
{
	//Declaration
	
	@FindBy(id="cartCount")
	private WebElement cart;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement sareesLink;
	
	@FindBy(xpath = "//a[@href='/womens-clothing/kurtis-tunics/?MID=megamenu_casualwear_seeall']")
	private WebElement kurtisAndDressesLink;
	
	@FindBy(id="searchval")
	private WebElement serachBar;
	
	@FindBy(xpath="//a[@href='#']/span[@class='hidden-xs user-name']")
	private WebElement account;
	
	@FindBy(xpath="//a[@href='https://cvaccount.craftsvilla.com/customer/account/logout']")
	private WebElement logout;
	
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void clickOnCart()
	{
		verifyElementPresent(cart);
		cart.click();
	}
	
	
	public void goToAccount()
	{
		verifyElementPresent(account);
		mouseHover(driver, account);
	}
	
	public void clickLogout()
	{
		verifyElementPresent(logout);
		logout.click();
	}
	public void clickOnSignInbutton()
	{
		verifyElementPresent(signInButton);
		signInButton.click();
	}
	
	public void goToSarees()
	{
		verifyElementPresent(sareesLink);
		mouseHover(driver, sareesLink);
	}
	
	public void goToKurtisAndDresses()
	{
		verifyElementPresent(kurtisAndDressesLink);
		mouseHover(driver, kurtisAndDressesLink);
	}
	
	public void setSearchValue()
	{
		verifyElementPresent(serachBar);
		serachBar.sendKeys("Gowns");
	}
	
	
	
}
