package com.craftsvilla.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crafstvilla.pompages.HomePage;
import com.crafstvilla.pompages.SignInPage;
import com.craftsvilla.genericutilities.BaseTest;
import com.craftsvilla.genericutilities.ReadExcel;

public class SignUpScripts extends BaseTest
{
	
	HomePage hp = null;
	SignInPage sp = null;
	@Test
	public void TC_01_SignUp()
	{
		try
		{
			hp = new HomePage(driver);
			sp = new SignInPage(driver);
			
			String[][] credentials = ReadExcel.getData(strFilePath, "Login");
			for(int i =1; i<credentials.length; i++)
			{
				String email = credentials[i][0];
				String password = credentials[i][1];
				
				hp.clickOnSignInbutton();
				sp.setEmail(email);
				sp.clickOnContinue();
				sp.setpassword(password);
				sp.clickLogin();
				hp.goToAccount();
				hp.clickLogout();
				hp.verifyTitle("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail, Unable to execute testcase");
		}
		
	}

}
