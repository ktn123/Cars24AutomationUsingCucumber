package pages.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPage;
import utilities.SeleniumDriver;

public class UsedCarSearchPageActions {
	UsedCarSearchPage usedCarSearchPage = null;
	
	public UsedCarSearchPageActions() {
		this.usedCarSearchPage = new UsedCarSearchPage();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPage);
	}
	
	public void selectCity(String City) {
		usedCarSearchPage.selectCity.sendKeys(City);
	}
	
	public void selectBudgetOptions(String budgetValue) {
		List<WebElement> budget = new ArrayList<WebElement>();
		budget.add(usedCarSearchPage.budgetOptions);
		for(int i=0;i<budget.size();i++) {
			if(budget.get(1).getText() == budgetValue) {    
				budget.get(1).click();
			}
		}
	}
	
	public void searchCarBrand(String brandName) {
		usedCarSearchPage.searchCarBrand.sendKeys(brandName);
	}
	
}
