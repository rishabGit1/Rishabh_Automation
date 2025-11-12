package pages;

import base.TestBase;

public class LoginPage extends TestBase

{
	public String verifyURLOfApplication()
	{
		return driver.getCurrentUrl();	
	}
	public String verifyTitleOfApplication()
	{
		return driver.getTitle();
	}

}//logic


