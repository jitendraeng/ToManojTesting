package pages;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class EmpOnBoardingPage extends BasePage {

	public EmpOnBoardingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")
	public WebElement username;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div[1]/input")
	public WebElement password;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[4]/button")
	public WebElement login;

	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	public WebElement DashBoard;

	@FindBy(xpath = "//h4[normalize-space()='HR Dashboard']")
	public WebElement HRDashboard;

	@FindBy(xpath = "//span[normalize-space()='Candidate Onboarding']")
	public WebElement EmpOnBoarding;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[3]/a")
	public WebElement status_Completed;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div/div/div")
	public WebElement Onboarding_dbTable;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/button")
	public WebElement Onboarding_viewdetails;

	public void UserName(String UserEmail) {
		username.sendKeys(UserEmail);
	}

	public void Password(String userPassword) {
		password.sendKeys(userPassword);
	}

	public void Loginbutton() {
		login.click();
	}

	public void EmpDashBoard() {
		System.out.println(".............successifully logged in .........");

		String Actualname = driver.findElement(By.xpath("//h4[normalize-space()='Landing Page']")).getText();

		assertEquals("Landing Page", Actualname);
		System.out.println("Emp page name is ............" + Actualname);

	}

	public void HRDashBoard() {
		DashBoard.click();
		String HRActualname = HRDashboard.getText();
		assertEquals("HR Dashboard", HRActualname);
		System.out.println("HR Dashboard page title is .........." + HRActualname);
	}

	public void EmpOnboarding() {

		EmpOnBoarding.click();

	}

	public void status_completed() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click()", status_Completed);

		   List<WebElement> dbelements = Onboarding_dbTable.findElements(By.tagName("tr"));
			for (int i = 0; i < dbelements.size(); i++) {
				String DBElement = dbelements.get(i).getText();
				System.out.println(DBElement+" ");
			}

	}

	public void Onboarding_viewdetails() {

		Onboarding_viewdetails.click();

		String ActualEmpNAme = driver.findElement(By.xpath("//td[contains(text(),'Jaideep')]")).getText();
		assertEquals("Jaideep Singh", ActualEmpNAme);

		System.out.println("Empoloyee name is ........" + ActualEmpNAme);

	}

}
