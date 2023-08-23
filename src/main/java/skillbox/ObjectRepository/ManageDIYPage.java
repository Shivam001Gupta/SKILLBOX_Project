package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class ManageDIYPage extends WebDriverUtility {
	
	
	@FindBy(linkText="Add Offline Promoter")
	private WebElement addOfflinePromoterClk;
			
	public ManageDIYPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddOfflinePromoterClk() {
		return addOfflinePromoterClk;
	}


	public void addpromoter(WebDriver driver)
	{
		waitForElementToBeVisible(driver, addOfflinePromoterClk);
		addOfflinePromoterClk.click();
		
	}
	
	

	
}
