package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class EventDetailPage extends WebDriverUtility {
	
	@FindBy(xpath ="//a[@class='btn bg-white text-dark font-m me-3']")
	private WebElement bookBtnLnk;	
	
	@FindBy(xpath ="//button[@class='btn bg-white text-dark font-m me-4']")
	private WebElement bookBtnSeat;


    public EventDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBookBtnLnk() {
		return bookBtnLnk;
	}
	
	public WebElement getBookBtnSeat() {
		return bookBtnSeat;
	}
	
	public void clickbooknowbtn(WebDriver driver) throws InterruptedException
	{
		waitForElementToBeVisible(driver, bookBtnLnk);
		bookBtnLnk.click();
		Thread.sleep(5000);
	}
	
	public void clickbooknowbtnseat(WebDriver driver) throws InterruptedException
	{
		waitForElementToBeVisible(driver, bookBtnSeat);
		bookBtnSeat.click();
		Thread.sleep(5000);
	}




	
	
	
	
	
	

}
