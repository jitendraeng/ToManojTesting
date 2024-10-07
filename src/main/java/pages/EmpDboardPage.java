package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class EmpDboardPage extends BasePage {

	public EmpDboardPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")
	public WebElement username;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div[1]/input")
	public WebElement password;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[4]/button")
	public WebElement login;
	
	
	@FindBy(xpath = "(//div[contains(@class,'container-fluid')])[4]")
	public WebElement toolBar;
	
	@FindBy(xpath = "//div[@class='col-lg-8']")
	public WebElement DBTable;
	
	
	@FindBy(xpath = "(//div[contains(@class,'chartboxshadow')])[7]")
	public WebElement payslip;
	
	
	
	@FindBy(xpath = "//ul[@class='text-start p-1 py-2 mt-3']")
	public WebElement dbwebelementtitles;
	
	
	//@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]")
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div")
	public WebElement calender;
	

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]")
	public WebElement Statistics;
	
	

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

		System.out.println("dashboard Page title is........." + driver.getTitle());
		String Actualname = driver.findElement(By.xpath("//div[contains(text(),'JitendraprasadYadav')]")).getText();
		System.out.println(".............successifully logged in .........");
		assertEquals("JitendraprasadYadav", Actualname);
		System.out.println("Employee  name is ............" + Actualname);

	}
	
	public void Emp_ToolBar() {
		
		List<WebElement > toolbarlist =driver.findElements(By.xpath("toolBar"));
	
		for(int i=0;i<toolbarlist.size();i++) {
			String tooltext=toolbarlist.get(i).getText();
			System.out.println("Toolbar element name is..........."+tooltext);
		}		
	}
	
public void Emp_DataBaseTable() {
	
	List<WebElement> dbelements = DBTable.findElements(By.tagName("tr"));
	for(int i=0;i<dbelements.size();i++) {
		
		String DBElement=dbelements.get(i).getText();
		
		System.out.println(DBElement);
		
		
	}
		
	}

public void Emp_PaySlip() {
	
	
		
		
		System.out.println(payslip.getText());
//		String Expected="GrossPay_50000";
//		List<WebElement> payelement=payslip.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[3]"));
//		for(int i=0;i<payelement.size();i++) {
//			
//			String elem=payelement.get(i).getText();
//			System.out.println(elem);
//			
//			
//		}		
	}


public void Emp_DashBoard_ElementTitles() {
		
		System.out.println("DbTitles is........."+dbwebelementtitles.getText());
		
	}


public void Dashboard_Calander() {

	
	List<WebElement> caldates=calender.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]"));
	for(WebElement dates :caldates) {
	
			System.out.print("Calander title is........."+dates.getText());
			
}
}

public void Emp_Checkin_checkout() {
			
	WebElement checkInLink = Statistics.findElement(By.xpath("checkInLinkId")); // Change this to the actual ID of the check-in link

    // Check if the check-in link is enabled
    if (checkInLink.isEnabled()) {
        System.out.println("The check-in link is enabled.");
    } else {
        System.out.println("The check-in link is disabled.");
    }
		
			
}


public void Statistics() {
	

	
	System.out.println("Statictics title is.........."+Statistics.getText());

	
}

}
