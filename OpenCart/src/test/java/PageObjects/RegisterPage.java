package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;
import TestCases.BaseClass;



public class RegisterPage extends BaseClass   {

	
	public RegisterPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtUserFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	@CacheLookup
	WebElement txtUserLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	@CacheLookup
	WebElement txtUserEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	@CacheLookup
	WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='input-password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	@CacheLookup
	WebElement CPassword;
	
	@FindBy(xpath="//body/div[@id='account-register']"
			+ "/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement agree;
	@FindBy(xpath="//input[@value='Continue']")
	@CacheLookup
	WebElement btnLogin;
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	@CacheLookup
	WebElement MyAccount;
	@FindBy(xpath="//a[contains(text(),'Register')]")
	@CacheLookup
	WebElement Register;
	
	public void FirstName(String Frstname)
	{
		Action.type(txtUserFirstName, Frstname);
	}
	
	public void LastName(String Latname)
	{
		Action.type(txtUserLastName, Latname);
	}
	
	public void email(String eail)
	{
		Action.type(txtUserEmail, eail);
	}
	
	public void telephone(String phne)
	{
		Action.type(PhoneNumber, phne);
	}
	
	public void setPassword(String paword)
	{
		Action.type(txtPassword, paword);
	}
	
	public void CPassword(String cpword)
	{
		Action.type(CPassword, cpword);
	}
	
	public void check()
	{
		agree.click();
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void MyAccount()
	{
		Actions act = new Actions(driver);
		act.moveToElement(MyAccount).click().build().perform();
		
	}
	
	public void Register()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Register).click().build().perform();
	}

}
