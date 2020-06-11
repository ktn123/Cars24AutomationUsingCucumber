package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SelectCityPageLocators;
import utilities.SeleniumDriver;

public class SelectCityPageActions {
	
	SelectCityPageLocators selectCityPageLocators = null;
	public SelectCityPageActions() {
		this.selectCityPageLocators = new SelectCityPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), selectCityPageLocators);
	}
	
	public void selectCityAsMumbai() {
		selectCityPageLocators.selectCity.click();
	}
}
