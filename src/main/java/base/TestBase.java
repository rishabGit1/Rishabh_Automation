package base;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	public static ChromeDriver driver;
	public void initialization()
	{
		//WebDriverManager.edgedriver();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//new update
		// code push
		
	}


}
