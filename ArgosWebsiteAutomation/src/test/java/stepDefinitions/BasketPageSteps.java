package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;

public class BasketPageSteps {
	
	private BasketPage basketPage = new BasketPage(DriverFactory.getDriver());

	@Then("I should see {string} in the basket")
	public void i_should_see_in_the_basket(String productName) {
		basketPage.verifyProductNameInBasket(productName);
	}

	@When("I increase the quantity by {int}")
	public void i_increase_the_quantity_by(Integer quantity) {
		basketPage.increaseProductQuantity(quantity);
	}

	@Then("the subtotal should be updated accordingly")
	public void the_subtotal_should_be_updated_accordingly() {
		basketPage.subTotalUpdate();
	}

	//This step is from the alternateWayOfWritingTheSameFeature feature file.
	//Hence not implemented.
	@Given("I am on the Argos Trolley page with {string} in the basket")
	public void i_am_on_the_argos_trolley_page_with_in_the_basket(String productName) {
	}
}
