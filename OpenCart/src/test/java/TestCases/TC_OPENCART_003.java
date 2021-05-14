package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_OPENCART_003 extends BaseClass {
	@Test
	public void loginTest() throws IOException, InterruptedException {
		System.out.println("URL is opened");
		LoginPage lo = new LoginPage(driver);
		lo.MyAccount();
		lo.Logiin();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(15000);
		lo.setEmail(username);
		lo.setPass(pass);
		lo.submit();
	}

}
