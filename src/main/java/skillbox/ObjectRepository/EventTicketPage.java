package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class EventTicketPage extends WebDriverUtility {
	
	@FindBy(linkText="Livestream Pass")
	private WebElement passSelect;
	
	@FindBy(xpath="//div[@class='qty qty_active']/select")
	private WebElement ticketQty;
	
	@FindBy(xpath="//input[@placeholder='Enter amount']")
	private WebElement artistDonation;
	
	@FindBy(xpath="//*[text()='Checkout']")
	private WebElement ticketCheckout;
	
	public EventTicketPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPassSelect() {
		return passSelect;
	}

	public WebElement getTicketQty() {
		return ticketQty;
	}

	public WebElement getArtistDonation() {
		return artistDonation;
	}

	public WebElement getTicketCheckout() {
		return ticketCheckout;
	}
	
	
	
	public void selectTicket(String text) throws Throwable
	{
		passSelect.click();
		Thread.sleep(3000);
		handleDropDown(text, ticketQty);
		artistDonation.sendKeys("300");
		ticketCheckout.click();
		
	}
	
	public void selectFreeTicket(String text)
	{
		handleDropDown(text, ticketQty);
		ticketCheckout.click();
	}
	

}
