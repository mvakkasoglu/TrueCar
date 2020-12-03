package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonBrowser {
private SingletonBrowser() {
		
	}
	
	private WebDriver driver;
	
	
	public WebDriver getDriver() {
		String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
		if (driver == null) {
			switch (browser) {
			case "chrome" :
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox" :
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			}
		}
		return driver;
	}
	
	
	
	public static SingletonBrowser instanceOfSingleton;
	public static SingletonBrowser getSingletonBrowser() {
		if (instanceOfSingleton == null)
			instanceOfSingleton = new SingletonBrowser();
		return instanceOfSingleton;
	}
	
	public void closeDriver() {
		if (driver!=null) {
			driver.quit();
			driver = null;
		}
	}


}
