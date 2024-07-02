package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class CampignPage extends WebDriverUtility {
	

	@FindBy(xpath="//button[text()='Edit recipients']")
	private WebElement editRecipientsclk;
	
	@FindBy(xpath="//div[text()='Select a audience']")
	private WebElement selectAudience;
	
	@FindBy(xpath="//span[text()='NewLIILK']")
	private WebElement selectUser;
	
	@FindBy(xpath="//span[text()=' Save ']/..")
	private WebElement saveBtn;
	
	@FindBy(xpath="//button[text()='Send ']")
	private WebElement sendBtn;
	
	@FindBy(xpath="//div[@class='py_detail']/button")
	private WebElement payNowBtn;
	
	@FindBy(xpath="//div[@class='ant-message']/nz-message")
	private WebElement succesmsg;
	
	
	
	
	
	public CampignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getEditRecipientsclk() {
		return editRecipientsclk;
	}

	public WebElement getSelectAudience() {
		return selectAudience;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getSendBtn() {
		return sendBtn;
	}

	public WebElement getPayNowBtn() {
		return payNowBtn;
	}
	
	public WebElement getSelectUser() {
		return selectUser;
	}

	public WebElement getSuccesmsg() {
		return succesmsg;
	}


	
	


	
	/**
	 * This Function is used to Put Date and Time
	 * @param driver
	 * @throws Throwable
	 */
	public void selectContacts(WebDriver driver) throws Throwable
	{
		waitForElementToBeVisible(driver, editRecipientsclk);
		Thread.sleep(2000);
		editRecipientsclk.click();
		Thread.sleep(5000);
		selectAudience.click();
		Thread.sleep(2000);
		selectUser.click();
		Thread.sleep(2000);
		escapeClickAction(driver);
		Thread.sleep(2000);
		saveBtn.click();
		Thread.sleep(2000);
		sendBtn.click();		
		Thread.sleep(5000);
		payNowBtn.click();
		
			
	}
	
	public void successmsgwait(WebDriver driver) throws InterruptedException
	{
		waitForElementToBeVisible(driver, succesmsg);	
		Thread.sleep(2000);
	}


	
	
	
	
	
	

	
	
	
	
	}

