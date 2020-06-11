package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {
		System.out.println("In utilities.SeleniumDriver.constructor()");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);	
	}
	
	public static void openPage(String url) {
		System.out.println("In utilities.SeleniumDriver.openPage()");
		driver.get(url);
	}
	public static WebDriver getDriver() {
		System.out.println("In utilities.SeleniumDriver.getDriver()");
		return driver;
	}
	public static void setUpDriver() {
		if(seleniumDriver == null) {
			System.out.println("SeleniumDriver is null. In utilities.SeleniumDriver.setUpDriver()");
			seleniumDriver  = new SeleniumDriver();
		}
	}
	public static void tearDown() {
		if(driver!= null) {
			System.out.println("In utilities.SeleniumDriver.tearDown()");
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
	
}
