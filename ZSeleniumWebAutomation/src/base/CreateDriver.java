package base;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriver {
	public ChromeDriver driver;
	@BeforeMethod
	public void bmethod()
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get(rb.getString("url"));
	}
	
	@AfterMethod
	public void amethod()
	{
		driver.quit();
	}

}
