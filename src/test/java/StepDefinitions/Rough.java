package StepDefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough {
	
	public  WebDriver driver;
	
	@Test
	public void login() {
		
		
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
		driver.get("http://66.85.140.154:32333/");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input")).sendKeys("jitendra@singhsoft.com");
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div[2]/form/div[2]/div[1]/input")).sendKeys("123Yadav@");
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div[2]/form/div[4]/button")).click();
	}

}
