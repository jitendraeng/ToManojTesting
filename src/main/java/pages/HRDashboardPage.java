package pages;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class HRDashboardPage extends BasePage {

	public HRDashboardPage(WebDriver driver) {
		super(driver);

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

	@FindBy(xpath = "//div[contains(@class,'pt-2')]")
	public WebElement HRToolBar;

	@FindBy(xpath = "//div[@class='col-lg-12 px-2 pt-3']")
	public WebElement dbTable;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/div/div/div/table/tbody/tr[1]/td[7]/button")
	public WebElement viewButton;

	@FindBy(xpath = "//td[contains(text(),'Jaideep')]")
	public WebElement profileName;

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

	public void HRDashBoard_toolbar() {

		List<WebElement> toolsElement = driver.findElements(By.xpath("HRToolBar"));
		for (int i = 0; i < toolsElement.size(); i++) {
			String toolbarName = toolsElement.get(i).getText();
			System.out.println("Tool Element in HR dashboard is...................." + toolbarName);
		}
	}

	public void HR_DataBaseTable() {
		List<WebElement> dbelements = dbTable.findElements(By.tagName("tr"));
		for (int i = 0; i < dbelements.size(); i++) {
			String DBElement = dbelements.get(i).getText();
			System.out.println(DBElement+" ");
		}
	}
	
	
	public void ViewButton() {
		
		viewButton.click();
		String viewTagname=driver.findElement(By.xpath("//h2[normalize-space()='Candidate Onboarding']")).getText();
		System.out.println("View Page title name id............."+viewTagname); 
		
	}
public void profileName() throws InterruptedException {
	
	List<WebElement> ProElements=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/table"));
	
	for(int i=0;i<ProElements.size();i++) {
		
		System.out.println("Profile titleas are........."+ProElements.get(i).getText());
		Thread.sleep(2000);
		
	}
	
List<WebElement> docElements=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[6]/div"));
	
	for(int i=0;i<docElements.size();i++) {
		
		//*[@id="root"]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[6]/div/div[1]/div[1]/button
		//*[@id="root"]/div/div[2]/div[2]/div/div[2]/div[2]/div/div[6]/div/div[1]/div[2]/button
		String docx=docElements.get(i).getText();
		
		System.out.println("Profile titleas are........."+docx);
		
		
		
		
		Thread.sleep(2000);
		
	}
	
	
		
		System.out.println("Employee profile name is ............"+	profileName.getText());
		
	
		
	}

}
