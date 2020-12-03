package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void goToHomepage(WebDriver driver) {
		String url = System.getProperty("url");
		if(url==null) {
			url = "https://www.truecar.com/";
		}
		driver.get(url);
	}
	
	@FindBy(css="[data-test='homepageHeroPanelShopNewButton']")
	public WebElement buttonShopNew;
}
