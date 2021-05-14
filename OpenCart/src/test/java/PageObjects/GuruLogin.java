package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ActionClass.Action;
import TestCases.BaseClass;

public class GuruLogin extends BaseClass {
	public GuruLogin(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Login;
	
	public void setUserName(String uname) {
		Action.type(txtUserName, uname);
	}
	
	public void setUserPassword(String pass) {
		Action.type(txtPassword, pass);
	}
	
	public void Login() throws IOException {
		Login.click();
	
	
	
	
}
}
