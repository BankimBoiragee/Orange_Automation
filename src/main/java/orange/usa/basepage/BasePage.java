package orange.usa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static Logger logger;
	public static Properties prop;        //For globalized
	public  static WebDriver driver;
		
	public BasePage()  {
		logger=Logger.getLogger("QA Bankim");  //Object creation
		PropertyConfigurator.configure("log4j.properties");    //log4j file destination/location
		
		try {
		//Properties prop =new Properties();	//for reading
		 prop=new Properties();
		
		 FileInputStream ip= new FileInputStream(  //for finding file location path
			//User directory and Config property location where URL,userName and pwd is store 
			System.getProperty("user.dir")+ "/src/main/java/config/Config.Properties");
		    prop.load(ip);  //For reading xcell file is serelization
		    
		} 
		catch (FileNotFoundException e) {       //
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			
	}
		}
	/*public BasePage() {
		 prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream(
					System.getProperty("user.dir"+"/src/main/java/config/Config.Properties"));
			try {
				prop.load(ip);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}*/
	
	/*public static void initialization() {
		
		WebDriverManager.chromedriver().setup();  //To solve version problem
		//WebDriver driver=new ChromeDriver();    
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();       //For driver refresh
		System.out.println(prop.getProperty("URL")); //For URL connected or not, print out
		
	}*/
	public  static void startAutomation() {
		String browserName=prop.getProperty("browser");    //For running by different browser
		if(browserName.equalsIgnoreCase("chrome ")) {
			logger.info("User able to open chrome browser");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			logger.info("User able to open edge browser");
			//WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe" );
			driver=new EdgeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			logger.info("User able to open firefox browser");
			System.setProperty("webdriver.geckodriver.driver","./Drivers/geckodriver.exe" );
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();       //For driver refresh
		//System.out.println(prop.getProperty("URL")); //For URL connected or not, print out
		
	}

}
