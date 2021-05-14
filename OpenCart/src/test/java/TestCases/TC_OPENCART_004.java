package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_OPENCART_004 extends BaseClass {
	@Test
	public void loginTst() throws IOException, InterruptedException {
		System.out.println("URL is opened");
		LoginPage lo = new LoginPage(driver);
		lo.MyAccount();
		lo.Logiin();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(15000);
		lo.setEmail(username);
		lo.setPass(pass);
		lo.submit();
		String sd=driver.getTitle();
		System.out.println("My Account "+sd);
		if(driver.getTitle().equals(sd)) {
			 Assert.assertTrue(true);
			 captureScreen(driver,"LoginSuccessful");
		 //logger.info("Login test passed"); 
		 } 
		 else { 
			 captureScreen(driver,"Login Failed");
		 Assert.assertTrue(false);// logger.info("Login test failed"); 
		 }
	}

}
