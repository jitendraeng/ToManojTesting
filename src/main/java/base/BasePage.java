package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	
	public static WebDriver driver;

	
	
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver; //DriverManager.getDriver();
		
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	


}
