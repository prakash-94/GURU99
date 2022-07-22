package TestCase;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class Day3LoginPage {
	
	WebDriver driver;
	LoginPage lp;
	
	
	@Test(dataProvider = "getdata")
	public void happyPath(String UserName, String PassWord, String text) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares_Jars\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		

		
		lp=new LoginPage(driver);
		
		lp.sendusername(UserName);
		lp.sendpassword(PassWord);
		lp.clickLogin();
		try
		{
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}
		catch(NoAlertPresentException e)
		{
			e.getStackTrace();
		}
		System.out.println(text);
		
		driver.close();
	}
	
	
	
		
		@DataProvider
		public Object [][] getdata() 
		{
			Object [][] data = new Object[4][3];
			
			data [0][0] = "mngr418774";
			data [0][1] = "AgEbybe";
			data [0][2] = "username password correct";
			
			data [1][0] = "valid";
			data [1][1]  = "invalid";
			data [1][2] = "username correct password wrong";
			
			data [2][0] = "invalid";
			data [2][1] = "valid";
			data [2][2] = "username wrong password correct";
			
			data [3][0] = "invalid";
			data [3][1] = "invalid";
			data [3][2] = "username wrong password wrong";
			
			return data;
		

	}
	
	
}

