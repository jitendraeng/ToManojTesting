package StepDefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmpOnBoardingPage;

public class OnBoardingstep {

	public WebDriver driver = null;
	public EmpOnBoardingPage Onboard;

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

	@Given("employee on login page")
	public void employee_on_login_page() {
		driver.get("http://66.85.140.154:32333/");
		System.out.println("User on login page ......" + driver.getTitle());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("Enter EmpUserName \"(.*)\"$")
	public void enter_emp_user_name(String username) {
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.UserName(username);

	}

	@When("Enter EmpPassWord \"(.*)\"$")
	public void enter_emp_pass_word(String password) {
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.Password(password);

	}

	@Then("Enter Login Button")
	public void enter_login_button() {
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.Loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("Verify Employee_dashboard page")
	public void verify_employee_dashboard_page() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.EmpDashBoard();
		

	}

	@Then("verify the HR_dashboard page title")
	public void verify_the_hr_dashboard_page_title() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.HRDashBoard();
		

	}

	@Then("click on Onboarding link")
	public void click_on_onboarding_link() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.EmpOnboarding();
		

	}

	@Then("click on completed status of employee")
	public void click_on_completed_status_of_employee() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Onboard = new EmpOnBoardingPage(driver);
		Onboard.status_completed();
		

	}

	@Then("click on view details of employee")
	public void click_on_view_details_of_employee() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Onboard = new EmpOnBoardingPage(driver);

		Onboard.Onboarding_viewdetails();
		
	}

}
