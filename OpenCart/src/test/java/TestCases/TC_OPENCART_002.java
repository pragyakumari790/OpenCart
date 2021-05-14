package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RegisterPage;

public class TC_OPENCART_002 extends BaseClass {
	@Test
	public void RegisterationTest() throws IOException, InterruptedException {

		System.out.println("URL is opened");

		RegisterPage lp = new RegisterPage(driver);
		lp.MyAccount();
		lp.Register();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(15000);
		lp.FirstName(Firstname);
		System.out.println("Entered " + "firstname");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.LastName(Lastname);
		System.out.println("LastName Entered");
		lp.email(email);
		System.out.println("Email Entered");
		
		lp.setPassword(password);
		System.out.println("Entered password");
		lp.CPassword(cpassword);
		System.out.println("Entered password is confirmed");
		lp.check();

		lp.clickSubmit();

		
		 if(driver.getTitle().equals("My Account")) {
			 Assert.assertTrue(true);
		 logger.info("Login test passed"); 
		 } 
		 else { 
			 captureScreen(driver,"Registeration Failed");
		 Assert.assertTrue(false); logger.info("Login test failed"); 
		 }
	}
}
