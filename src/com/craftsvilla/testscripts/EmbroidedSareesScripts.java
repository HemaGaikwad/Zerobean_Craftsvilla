package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crafstvilla.pompages.CartPage;
import com.crafstvilla.pompages.EmbroidedSareesPage;
import com.crafstvilla.pompages.HomePage;
import com.crafstvilla.pompages.ProductDescriptionPage;
import com.crafstvilla.pompages.SareesPage;
import com.craftsvilla.genericutilities.BaseTest;

public class EmbroidedSareesScripts extends BaseTest
{

	HomePage  hp = null;
	SareesPage sp = null;
	EmbroidedSareesPage ep = null;
	ProductDescriptionPage pd = null;
	CartPage cp = null;
	
	@Test
	public void TC_01_BuyProduct()
	{
		
		try
		{
			hp = new HomePage(driver);
			sp = new SareesPage(driver);
			ep = new EmbroidedSareesPage(driver);
			pd = new ProductDescriptionPage(driver);
			cp = new CartPage(driver);
			
			hp.goToSarees();
			sp.clickOnEmbroidedSarees();
			ep.goToProduct1523264883();
			pd.checkProductName();
			pd.clickOnBuyNow();
			Assert.fail();
			cp.setEmail("abc@gmail.com");
			cp.setFirstName("Hema");
			cp.setMobile("9663069665");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.log("Fail, Unable to execute testcase");

		}
		
	}

}
