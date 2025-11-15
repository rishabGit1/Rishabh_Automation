package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase

{
	@FindBy(xpath="//input[@id='user-name']") private WebElement userTxtBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passTxtBox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String loginToApplication()
	{
		
		userTxtBox.sendKeys("standard_user");
		passTxtBox.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	
	public String verifyURLOfApplication()
	{
		return driver.getCurrentUrl();	
	}
	public String verifyTitleOfApplication()
	{
		return driver.getTitle();
	}

}//logic


