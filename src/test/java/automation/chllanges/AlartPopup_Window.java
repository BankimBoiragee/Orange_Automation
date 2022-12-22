package automation.chllanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartPopup_Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demoqa.com/alerts";
		driver.get(url);
		WebElement element=driver.findElement(By.xpath("//*[@id='alertButton']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
		//Actions act=new Actions(driver);
		//act.click(element).build().perform();
		Thread.sleep(5000);
		//Alert is a Interface al is a instance
		Alert al= driver.switchTo().alert();
		al.accept();
		//al.dismiss();
		//al.sendKeys("");
		//al.accept();
		

	}

}
