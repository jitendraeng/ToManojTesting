package StepDefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmpDboardPage;
import pages.HRDashboardPage;

public class HRDashboardStep {

	public WebDriver driver = null;
	public HRDashboardPage hrboard;

	@Before
	public void setUp() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + ".\\src\\test\\resources\\drivers\\chromedriver.exe");
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



	@Given("Employee on login page")
	public void employee_on_login_page() {
		driver.get("http://192.168.1.28:3000//");
		System.out.println("User on login page ......" + driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}
	@When("Enter EmpUsername \"(.*)\"$")
	public void enter_emp_username(String userName) {
		 hrboard=new HRDashboardPage(driver);
		hrboard.UserName(userName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}
	@When("Enter EmpPassword \"(.*)\"$")
	public void enter_emp_password(String passWord) {
		hrboard=new HRDashboardPage(driver);
		hrboard.Password(passWord);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}
	@Then("Enter login button")
	public void enter_login_button() {
		
		hrboard=new HRDashboardPage(driver);
		hrboard.Loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  
	}
	@Then("Verify Employee Dashboard page")
	public void verify_employee_dashboard_page() {
		hrboard=new HRDashboardPage(driver);
		hrboard.EmpDashBoard();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Then("verify the HR Dashboard page title")
	public void verify_the_hr_dashboard_page_title() {
		hrboard=new HRDashboardPage(driver);
		hrboard.HRDashBoard();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("verify the tool bar details")
	public void verify_the_tool_bar_details() {
	    
		hrboard=new HRDashboardPage(driver);
		hrboard.HRDashBoard_toolbar();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("print the database table")
	public void print_the_database_table() {
		hrboard=new HRDashboardPage(driver);
		hrboard.HR_DataBaseTable();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}
	@Then("click on view button")
	public void click_on_view_button() {
		hrboard=new HRDashboardPage(driver);
		hrboard.ViewButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("verify the candidates name")
	public void verify_the_candidates_name() throws InterruptedException {
		hrboard=new HRDashboardPage(driver);
		hrboard.profileName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
