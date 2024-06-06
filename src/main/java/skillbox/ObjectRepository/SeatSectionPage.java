package skillbox.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class SeatSectionPage extends WebDriverUtility {
	
	
	@FindBy(xpath="//div[text()='Filter sections by price']")
	private WebElement pricedropclk;
	
	@FindBy(xpath="//div[@class='price-text ng-star-inserted']")
	private List<WebElement> listPrice;
	
	@FindBy(xpath="//*[@id='GA']")
	private WebElement gatkt;
	
	
	
	
	
	
	
	
	
	
	
	
	public SeatSectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPricedropclk() {
		return pricedropclk;
	}

	public List<WebElement> getListPrice() {
		return listPrice;
	}

	public WebElement getGatkt() {
		return gatkt;
	}
	
	
	public void SelectSeat(WebDriver driver) throws Throwable
	{
		waitForElementToBeVisible(driver, pricedropclk);
		Thread.sleep(2000);
		pricedropclk.click();
		selectItemFromList(driver, "INR 799", listPrice);
		Thread.sleep(2000);
		gatkt.click();
		
		
		
	    
					
	}
	
	
	

	
	
	
	
	
	
	
	
	

	

}
