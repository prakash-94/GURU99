package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LandingPage;

public class LandingPageTest {
	
	WebDriver driver;
	LandingPage LP;
	
	@Test
	public void ValidateTitle()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares_Jars\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		LP = new LandingPage(driver);
		driver.get("https://www.demo.guru99.com/v4/manager/Managerhomepage.php");
		String Text = LP.retrivetitle();
		System.out.println(Text);
		Assert.assertEquals(Text, "Guru99 Bank Manager HomePage");
		LP.getValidateTitle();
		
	}

}
