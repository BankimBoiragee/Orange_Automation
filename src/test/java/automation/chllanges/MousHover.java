package automation.chllanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousHover {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://www.amazon.com/");
	    
	    Thread.sleep(5000);
	    WebElement drop = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(drop).build().perform();
	    
		
	}

}
