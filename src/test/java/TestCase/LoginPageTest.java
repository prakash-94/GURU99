package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class LoginPageTest {
	
	 WebDriver driver;
	 LoginPage lp;
	 
		
	@Test
	public void happyPath() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares_Jars\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		driver.get("https://www.demo.guru99.com/v4/");
		//lp.sendusername();
		//lp.sendpassword();
		lp.clickLogin();
		
		}
		
	}



	
