package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class NewOnboardingPage extends BasePage {

	public NewOnboardingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")
	public WebElement username;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div[1]/input")
	public WebElement password;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[4]/button")
	public WebElement login;

	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	public WebElement Dashboard;

	@FindBy(xpath = "//span[normalize-space()='Candidate Onboarding']")
	public WebElement EmpOnBoarding;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/button")
	public WebElement StartOnboarding;

	@FindBy(xpath = "//button[normalize-space()='Save & Continue']")
	public WebElement save_continue;

	@FindBy(xpath = "//*[@id=\"input:r4:\"]")
	public WebElement First_Name;

	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div[2]/div[3]/div[2]/input")
	public WebElement Last_Name;

	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/input")
	public WebElement Documental_DOB;

	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div[2]/input")
	public WebElement Docx_DOB;

	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div[4]/div[2]/input")
	public WebElement Personal_Email;

	@FindBy(xpath = "//*[@id=\"input:r6:\"]")
	public WebElement Mobile_No;

	@FindBy(xpath = "//*[@id=\"input:r7:\"]")
	public WebElement Emergency_Contact;

	@FindBy(xpath = "//*[@id=\"input:r8:\"]")
	public WebElement Aadhaar_Number;

	@FindBy(xpath = "//*[@id=\"input:r9:\"]")
	public WebElement Aadhaar_upload;

	@FindBy(xpath = "//*[@id=\"input:ra:\"]")
	public WebElement Pan_Number;

	@FindBy(xpath = "//*[@id=\"input:rb:\"]")
	public WebElement PAN_upload;

	@FindBy(xpath = "//*[@id=\"input:rc:\"]")
	public WebElement Family_Information_fname;

	@FindBy(xpath = "//*[@id=\"input:rd:\"]")
	public WebElement Family_Information_lname;

	@FindBy(xpath = "//*[@id=\":re:\"]")
	public WebElement Relationship;

	@FindBy(xpath = "//*[@id=\"input:rf:\"]")
	public WebElement Date_Of_Birth;

	@FindBy(xpath = "//*[@id=\"input:rg:\"]")
	public WebElement Phone;

	@FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div[3]/div[2]")
	public WebElement Gender;

	public void UserName(String UserEmail) {
		username.sendKeys(UserEmail);
	}

	public void Password(String userPassword) {
		password.sendKeys(userPassword);
	}

	public void Loginbutton() {
		login.click();
		System.out.println("..........user logged in..........");
	}

	public void HRDashBoard() {
		Dashboard.click();
		String actualtitle = driver.findElement(By.xpath("//h4[normalize-space()='HR Dashboard']")).getText();
		assertEquals("HR Dashboard", actualtitle);
		System.out.println("Dashboard page title is .........." + actualtitle);
	}

	public void EmpOnboarding() {
		EmpOnBoarding.click();
		String onboardactualtitle = driver.findElement(By.xpath("//h4[normalize-space()='Employee Onboarding']"))
				.getText();
		assertEquals("Employee Onboarding", onboardactualtitle);
		System.out.println("onboard  page title is .........." + onboardactualtitle);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", StartOnboarding);
		String actualonbord = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/h2"))
				.getText();
		assertEquals("Candidate Onboarding", actualonbord);
		System.out.println("......user on new Onboarding page..........Please fill the details..." + actualonbord);
	}

	public void Save_Continue() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		First_Name.sendKeys("Deepak");
		Last_Name.sendKeys("Gupta");
		Documental_DOB.sendKeys("10-06-2000");
		Docx_DOB.sendKeys("10-06-2002");
		Personal_Email.sendKeys("diksha@gmail.com");
		Mobile_No.sendKeys("1122334455");
		Emergency_Contact.sendKeys("1212121212");
		Aadhaar_Number.sendKeys("987654321987");
		driver.findElement(By.xpath("Gender")).click();
		driver.findElement(By.xpath("Aadhaar_upload")).sendKeys("D:\\jitendra\\Samples photo & resumes");

		Pan_Number.sendKeys("SFDTR2121R");

		driver.findElement(By.xpath("PAN_upload")).sendKeys("D:\\jitendra\\Samples photo & resumes");

		Family_Information_fname.sendKeys("Radhe");
		Family_Information_lname.sendKeys("govind");
		WebElement dropdown = driver.findElement(By.xpath("Relationship"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Son");

		Date_Of_Birth.sendKeys("10-06-1977");
		Phone.sendKeys("9898989898");

		save_continue.click();
		System.out.println(".........Successifully savved details..........");
	}

}
