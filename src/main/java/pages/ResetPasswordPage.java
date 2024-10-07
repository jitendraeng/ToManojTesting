package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ResetPasswordPage extends BasePage {

	public ResetPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Forgot password?']")
	public WebElement ReSetPass;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div/div[1]/input")
	public WebElement Emailaddress;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public WebElement Continue;

	

	@FindBy(xpath = "//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/div[3]/button")
	public WebElement OPTSubmitt;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")
	public WebElement PassEnter;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div/input")
	public WebElement REPassEnter;

	@FindBy(xpath = "/html/body/div/section/div/div/div[2]/div/div[2]/form/div[3]/button")
	public WebElement ResetPAss;

	public void forgotPAsswordlink() {
		// click on Resetpassword link button
		ReSetPass.click();
	}

	public void enterEmail(String Emailid) {

		Emailaddress.sendKeys(Emailid);

	}

	public void continuebutton() {
		Continue.click();

	}



	public void Submittbutton() {
		OPTSubmitt.click();

	}

	public void EnterPassword1Times(String password) {
		PassEnter.sendKeys(password);
		
	}

	public void ReEnterPassword2Times(String password) {
		REPassEnter.sendKeys(password);

	}

	public void Resetpass() {

		ResetPAss.click();

	}

}