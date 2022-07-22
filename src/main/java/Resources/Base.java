package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializerDriver() throws IOException
	{
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\GURU99\\src\\main\\java\\Resources\\data.properties");
	
	prop.load(fis);
	String browsername = prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares_Jars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares_Jars\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	else if(browsername.equals("IE"))
	{
		System.setProperty("webdriver.IE.driver", "C:\\Softwares_Jars\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

}
}

