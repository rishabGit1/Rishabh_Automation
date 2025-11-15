package testCases;

import org.slf4j.helpers.Reporter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends LoginPage
{
	LoginPage login;
	@BeforeMethod
	public void setUp()
	{
		initialization();
		login=new LoginPage();
	}
	
	@Test
	public void loginToApplicationTest()
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApplication();
		Assert.assertEquals(expResult,actResult); 
	}
	
	@Test
	public void verifyURLOfApplicationTest()
	{
		String expURL="https://www.saucedemo.com/";
		String actURL=login.verifyURLOfApplication();
		Assert.assertEquals(expURL,actURL);
		org.testng.Reporter.log("Swag Lab URL = "+ actURL);
	}
	@Test
	public void verifyTitleOfApplicationTest()
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitleOfApplication();
		Assert.assertEquals(expTitle,actTitle);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
