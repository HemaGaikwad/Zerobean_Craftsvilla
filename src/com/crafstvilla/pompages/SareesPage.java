package com.crafstvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.genericutilities.BasePage;

public class SareesPage extends BasePage
{
	@FindBy(linkText = "Embroidered Sarees")
	private WebElement embroisedSareesLink;
	
	@FindBy(linkText = "Printed Sarees")
	private WebElement printedSareesLink;

	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnEmbroidedSarees()
	{
		verifyElementPresent(embroisedSareesLink);
		embroisedSareesLink.click();
	}
	
	public void clickOnPrintedsarees()
	{
		verifyElementPresent(printedSareesLink);
		printedSareesLink.click();
	}
}
