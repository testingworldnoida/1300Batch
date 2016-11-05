package testcases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import base.CreateDriver;

public class TC_001 extends CreateDriver {
	
	@Test
	public void tcase1()
	{
		ResourceBundle rb = ResourceBundle.getBundle("Elements");
		driver.findElementById(rb.getString("login_username_id")).sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
	}

}
