package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.GuruLogin;

public class GuruTest extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		GuruLogin gl = new GuruLogin(driver);
	System.out.println("URL is opened");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	gl.setUserName(username);
	gl.setUserPassword(pass);
	gl.Login();
	}
}
