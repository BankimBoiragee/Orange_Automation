package automation.chllanges;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="https://demoqa.com/browser-windows";
		driver.get(url);
		
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		//I take control of main window with getwindowhandle method, store in string variable
		String mainwindow=driver.getWindowHandle();
		//with the Set interface create instance, then we take control of child window
		//with getwindowhandles method
		Set<String> set= driver.getWindowHandles();
		//take control of window one by one with iterator
		Iterator<String> iterator=set.iterator();
		//I create while loop and inside i have to call the object and hasnext()for ignore main Window
		while(iterator.hasNext()) {
			//For counting the child windows
			String childwindow=iterator.next();
			// then I put the condition main window not equal, take the control of child window
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				// then I have to switch to child window with driver.switchto method	
				driver.switchTo().window(childwindow);
				//Close the child window
				Thread.sleep(3000);
				driver.close();
				System.out.println("Child window closed");
				
			}
			
			
		}
		//Switch back to the main window which is the parent window.
		Thread.sleep(3000);
		driver.switchTo().window(mainwindow);
		driver.close();
		//Thread.sleep(3000);
		
	}

}
