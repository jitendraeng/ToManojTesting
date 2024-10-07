package StepDefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmpDboardPage;

public class EmpDashboardStep {

	public WebDriver driver = null;
	public EmpDboardPage Empdash;

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

	@Given("Employee on Login page")
	public void employee_on_login_page() throws InterruptedException {

		driver.get("http://66.85.140.154:32333/");
		System.out.println("User on login page ......" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter Empusername \"(.*)\"$")
	public void enter_empusername(String Username) throws InterruptedException {
		Empdash = new EmpDboardPage(driver);

		Empdash.UserName(Username);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter Emppassword \"(.*)\"$")
	public void enter_emppassword(String password) throws InterruptedException {

		Empdash = new EmpDboardPage(driver);
		Empdash.Password(password);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("Enter Login button")
	public void enter_login_button() throws InterruptedException {
		Empdash = new EmpDboardPage(driver);
		Empdash.Loginbutton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Then("Verify Employee dashboard page")
	public void verify_employee_dashboard_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Empdash = new EmpDboardPage(driver);
		Empdash.EmpDashBoard();
		
		
		
	}

	@Then("Verify the ToolBar of emp board")
	public void verify_the_tool_bar_of_emp_board() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Empdash = new EmpDboardPage(driver);
		
		Empdash.Emp_ToolBar();
		
		}

	@Then("verify the dashboard DatabaseTable")
	public void verify_the_dashboard_database_table() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("DataBase Tableis....");
		Empdash = new EmpDboardPage(driver);
		Empdash.Emp_DataBaseTable();
		
		
	}

	@Then("Verify PaySlip title")
	public void cerify_pay_slip_title() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Empdash = new EmpDboardPage(driver);
		Empdash.Emp_PaySlip();
		
		
		
		
		
	}

	@Then("verify EmpDashboard Elements List")
	public void verify_emp_dashboard_elements_list() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Empdash = new EmpDboardPage(driver);
		Empdash.Emp_DashBoard_ElementTitles();
		
		
		
	}

	@Then("verify the month year title of calander")
	public void verify_the_month_year_title_of_calander() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Empdash = new EmpDboardPage(driver);
		
		Empdash.Dashboard_Calander();
		
		
		
	}



	@Then("verify the Statistics status")
	public void verify_the_statistics_status() {
	    
		
		
		
	}




}
