package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public static final String VERIFYTITLE_CSSSELECTOR = "marquee[behavior='alternate']";
	public static final String MANAGER_CSSSELECTOR = "a[href='Managerhomepage.php']";
	public static final String NEWCUSTOMER_CSSSELECTOR = "a[href='addcustomerpage.php']";
	public static final String EDITCUSTOMER_CSSSELECTOR = "a[href='EditCustomer.php']";
	public static final String DELETECUSTOMER_CSSSELECTOR = "a[href='DeleteCustomerInput.php']";
	public static final String NEWACCOUNT_CSSSELECTOR = "a[href='addAccount.php']";
	public static final String EDITACCOUNT_CSSSELECTOR = "a[href='editAccount.php']";
	public static final String DELETEACCOUNT_CSSSELECTOR = "a[href='deleteAccountInput.php']";
	public static final String DEPOSIT_CSSSELECTOR = "a[href='DepositInput.php']";
	public static final String WITHDRAWAL_CSSSELECTOR = "a[href='WithdrawalInput.php']";
	public static final String FUNDTRANSFER_CSSSELECTOR = "a[href='FundTransInput.php']";
	public static final String CHANGEPASSWORD_CSSSELECTOR = "a[href='PasswordInput.php']";
	public static final String BALANCEENQUIRY_CSSSELECTOR = "a[href='BalEnqInput.php']";
	public static final String MINISTATEMENT_CSSSELECTOR = "a[href='MiniStatementInput.php']";
	public static final String CUSTOMIZEDSTATEMENT_CSSSELECTOR = "a[href='CustomisedStatementInput.php']";
	public static final String LOGOUT_CSSSELECTOR = "a[href='Logout.php']";
	
		
			
	
	
	@FindBy(css = VERIFYTITLE_CSSSELECTOR)
	WebElement validatetitle;
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String retrivetitle()
	{
		return driver.getTitle();
	}
	
	public void getValidateTitle()
	{
		validatetitle.getText();
		System.out.println(validatetitle.getText());
	}
	

}
