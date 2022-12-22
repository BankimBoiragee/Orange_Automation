package orange.usa.generic;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import orange.usa.basepage.BasePage;

public class CommonUtility extends BasePage{
	//Action Click
	public static void getActionClick(WebElement elm) {  //Create a parameterized method like 
	Actions obj=new Actions(driver);                     //Function
    obj.click(elm).build().perform();
	}
	/*public static Actions getAction() {
		Actions action = new Actions(driver);
		return action;
	}*/
	public static boolean getVerifyTheResult(String Expected, String Actual) { //Validation
		Assert.assertEquals(Expected, Actual);
		if(Expected.equals(Actual)) {
			System.out.println("Expected and Actual are equal");
		}
		else {
			System.out.println("Expected and Actual does not equal");
		}
		return true;
	}
	/*public static boolean getVerifyTheLogOutResult(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
		if(Expected.equals(Actual)) {
			System.out.println("LogOut Expected and Actual are equal");
			
		}
		else {
			System.out.println("LogOut Expected and Actual does not equal");	
		}
						
		return true;
		
	}*/
	
	//JavaScript Click
	public static void getJSClick(WebElement elm) {
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", elm); //Option-1	
		JavascriptExecutor executor = (JavascriptExecutor)driver;   //Option-2,It is a interface
		executor.executeScript("arguments[0].click();", elm);


	}
	
	/*public static void getActionClick(WebElement elm) {
		Actions obj=new Actions(driver);
		obj.click(elm).build().perform();
	}
	
	public static void getJSClick(WebElement elm) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elm);	
	}*/
	
	/*public static void get() {
		//Set the wait parameter
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS);//set the interval between every 2 tries
		.ignoring(NoSuchElementException.class);  //don't throw this exception
		//Declare the WebElement and use a function to find it
		WebElement waitingElement=wait.until(new Function <webDriver,webElement()>{
			public webElement apply(WebDriver driver) {
				return driver.findElement(By.id("Start"));
			}
		}
		);
		waitingElement.click();
	}*/
	
	/*public static void DragnDrop() { 
		                                      //We create common part of browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}*/

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}
	/*public static void takeScreenShot() throws IOException {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshorts" + System.currentTimeMillis() +".png"));
	}*/
}
