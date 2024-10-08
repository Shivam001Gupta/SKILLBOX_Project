package skillbox.GenericUtilities;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class consists of all the re usable methods related to web driver actions
 * @author Shivam Gupta
 *
 */
public class WebDriverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) // updated driver reference
	{
		driver.manage().window().maximize();
	}

	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * This Method is used to Generate Random Alphabet
	 */
	public void Random(WebDriver driver)
	{
		RandomStringUtils.randomAlphabetic(7);
	}
	
	
	/**
	 * This method will wait for all the findElement and FindElements 
	 * operations to be performed
	 * @param driver
	 */
	public void waitForElementsToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method will wait until the specified element is visible in DOM
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will wait until the specified element is Invisible in DOM
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeInvisible(WebDriver driver, WebElement element)
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	/**
	 * This method will wait until specified element is clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will handle drop down using index
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, int index) 
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);		
	}
	
	/**
	 * This method will handle drop down using value
	 * @param element
	 * @param value
	 */
	public void handleDropDown(WebElement element, String value) 
	{
		Select sel = new Select(element);
		sel.selectByValue(value);	
	}
	
	/**
	 * This method will handle drop down using visible text
	 */
	public void handleDropDown(String text, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * This Method is Used to perform Escape Button Action
	 * @param driver
	 */
	public void escapeClickAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.ESCAPE).perform();
	}
	
	
	/**
	 * This Method is Used to perform Arrow Down Button Action
	 * @param driver
	 */
	public void arrowDownAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).perform();
	}
	
	/**
	 * This Method is Used to perform  Tab Button Action
	 * @param driver
	 */
	public void tabButtonAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
	}
	
	/**
	 * This Method is Used to perform  Enter Button Action
	 * @param driver
	 */
	public void enterButtonAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
	}
	
	
	
	/**
	 * This method will perform mouse hover action on a target element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method will double click anywhere on the web page
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method will double click on a web element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will perform right click anywhere on the web page
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method will perform right click on a particular web element
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will perform drag and drop action
	 * @param driver
	 * @param srcElement
	 * @param targetElement
	 */
	public void dragAndDropAction(WebDriver driver, WebElement srcElement, WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, targetElement).perform();
	}
	
	/**
	 * This method is used to move the cursor anywhere on the web page based on offset values
	 * @param driver
	 * @param xOffSet
	 * @param yOffSet
	 */
	public void moveAcrossWebPage(WebDriver driver, int xOffSet, int yOffSet)
	{
		Actions act = new Actions(driver);
		act.moveByOffset(xOffSet, yOffSet).click().perform();
	}
	
	/**
	 * This method will scroll up vertically for 1000 pixels
	 * @param driver
	 */
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000);", "");
	}
	
	/**
	 * This method will scroll down vertically for 1000 pixels
	 * @param driver
	 */
	public void scrollActionDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	}
	/**
	 * This method will scroll vertically until the element reference
	 * @param driver
	 * @param element
	 */
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+");", element);
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	/**
	 * This method will accept the alert pop up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will cancel the confirmation pop up
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will enter the text in prompt pop up
	 * @param driver
	 */
	public void sendTextToAlert(WebDriver driver, String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	/**
	 * This method will capture the alert message and return to the caller
	 * @param driver
	 * @return
	 */
	public String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	/**
	 * This method will handle frame based on frame index
	 * @param driver
	 * @param index
	 */
	public void handleFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}

    /**
     * This method will handle frame based on value of name or ID attributes
     * @param driver
     * @param nameOrID
     */
	public void handleFrame(WebDriver driver, String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
	
	/**
	 * This method will handle frame based on web element
	 * @param driver
	 * @param element
	 */
	public void handleFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will help to switch the control back to immediate parent
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method will help to switch the control back to current page 
	 * @param driver
	 */
	public void switchToDefaultPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method will switch the Selenium control from parent to child or 
	 * child to parent based on partial window title
	 * @param driver
	 * @param partialWinTitle
	 */
	public void swtichToWindow(WebDriver driver, String partialWinTitle)
	{
//	Step 1 Caputre all the windows ID
		 Set<String> allWindowIds = driver.getWindowHandles();
		 
//		 Step 2 Iterate through individual windows ID
		 for(String winID:allWindowIds)
		 {
//		    Step 3 Switch to each ID and capture the title
			String currentTitle = driver.switchTo().window(winID).getTitle();
			
			if(currentTitle.contains(partialWinTitle))
			{
				break;
			}
		 }
	}
	
	/**
	 * This Method is used to Find One element from the List
	 * @param driver
	 * @param name
	 * @param elements
	 */

	public void selectItemFromList(WebDriver driver, String name, List<WebElement> elements)
	{
		 for(WebElement i : elements)
		    	
		    {	    	
		    	if(i.getText().contains(name))	   
		    {
		    		
		    i.click();
		    
		    break;
		    
		    } }  
	}
	
	
	
	/**
	 * This method is used to Take Screen shot
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws Throwable
	 */
	public String takeScreenShot(WebDriver driver, String screenShotName) throws Throwable
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File (".\\Screenshots\\"+screenShotName+".png");
		Files.copy(src, dst); //This class is from commons IO tool
		
		return dst.getAbsolutePath(); //attach the screenshot to extent reports
		
	}




}