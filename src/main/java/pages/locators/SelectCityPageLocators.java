package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectCityPageLocators {
//	@FindBy(xpath = "//img[@data-title=\"Mumbai\"]")
//	public WebElement selectCity;
	
	
	@FindBy(how = How.XPATH,using="//img[@data-title='Mumbai']")          //Another way to write(Imported from Selenium)
	public WebElement selectCity;
	
	
	
}
