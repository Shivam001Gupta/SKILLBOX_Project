package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class TransactionHistoryPage extends WebDriverUtility{
	

	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div/p[2]")
	private WebElement eventNameTxt;
	
	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div[3]")
	private WebElement orderIdTxt;
	
	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div[4]")
	private WebElement transactionIdTxt;
	
	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div[5]")
	private WebElement quantity;
	
	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div[6]")
	private WebElement paymentAmountTxt;
	
	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div[7]")
	private WebElement statusTxt;
	
	@FindBy(xpath="//div[@class='bg-transaction-light mb-4 ng-star-inserted']/div/div[8]")
	private WebElement orderDateTxt;
	
	@FindBy(xpath="//button[text()='Get Invoice']")
	private WebElement getInvoiceBtn;
	
	@FindBy(xpath="//button[text()='Get Ticket']")
	private WebElement getTicketBtn;
	
	
	
	

	public TransactionHistoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEventNameTxt() {
		return eventNameTxt;
	}

	public WebElement getOrderIdTxt() {
		return orderIdTxt;
	}

	public WebElement getTransactionIdTxt() {
		return transactionIdTxt;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getPaymentAmountTxt() {
		return paymentAmountTxt;
	}

	public WebElement getStatusTxt() {
		return statusTxt;
	}

	public WebElement getOrderDateTxt() {
		return orderDateTxt;
	}

	public WebElement getGetInvoiceBtn() {
		return getInvoiceBtn;
	}

	public WebElement getGetTicketBtn() {
		return getTicketBtn;
	}

	
	
	public void TransactionHistoryDetails(WebDriver driver) throws Throwable
	{
	    waitForElementToBeVisible(driver, eventNameTxt);
		Thread.sleep(2000);
				
		String eventName = eventNameTxt.getText();
		System.out.println(eventName);
		Thread.sleep(2000);
		
		
		String orderId = orderIdTxt.getText();
		System.out.println(orderId);
		Thread.sleep(2000);

		String transactionId = transactionIdTxt.getText();
		System.out.println(transactionId);
		

		String qty = quantity.getText();
		System.out.println(qty);
		Thread.sleep(2000);
		
		String paymentAmount = paymentAmountTxt.getText();
		System.out.println(paymentAmount);
		Thread.sleep(2000);
		
		String status = statusTxt.getText();
		System.out.println(status);
		Thread.sleep(2000);
		
		String orderDate = orderDateTxt.getText();
		System.out.println(orderDate);
		Thread.sleep(2000);
			
		getInvoiceBtn.click();
		Thread.sleep(5000);
//		swtichToWindow(driver, "pdf");
//		System.out.print(driver.getCurrentUrl()+"\n");
//		Thread.sleep(5000);
//		driver.close();
//		swtichToWindow(driver, "ticket-bookings");
//		Thread.sleep(5000);
//		System.out.print(driver.getCurrentUrl()+"\n");
		getTicketBtn.click();
		Thread.sleep(5000);
		swtichToWindow(driver, "png");
		System.out.print(driver.getCurrentUrl()+"\n");
		Thread.sleep(5000);
		driver.close();
		swtichToWindow(driver, "ticket-bookings");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
					
	}

	

	
	

}
