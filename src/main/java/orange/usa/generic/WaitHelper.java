package orange.usa.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import orange.usa.basepage.BasePage;

public class WaitHelper extends BasePage {
	public static void waitUntilElementPresent(WebElement elm) {
		WebDriverWait wait=new WebDriverWait(driver,30);      //Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(elm));
	}
/*public static void waitUntilElementToBePresent(WebElement elm) {
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(elm));
}*/
	
}
