package skillbox.GenericUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("====== db connection successful ======");
	}
	
	@BeforeClass
	public void bcConfig() throws Throwable
	{
		//Read browser name and URL from property File
		String BROWSER = pUtil.getDataFromPropertyFile("browser");
		String URL = pUtil.getDataFromPropertyFile("url");
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(BROWSER + " === Browser launched ===");

		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(BROWSER + " === Browser launched ===");
			
		} else if (BROWSER.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", ".src\\main\\resources\\chromedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println(BROWSER + " === Browser launched ===");
			
		} else if (BROWSER.equalsIgnoreCase("safari")) {
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
		
		driver.findElement(By.xpath("//p[text()=' New Delhi ']")).click();
		
		System.out.println("==== Location Selected Successful ====");
		
	}
	
	
	@BeforeMethod
	public void bmConfig() throws Throwable
	{
		System.out.println("=== Operation Started Successful ====");
		
	}


	@AfterMethod
	public void amConfig() throws Throwable
	{
		System.out.println("=== Operation Completed Successful ====");
	}
		
	
	@AfterClass
	public void acConfig()
	{
//		driver.quit();
		System.out.println(" ========== Browser Closed ========");
	}
		
	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("====== db connection closed ======");
	}

}
