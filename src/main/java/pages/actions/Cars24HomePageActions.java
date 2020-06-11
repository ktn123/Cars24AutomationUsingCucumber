package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Cars24HomePageLocators;
import utilities.SeleniumDriver;

public class Cars24HomePageActions {
	
	Cars24HomePageLocators cars24HomePageLocators = null;
	public Cars24HomePageActions() {
		this.cars24HomePageLocators = new Cars24HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), cars24HomePageLocators);
	}
	
	public void clickBuyUsedCar() {
		cars24HomePageLocators.buyUsedCar.click();
	}
	
	public void clickCarSellMoreLink() {
		cars24HomePageLocators.carSellMoreLink.click();
	}
	
	public void clickLoginSignUp() {
		cars24HomePageLocators.loginSignUp.click();
	}
	
	public void gotoRcTransferStatusPage() {
		cars24HomePageLocators.rcTransferStatus.click();
	}
	
}
