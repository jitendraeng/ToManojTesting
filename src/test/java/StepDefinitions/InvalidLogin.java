//package StepDefinitions;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//import java.time.Duration;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.InvalidLoginPage;
//import pages.LoginPage;
//
//public class InvalidLogin {
//
//	public WebDriver driver = null;
//	public InvalidLoginPage Emplogin;
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
//
//	}
//
//	@After
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//		
//
//	}
//
//	@Given("Employee on Login page")
//	public void employee_on_login_page() {
//
//		driver.get("http://66.85.140.154:32333/");
//		System.out.println("User on login page ......" + driver.getTitle());
//		System.out.println("image is displayed ...................."
//				+ driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/img")).isDisplayed());
//	}
//
//	@Then("^Enterusername \"(.*)\"$")
//	public void enterusername(String Username) throws InterruptedException {
//		 Emplogin = new InvalidLoginPage(driver);
//
//		Emplogin.UserName(Username);
//		Thread.sleep(2000);
//	}
//
//	@Then("^Enterpassword \"(.*)\"$")
//	public void enterpassword(String password) throws InterruptedException {
//		 Emplogin = new InvalidLoginPage(driver);
//
//		Emplogin.Password(password);
//		Thread.sleep(2000);
//
//	}
//
//	@Then("Enter Login button")
//	public void enter_login_button() throws InterruptedException {
//		 Emplogin = new InvalidLoginPage(driver);
//		Emplogin.Loginbutton();
//	
//	
//		Thread.sleep(2000);
//	
//	String UnExpected= "Invalid email address";
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement usererrorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")));
//	assertEquals(UnExpected, usererrorMessageElement.getText());
//	System.out.println("user name error message is........."+usererrorMessageElement );
//	
//	String PsExpected= "Email or Password is not Valid";
//	
//	
//	 WebElement pserrorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div/input")));
//	 Actions action=new Actions(driver);
//
//		assertEquals(UnExpected, pserrorMessageElement.getText());
//		System.out.println("user name error message is........."+pserrorMessageElement );
// 
//	}
//	
//
//
//	
//
//	
//
//	
//
//}
