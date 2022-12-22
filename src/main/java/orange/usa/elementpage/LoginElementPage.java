package orange.usa.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orange.usa.basepage.BasePage;

public class LoginElementPage extends BasePage {
	public LoginElementPage() {                    //Constructor
		PageFactory.initElements(driver, this);    //pageFactory is a class,driver is a instance
		                                           // this is a current class properties
	}
	
    @FindBy(xpath = "//*[@name='username']")
	@CacheLookup
	private WebElement enterUserName;
    		
    public WebElement getEnterUserName() {
		return enterUserName;
	}

	@FindBy(xpath= "//*[@type='password']")
	 @CacheLookup	                           //executing my test cases using my computer’s cache memory
	    private WebElement enterPassword;      //Encapsulation concept

		public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath= "//*[@type='submit']")
    @CacheLookup	                                             
    private WebElement clickOnSignButton;                        //Encapsulation concept

	public WebElement getClickOnSignButton() {                    // Getter method
		return clickOnSignButton;
	}
	public void getUserName(String uName) {                      
		getEnterUserName().sendKeys(uName);
	}
	public void getPassword(String pwd) {
		getEnterPassword().sendKeys(pwd);	
	}
	/*@FindBy(xpath="//*[@src='/web/images/orangehrm-logo.png?1660914792648']")
	@CacheLookup
	private WebElement verifyText;
	public WebElement getVerifyText() {
		return verifyText;
	}*/
		
	
	/*@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	@CacheLookup
	private WebElement clickOnPaul;
	public WebElement getClickOnPaul() {
		return clickOnPaul;
	}*/
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	@CacheLookup
	private WebElement clickOnPaul;
	public WebElement getClickOnPaul() {
		return clickOnPaul;
	}
	@FindBy(xpath="//*[@href='/web/index.php/auth/logout']")
	@CacheLookup
	private WebElement logOut;
	public WebElement getLogOut() {
		return logOut;
	}
		
		
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	@CacheLookup
	private WebElement verifyText;
	public WebElement getVerifyText() {
		return verifyText;
	}
	
	/*@FindBy(xpath="//*[@href='/web/index.php/auth/logout']")
	@CacheLookup
	private WebElement verifyLogOutText;
	public WebElement getVerifyLogOutText() {
		return verifyLogOutText;
	}*/
}
