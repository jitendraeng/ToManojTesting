package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")
	public WebElement username;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div[1]/input")
	public WebElement password;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[4]/button")
	public WebElement login;

	@FindBy(xpath = "//div[@class='Header']//li[3]//a[1]//*[name()='svg']")
	public WebElement logout;

	public void UserName(String UserEmail) {
		//enter user email id

		username.sendKeys(UserEmail);

	}

	public void Password(String userPassword) {
		//Enter password
		password.sendKeys(userPassword);

	}

	public void Loginbutton() {
	//click on login button
		login.click();
		
		

	}
	
	public void Logoutbutton() {
		//click on login button
		logout.click();
		System.out.println(".............successifully logged out .........");
		}

	public void EmpDashBoard() {
		String Actualname=driver.findElement(By.xpath("//div[contains(text(),'JaideepSingh')]")).getText();
		System.out.println(".............successifully logged in .........");
		assertEquals("JaideepSingh", Actualname);
		System.out.println("Employee  name is ............"+ Actualname);

	}

	

}
