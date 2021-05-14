package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String baseurl=pro.getProperty("baseUrl");
		return baseurl;
	}
	public String getUserName()
	{
	String UName=pro.getProperty("username");
	return UName;
	}
	
	public String getGupass()
	{
	String pas=pro.getProperty("passw");
	return pas;
	}
	public String FirstName()
	{
	String FirstName=pro.getProperty("FirstName");
	return FirstName;
	}
	
	public String LastName()
	{
	String LastName=pro.getProperty("LastName");
	return LastName;
	}
	
	public String email()
	{
	String email=pro.getProperty("email");
	return email;
	}
	public String getPhoneNo()
	{
	String phone=pro.getProperty("telephone");
	return phone;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getCPassword()
	{
	String cpassword=pro.getProperty("cpassword");
	return cpassword;
	}
	public String getBrowserName()
	{
	String browserName=pro.getProperty("browserName");
	return browserName;
	}
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	

	

}
