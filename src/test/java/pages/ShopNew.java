package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopNew {

	public ShopNew(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectModel(String model, WebDriver driver) {
		List<WebElement> list = driver.findElements(By.cssSelector("[data-qa $= 'new'] [class ^= 'd-inline-block']"));
		for (WebElement element : list) {
			System.out.println(element.getText());
			if (element.getText().equals(model))
				element.click();
		}
	}

	public void selectBodyType(WebDriver driver, String bodyType) {
		driver.findElement(By.cssSelector("[data-test-item = '" + bodyType + "']")).click();
	}

	@FindBy(css = "[placeholder = 'ZIP Code']")
	public WebElement zipCode;

	
	@FindBy(css = "[data-test = 'nextButton']")
	public WebElement next;

	@FindBy(css = "[class = 'btn-inner btn-fade']")
	public WebElement next1;
	
	public void skip(WebDriver driver) {

		WebDriverWait wait=new WebDriverWait(driver, 20);

		WebElement skip;

		skip = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-qa *= 'skip-button']")));

		skip.click();

	}

	@FindBy(css = "[data-qa = 'configurator-skip-button-desktop']")
	public WebElement skipForNow;
	
	@FindBy (css = "[data-qa = 'vehicleHeaderYearMakeModel']")
	public WebElement header;
	
	@FindBy (css = "[data-qa *= 'styleName']")
	public WebElement styleName;

	@FindBy (css = "[class = 'text-nowrap']:nth-of-type(1)")
	public WebElement specs;


}
