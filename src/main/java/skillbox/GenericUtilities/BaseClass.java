package skillbox.GenericUtilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class consists of all the basic configuration annotations for 
 * all the common actions
 * @author Shivam Gupta
 *
 */
public class BaseClass {
	
//	public JavaUtility jUtil = new JavaUtility();
	public ExcelFileUtility eUtil = new ExcelFileUtility();
	public propertyFileUtility pUtil = new propertyFileUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	
	public WebDriver driver = null;
	
	protected String URL = "https://www.sbmailer.com/";
//	protected String URL = "https://gcp.sbmailer.com/";
//	protected String URL = "https://gcp.skillboxes.com/";
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("====== db connection successful ======");
	}
//	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(/*String BROWSER*/) throws Throwable
	{
		//Read browser name and URL from property File
		String BROWSER = pUtil.getDataFromPropertyFile("browser");
		String URL = pUtil.getDataFromPropertyFile("url");
		
		
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			
			// Create preferences map
	        Map<String, Object> prefs = new HashMap<>();

	        // Disable the password manager prompts
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        prefs.put("profile.password_manager_leak_detection", false);
			ChromeOptions option = new ChromeOptions();
			option.setExperimentalOption("prefs", prefs);
			
			option.addArguments("--headless");
//			option.setBinary("/Users/Apple/git/SKILLBOX_Project/src/main/resources/chromedriver");
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
			System.out.println(BROWSER + " === Browser launched ===");

		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(BROWSER + " === Browser launched ===");
			
		} else if (BROWSER.equalsIgnoreCase("IE")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println(BROWSER + " === Browser launched ===");
			
		} else if (BROWSER.equalsIgnoreCase("safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			System.out.println(BROWSER + " === Browser launched ===");
			
		} else {
			System.out.println("==== invalid Browser name ====");
		}

		wUtil.maximizeWindow(driver);
		wUtil.waitForElementsToLoad(driver);

		//Load the URL
		driver.get(URL);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()=' New Delhi ']")).click();
		Thread.sleep(2000);
		System.out.println("==== Location Selected Successful ====");
		
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws Throwable
	{
		System.out.println("=== Operation Started Successful ====");
		
	}


	@AfterMethod(alwaysRun = true)
	public void amConfig() throws Throwable
	{
		System.out.println("=== Operation Completed Successful ====");
	}
		
	
//	@BeforeTest
	@AfterClass(alwaysRun = true)
	public void acConfig()
	{
		if (driver != null)
		driver.quit();
		System.out.println(" ========== Browser Closed ========");
	}
		
	
	@AfterSuite(alwaysRun = true)
	public void asConfig()
	{
		System.out.println("====== db connection closed ======");
	}

}