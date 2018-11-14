package com.crafstvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.craftsvilla.genericutilities.BasePage;

public class ProductDescriptionPage extends BasePage
{
	@FindBy(id="addtocart")
	private WebElement addTocartButton;
	
	@FindBy(id="buynow")
	private WebElement buyNowButton;
	
	@FindBy(xpath="//h1[@itemprop='name']")
	private WebElement productName;
	
	public ProductDescriptionPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnBuyNow()
	{
		verifyElementPresent(buyNowButton);
		buyNowButton.click();
	}
	
	public void checkProductName()
	{
		verifyElementPresent(productName);
		String exp_productName= "Craftsvilla Coral Color Silk Designer Resham Embroidery Saree";
		String productText = productName.getText();
		Assert.assertEquals(productText,exp_productName);
	}

}
