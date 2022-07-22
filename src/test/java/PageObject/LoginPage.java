package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static  final String USERNAME_CSSSELECTOR = "input[name='uid']";
	public static final String PASSWORD_XPATH = "//input[@name='password']";
	public static final String LOGIN_CSSSELECTOR = "input[name='btnLogin']";
	public static final String RESET_XPATH = "//input[@type='reset']";
	
	
	@FindBy(css = USERNAME_CSSSELECTOR)
	WebElement username;
	
	@FindBy(xpath =PASSWORD_XPATH)
	WebElement password;
	
	@FindBy(css =  LOGIN_CSSSELECTOR)
	WebElement login;
	
	@FindBy(xpath = RESET_XPATH)
	WebElement reset;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void sendusername(String username1)
	{
		System.out.println("Inputting username" + username1);
		username.sendKeys(username1);
		
	}
	
	public void sendpassword(String password1)
	{
		password.sendKeys(password1);
		
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void clickReset()
	{
		reset.click();
	}
	

}
