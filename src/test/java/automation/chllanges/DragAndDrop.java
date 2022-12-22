package automation.chllanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import orange.usa.generic.CommonUtility;

public class DragAndDrop {
	static WebDriver driver;
	
	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//CommonUtility.DragnDrop();
		WebElement From=driver.findElement(By.xpath("(//*[@class='button button-orange'])[5]"));
		WebElement To=driver.findElement(By.xpath("(//*[@class='placeholder'])[1]"));
		Actions act= new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
		
	}
}
