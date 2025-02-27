package stepDefinitions;


import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("I am on the Argos website")
	public void i_am_on_the_argos_website() {
		Assert.assertTrue(homePage.verifyPageLoad());
	}

	@When("I search for {string}")
	public void i_search_for(String productName) {
		homePage.searchProduct(productName);
	}

}
