package automation.chllanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url= "https://www.orangehrm.com/";
		driver.get(url);
		
		Thread.sleep(5000);
		//Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Call executeScript() method of JavascriptExecutor interface with passing 
		//window.scrollBy() as parameter value.
		// Call scrollBy() method of Javascript using window object with passing number 
		//of pixels as parameter values. 
        js.executeScript("window.scrollBy(0,7000)"); //1000 means scroll 100%,500=50%,
		
		
	}
	

}
