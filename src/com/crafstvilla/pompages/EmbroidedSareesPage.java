package com.crafstvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.genericutilities.BasePage;

public class EmbroidedSareesPage extends BasePage
{
	@FindBy(xpath="//img[contains(@src,'CV-35964-MCRAF25748058240-1523264883')]")
	private WebElement product_1523264883;
	
	@FindBy(xpath="//img[contains(@src,'CV-35655-MCRAF62619280810-1506324964')]")
	private WebElement product_1506324964;
	
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement priceOrder;
	
	
	public EmbroidedSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToProduct1523264883()
	{
		verifyElementPresent(product_1523264883);
		product_1523264883.click();
	}
	
	public void goToProduct1506324964()
	{
		verifyElementPresent(product_1506324964);
		product_1506324964.click();
	}
	
	public void changePriceOrder()
	{
		verifyElementPresent(priceOrder);
		priceOrder.click();
	}
}

