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
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.LoginPage;
//
//public class EmpLogin {
//
//	public  WebDriver driver=null;
//	
//	
//		
//		
//	
//	
//	 
//	 @Before
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
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	
//
//	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//
//	}
//	
//
//	@Given("Employee on Login page")
//	public void employee_on_login_page() {
//
//		driver.get("http://66.85.140.154:32333/");
//		System.out.println("User on login page ......" + driver.getTitle());
//		System.out.println("image is displayed ...................."+driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/img")).isDisplayed()	);
//	}
//
//	@Then("^Enterusername \"(.*)\"$")
//	public void enterusername(String Username) {
//		LoginPage Emplogin=new LoginPage(driver);
//		
//		Emplogin.UserName(Username);
//
//	}
//
//	@Then("^Enterpassword \"(.*)\"$")
//	public void enterpassword(String password) {
//		LoginPage Emplogin=new LoginPage(driver);
//		
//		Emplogin.Password(password);
//
//	}
//
//	@Then("Enter Login button")
//	public void enter_login_button() {
//		LoginPage Emplogin=new LoginPage(driver);
//		Emplogin.Loginbutton();
//
//	}
//
//	@Then("Employee on Emp. dashboard page")
//	public void employee_on_emp_dashboard_page() {
//		LoginPage Emplogin=new LoginPage(driver);
//		Emplogin.EmpDashBoard();
//
//	}
//
//	
//
//}
