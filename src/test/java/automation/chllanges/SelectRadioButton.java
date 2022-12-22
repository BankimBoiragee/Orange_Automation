package automation.chllanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRadioButton {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement option=driver.findElement(By.xpath("//*[@value='radio1']"));
		
		boolean isSelected=option.isSelected();  //Predefine method
		if(!isSelected) {
			option.click();
			System.out.println(option.getText());
			Thread.sleep(3000);
			
		}
		WebElement option1=driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
		boolean isDisplay=option1.isSelected();  //We can use isEnable instead os isDisplay
		if(!isDisplay) {
			option1.click();
			System.out.println(option1.getText());
			Thread.sleep(3000);
		}
	}

}
