package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cars24HomePageLocators {
	@FindBy(how=How.XPATH, using="//li//a[contains(text(),'Buy Used Car')]")
	public WebElement buyUsedCar;
	
	@FindBy(how=How.CLASS_NAME, using="btn _3BmFU AgO6q")
	public WebElement carSellMoreLink;
	
	@FindBy(how=How.LINK_TEXT, using="Login/Sign Up")
	public WebElement loginSignUp;
	
	@FindBy(how=How.XPATH,using="//li//a[contains(text(),'RC Transfer Status')]")
	public WebElement rcTransferStatus;
	
	
	
}
