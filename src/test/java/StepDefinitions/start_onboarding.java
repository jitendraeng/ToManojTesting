package StepDefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmpOnBoardingPage;
import pages.NewOnboardingPage;

public class start_onboarding {

	public WebDriver driver = null;
	public NewOnboardingPage StartNewOnboard;

	@Before
	public void setUp() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				projectPath + ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

	@Given("employee on Login page")
	public void employee_on_login_page() {
		driver.get("http://66.85.140.154:32333/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^Enter Emp_userName \"(.*)\"$")
	public void enter_emp_user_name(String UserEmail) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartNewOnboard=new NewOnboardingPage(driver);
		StartNewOnboard.UserName(UserEmail);
	
	}

	@And("^Enter Emp_PassWord \"(.*)\"$")
	public void enter_emp_pass_word(String password) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartNewOnboard=new NewOnboardingPage(driver);
		StartNewOnboard.Password(password);
		
	}

	@Then("Enter login Button")
	public void enter_login_button() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartNewOnboard=new NewOnboardingPage(driver);
		StartNewOnboard.Loginbutton();
		

	}

	@Then("click on Dashboard link")
	public void click_on_dashboard_link() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartNewOnboard=new NewOnboardingPage(driver);
		StartNewOnboard.HRDashBoard();
		

	}

	@Then("click on Onboarding link and start onboarding")
	public void click_on_onboarding_link_and_start_onboarding() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartNewOnboard=new NewOnboardingPage(driver);
		StartNewOnboard.EmpOnboarding();
		

	}

	@Then("Click on save and continue")
	public void click_on_save_and_continue() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StartNewOnboard=new NewOnboardingPage(driver);
		StartNewOnboard.Save_Continue();
	

	}

}
