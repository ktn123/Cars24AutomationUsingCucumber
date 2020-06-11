package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.Cars24HomePageActions;
import pages.actions.SelectCityPageActions;
import pages.actions.UsedCarSearchPageActions;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	UsedCarSearchPageActions usedCarPage = new UsedCarSearchPageActions();
	
	@Given("I am on the Home Page {string}")
	public void i_am_on_the_Home_Page(String homePageURL) {
		SeleniumDriver.getDriver().get(homePageURL);
	}

	@Then("I select the city as {string}")
	public void i_select_the_city_as(String city) {
		SelectCityPageActions selectCity = new SelectCityPageActions();
		selectCity.selectCityAsMumbai();
	}

	@Then("I move to Buy Used Car page")
	public void i_move_to_Buy_Used_Car_page() {
		Cars24HomePageActions usedCarLink = new Cars24HomePageActions();
		usedCarLink.clickBuyUsedCar();
	}

	@And("fill in the city as {string}")
	public void fill_in_the_city_as(String City) {
		usedCarPage.selectCity(City);
	}

	@And("select By Budget as {string}")
	public void select_By_Budget_as(String budgetValue) {
		usedCarPage.selectBudgetOptions(budgetValue);
	}

	@And("fill By Brand or Model as {string}")
	public void fill_By_Brand_or_Model_as(String brandName) {
		usedCarPage.searchCarBrand(brandName);
	}

	@Then("I should see the list of searched cars")
	public void i_should_see_the_list_of_searched_cars() {

	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String string) {

	}

}
