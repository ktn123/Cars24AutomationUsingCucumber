package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarSearchPage {
	@FindBy(how=How.XPATH,using="qhKLc")
	public WebElement selectCity;
	
	@FindBy(how=How.XPATH,using="//div//div[@class='_11vrC']//div//label")
	public WebElement budgetOptions;
	
	@FindBy(how=How.ID,using="searchCarName")
	public WebElement searchCarBrand;
	
	
	
}
