package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	private boolean present;

	private By searchTextBoxLocator = By.id("searchTerm");
	private By searchIconLocator = By.xpath("//button[@data-test='search-button']");
	private By cookiesSectionLocator = By.xpath("//*[@class='explicit-consent-prompt']");
	private By requiredCookiesButtonLocator = By.xpath("//button[@id='explicit-consent-prompt-reject']");
	private By itemCategoriesLocator=By.xpath("//*[@data-test='m052-links']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyPageLoad() {
		try {
		   driver.findElement(itemCategoriesLocator);
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		return present;			
	}
	
	public void acceptCookies() {
		if (driver.findElement(cookiesSectionLocator).isDisplayed()) {
			driver.findElement(requiredCookiesButtonLocator).click();
		}
	}

	public void searchProduct(String productName) {
		acceptCookies();
		driver.findElement(searchTextBoxLocator).sendKeys(productName);
		driver.findElement(searchIconLocator).click();
	}

}
