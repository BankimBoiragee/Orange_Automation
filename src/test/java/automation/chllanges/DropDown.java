package automation.chllanges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); //To omit version problem
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
		
		/*Select select=new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		select.selectByIndex(7);
		select.selectByValue("bn");
		select.selectByVisibleText("বাংলা");
		*/
		DropDown.getSelectTheValue("bn");
		
		}
	public static void getSelectTheValue(String text) {
		List<WebElement> elements= driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
		
		for(WebElement value:elements) {
			System.out.println(value.getSize());
			
			if(text.equals(value.getText()));
			value.click();
			break;
			
		}
	}

}
