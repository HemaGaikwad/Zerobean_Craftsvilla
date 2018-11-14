package com.craftsvilla.genericutilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConst
{
	
	public static WebDriver driver = null;
	public WebDriverWait wait = null;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void OpenApp(String browser)
	{
		try
		{
			if(browser.equalsIgnoreCase("CHROME"))
			{
				System.setProperty(chrome_key, chrome_value);
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("FIREFOX"))
			{
				System.setProperty(gecko_key, gecko_value);
				driver = new FirefoxDriver();
				
			}
			
			else 
			{
				Reporter.log("Invalid browser selection");
				
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 30);
			driver.get("https://www.craftsvilla.com/");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.log("Unable to launch the browser");
			
		}
		
	}
			

	@AfterMethod
	public void closeApp()
	{
		try
		{
			driver.quit();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			Reporter.log("Unable to quit the browser");
		}
	}
		
	
}
