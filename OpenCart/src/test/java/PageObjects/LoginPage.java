package PageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;
import TestCases.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement Logiin;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement EmailAd;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement EPass;
	public void setEmail(String uname) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Action.type(EmailAd, uname);
	}
	
	public void setPass(String pass) {
		Action.type(EPass, pass);
	}
	@FindBy(xpath="//body/div[@id='account-login']/div[1]"
			+ "/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement submit;
	public void Logiin() throws IOException {
		Actions act = new Actions(driver);
		act.moveToElement(Logiin).click().build().perform();
		}
	public void submit() {
		submit.click();
		
	}
	public void MyAccount()
	{
		Actions act = new Actions(driver);
		act.moveToElement(MyAccount).click().build().perform();
		
	}
}
