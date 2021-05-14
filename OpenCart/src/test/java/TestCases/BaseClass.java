package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilites.ReadConfig;

public class BaseClass {
	public static ReadConfig readconfig=new ReadConfig();
	public static String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String pass=readconfig.getGupass();
	public String Firstname=readconfig.FirstName();
	public String Lastname=readconfig.LastName();
	public String email = readconfig.email();
	public String phone = readconfig.getPhoneNo();
	public String password=readconfig.getPassword();
	public String cpassword=readconfig.getCPassword();
	public String br = readconfig.getBrowserName();
     public static WebDriver driver;
     public static Properties prop;
	public static Logger logger;
	@BeforeClass
	
	public static void launchApp() {
		//WebDriverManager.chromedriver().setup();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		
		
		driver.get(baseURL);
	}
	public void setup()
	{			
		logger = LogManager.getLogger("OpenCart");
		PropertyConfigurator.configure("Log4j.properties");
		BasicConfigurator.configure();  
		  logger.info("Hello world");  
		  logger.info("we are in logger info mode");
		  }
	@AfterClass
	public void tearDon()
	{
		//driver.quit();
	}
	public static void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

		}



