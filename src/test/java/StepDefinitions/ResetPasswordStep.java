//package StepDefinitions;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.ResetPasswordPage;
//
//public class ResetPasswordStep {
//
//	public WebDriver driver = null;
//	public ResetPasswordPage resetpass;
//	public WebDriverWait wait;
//
//	@Before
//	public void setUp() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",
//				projectPath + ".\\src\\test\\resources\\drivers\\chromedriver.exe");
//
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.default_content_setting_values.notifications", 2);
//		prefs.put("credentials_enable_service", false);
//		prefs.put("profile.password_manager_enabled", false);
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", prefs);
//		options.addArguments("--disable-extensions");
//		options.addArguments("--disable-infobars");
//
//		WebDriverManager.chromedriver().setup();
//
//		driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//	}
//
//	@After
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//
//	}
//
//	@Given("Employee on Login page")
//	public void employee_on_login_page() throws InterruptedException {
//
//		driver.get("http://66.85.140.154:32333/");
//		System.out.println("User on login page ......" + driver.getTitle());
//
//		
//		
//		Thread.sleep(2000);
//
//	}
//
//	@Then("Click on Forgot password")
//	public void click_on_forgot_password() {
//		resetpass = new ResetPasswordPage(driver);
//		resetpass.forgotPAsswordlink();
//
//	}
//
//
//	@Then("^Enter \"(.*)\" in place holder$")
//	public void enter_email_id_in_place_holder(String emailid) throws InterruptedException {
//		resetpass = new ResetPasswordPage(driver);
//		Thread.sleep(2000);
//		resetpass.enterEmail(emailid);
//
//		Thread.sleep(2000);
//	}
//
//	@Then("Press Continue button")
//	public void press_continue_button() throws InterruptedException {
//		resetpass = new ResetPasswordPage(driver);
//		resetpass.continuebutton();
//		Thread.sleep(20000);
//
//	}
//
//
//
//
//	@Then("Enter Submit button")
//	public void enter_submit_button() throws InterruptedException {
//		resetpass = new ResetPasswordPage(driver);
//		
//		resetpass.Submittbutton();
//		Thread.sleep(2000);
//	    
//	}
//	@Then("^Enter \"(.*)\" button$")
//	public void enter_button(String password) throws InterruptedException {
//		Thread.sleep(2000);
//		resetpass = new ResetPasswordPage(driver);
//		resetpass.EnterPassword1Times(password);
//		Thread.sleep(2000);
//	   
//	}
//	@Then("^REEnter \"(.*)\" button$")
//	public void re_enter_button(String password) throws InterruptedException {
//		Thread.sleep(2000);
//		resetpass = new ResetPasswordPage(driver);
//		resetpass.ReEnterPassword2Times(password); 
//		Thread.sleep(2000);
//	}
//
//	
//
//	@Then("click on reset password button")
//	public void click_on_reset_password_button() throws InterruptedException {
//		Thread.sleep(2000);
//		resetpass = new ResetPasswordPage(driver);
//
//		resetpass.Resetpass();
//		Thread.sleep(2000);
//	}
//
//
//
//
//
//}
