package skillbox.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.IConstants;
import skillbox.GenericUtilities.WebDriverUtility;

public class PunchSalesPage extends WebDriverUtility {
	
	@FindBy(xpath="//h6[text()='Skillbox Paid Event KT (INR 100 - 10000)']/../../../div[2]/div/button")
	private WebElement punchInSalesBtn;
	
	@FindBy(xpath="//button[text()='+ Punch Sale']")
	private WebElement punchSalesBtn;
	
	@FindBy(xpath="//input[@placeholder='Full Name']")
	private WebElement fullNameEdt;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement emailEdt;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	private WebElement mobileNumberEdt;
	
	@FindBy(xpath="//nz-select[@formcontrolname='category']")
	private WebElement categoryClk;
	
	@FindBy(xpath="//nz-option-item/div")
	private List<WebElement>listItems;
	
	@FindBy(xpath="//input[@placeholder='Amount']")
	private WebElement amountEdt;
	
	@FindBy(xpath="//nz-select[@formcontrolname='no_of_tkt']")
	private WebElement noOfTicketClk;
	
	@FindBy(xpath="//nz-select[@formcontrolname='is_paid']")
	private WebElement payConfirmationClk;
	
	@FindBy(xpath="//nz-select[@formcontrolname='payment_mode']")
	private WebElement paymentModeClk;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[text()='+ Bulk Punch Sale']")
	private WebElement bulkPunchSalesBtn;
	
	@FindBy(xpath="//input[@class='d-none']")
	private WebElement bulkPunchUpload;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	private WebElement submitBulkPunchBtn;
	
	@FindBy(xpath="//td[text()='Shubham Gupta']")
	private WebElement saleEntryVerify;
	
	@FindBy(xpath="(//button[text()='Send Mail'])[1]")
	private WebElement sendMailBtn;
	
	@FindBy(xpath="(//button[text()='Yes'])[1]")
	private WebElement yesBtn;
	
	@FindBy(xpath="//div[@class='ant-message']/nz-message")
	private WebElement succesmsg;
	
	@FindBy(xpath="//*[@preserveAspectRatio='xMidYMid']")
	private WebElement loader;
	
	
	
	
	


	public PunchSalesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPunchInSalesBtn() {
		return punchInSalesBtn;
	}


	public WebElement getPunchSalesBtn() {
		return punchSalesBtn;
	}


	public WebElement getFullNameEdt() {
		return fullNameEdt;
	}


	public WebElement getEmailEdt() {
		return emailEdt;
	}


	public WebElement getMobileNumberEdt() {
		return mobileNumberEdt;
	}


	public WebElement getCategoryClk() {
		return categoryClk;
	}


	public List<WebElement> getListItems() {
		return listItems;
	}


	public WebElement getAmountEdt() {
		return amountEdt;
	}


	public WebElement getNoOfTicketClk() {
		return noOfTicketClk;
	}


	public WebElement getPayConfirmationClk() {
		return payConfirmationClk;
	}


	public WebElement getPaymentModeClk() {
		return paymentModeClk;
	}


	public WebElement getAddBtn() {
		return addBtn;
	}
	
	public WebElement getBulkPunchSalesBtn() {
		return bulkPunchSalesBtn;
	}

	public WebElement getBulkPunchUpload() {
		return bulkPunchUpload;
	}

	public WebElement getSubmitBulkPunchBtn() {
		return submitBulkPunchBtn;
	}

	public WebElement getSaleEntryVerify() {
		return saleEntryVerify;
	}
	
	public WebElement getSendMailBtn() {
		return sendMailBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	public WebElement getSuccesmsg() {
		return succesmsg;
	}
	
	public WebElement getLoader() {
		return loader;
	}
	
	public void punchSalesForm(WebDriver driver, String fullname, String email, String mobilenumber, String ticketname, String amount, String noofticket) throws InterruptedException
	{
		waitForElementToBeVisible(driver, punchInSalesBtn);
		Thread.sleep(2000);
		punchInSalesBtn.click();
		Thread.sleep(2000);
		punchSalesBtn.click();
		fullNameEdt.sendKeys(fullname);
		emailEdt.sendKeys(email);
		mobileNumberEdt.sendKeys(mobilenumber);
		categoryClk.click();
		Thread.sleep(1000);
		selectItemFromList(driver, ticketname , listItems);
		Thread.sleep(2000);
		amountEdt.sendKeys(amount);
		noOfTicketClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, noofticket , listItems);
		payConfirmationClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, "Yes" , listItems);
		paymentModeClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, "Cash" , listItems);
		addBtn.click();
		Thread.sleep(2000);
		waitForElementToBeInvisible(driver, loader);		
		Thread.sleep(2000);
		sendMailBtn.click();
		waitForElementToBeVisible(driver, yesBtn);
		Thread.sleep(2000);
		yesBtn.click();		
		waitForElementToBeVisible(driver, succesmsg);
		System.out.println(succesmsg.getText());
		
		
	}
	
	public void bulkPunchSales(WebDriver driver) throws Throwable
	{
		bulkPunchSalesBtn.click();
		bulkPunchUpload.sendKeys(IConstants.bulkPunchSalesFilePath);
		Thread.sleep(3000);
		submitBulkPunchBtn.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	

}
