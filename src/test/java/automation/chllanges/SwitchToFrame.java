package automation.chllanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		//driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		driver.switchTo().frame(0); // Switching to the frame
		System.out.println("We are switching to iframe");
		// Clicking the element in line with Advertisement
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,5000)");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		System.out.println("We are done");
	}

}
