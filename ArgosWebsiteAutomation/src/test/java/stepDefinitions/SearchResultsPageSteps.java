package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResultsPage;

public class SearchResultsPageSteps {

	SearchResultsPage searchResultsPage=new SearchResultsPage(DriverFactory.getDriver());
	
	@Then("I should see search results containing {string}")
	public void i_should_see_search_results_containing(String productName) {
        searchResultsPage.verifySearchResultsPage(productName);
	}

	@When("I add the first product to the basket")
	public void i_add_the_first_product_to_the_basket() {
        searchResultsPage.addProductToBasket();
	}
	
	//This step is from the alternateWayOfWritingTheSameFeature feature file.
	//Hence not implemented.
	@Given("I am on the search results page containing {string}")
	public void i_am_on_the_search_results_page_containing(String productName) {
	}

}
