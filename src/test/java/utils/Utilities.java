package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	
	public static List<String> webElementToStringList (List<WebElement> list){
		List<String> list1 = new ArrayList<String>();
		list.forEach(s -> list1.add(s.getText()));
		
		return list1;
		
	}

}
