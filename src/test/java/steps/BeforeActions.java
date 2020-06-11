package steps;

import io.cucumber.java.Before;
import utilities.SeleniumDriver;

public class BeforeActions {
	@Before
	public static void setUp() {
		System.out.println("In steps.BeforeActions_cl.setUp()");
		SeleniumDriver.setUpDriver();
	}
}
