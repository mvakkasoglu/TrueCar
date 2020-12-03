  package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;
import pages.ShopNew;
import utils.SingletonBrowser;

public class ShopNewCarBrand {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	Homepage hp = new Homepage(driver);
	ShopNew sn = new ShopNew(driver);
	
	@Given("User is on truecar home page")
	public void user_is_on_truecar_home_page() {
	   hp.goToHomepage(driver);
	}

	@Given("User clicks on Shop New button")
	public void user_clicks_on_Shop_New_button() {
	   hp.buttonShopNew.click();
	}

	@Then("User clicks on brand {string}")
	public void user_clicks_on_brand(String model) throws InterruptedException {
	   sn.selectModel(model, driver);
	   Thread.sleep(2000);
	}

	@Then("User selects model {string}")
	public void user_selects_model(String bodyType) {
	   sn.selectBodyType(driver, bodyType);
	}

	@Then("User enters sip code {string}")
	public void user_enters_sip_code(String zipCode) {
		sn.zipCode.sendKeys(zipCode);
	}

	@Then("User clicks Next button")
	public void user_clicks_Next_button() {
	   sn.next.click();
	}

	@Then("User clicks Next button to continue")
	public void user_clicks_Next_button_to_continue() throws InterruptedException {
		Thread.sleep(2000);
	   sn.next1.click();
	}

	@Then("User clicks on Skip for Now")
	public void user_clicks_on_Skip_for_Now() {
		sn.skip(driver);
//		sn.skipForNow.click();
	    
	}

	@Then("Verify header is {string}")
	public void verify_header_is(String header) throws InterruptedException {
		Thread.sleep(2000);
	    String actualHeader=sn.header.getText();
	    System.out.println(actualHeader);
	    assertEquals(header, actualHeader);
	}

	@Then("Verify Style is {string}")
	public void verify_Style_is(String styleName) {
		assertEquals(styleName, sn.styleName.getText());
	    
	}

	@Then("Verify Standard Features & Specs contains {string}")
	public void verify_Standard_Features_Specs_contains(String expectedSpecs) {
		String actualSpecs = sn.specs.getText();
		assertTrue(actualSpecs, actualSpecs.contains(expectedSpecs) );
	   
	}


}
