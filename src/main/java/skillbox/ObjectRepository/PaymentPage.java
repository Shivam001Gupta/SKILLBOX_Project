package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import skillbox.GenericUtilities.WebDriverUtility;

public class PaymentPage extends WebDriverUtility {
	
	@FindBy(xpath="//label[text()='Wallet']")
	private WebElement walletPaymentMethod;
	
	@FindBy(xpath="(//div[@class='check'])[1]")
	private WebElement phonePePaymentMethod;
	
	@FindBy(id="paymentButton")
	private WebElement payButton;
	
	@FindBy(xpath="//button[text()='Success']")
	private WebElement successBtn;
	
	@FindBy(xpath="//h6[@class='text-dark mb-2']")
	private WebElement eventSBCode;
	
	@FindBy(xpath="//input[@placeholder='Email Id']")
	private WebElement emailIdEdt;
	
	@FindBy(xpath="//input[@name='contact']")
	private WebElement rzpmobno;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement rzpproceed;
	
	@FindBy(xpath="(//img[@src='https://cdn.razorpay.com/wallet-sq/phonepe.png'])[1]")
	private WebElement phonepeClk;
	
	@FindBy(xpath="//span[text()='PhonePe']")
	private WebElement finalPayNow;
	
	@FindBy(xpath="//button[text()='Success']")
	private WebElement succcessBtn;
	
	@FindBy(xpath="(//iframe[@class='razorpay-checkout-frame'])[1]")
	private WebElement rzpframe;
	
	
	
	
	
	

	

	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWalletPaymentMethod() {
		return walletPaymentMethod;
	}

	public WebElement getPhonePePaymentMethod() {
		return phonePePaymentMethod;
	}

	public WebElement getPayButton() {
		return payButton;
	}

	public WebElement getSuccessBtn() {
		return successBtn;
	}
	
	public WebElement getEventSBCode() {
		return eventSBCode;
	}
	

	public WebElement getRzpmobno() {
		return rzpmobno;
	}

	public WebElement getRzpproceed() {
		return rzpproceed;
	}
	
	public WebElement getPhonepeClk() {
		return phonepeClk;
	}

	public WebElement getFinalPayNow() {
		return finalPayNow;
	}
	
	public WebElement getSucccessBtn() {
		return succcessBtn;
	}
	
	public WebElement getRzpframe() {
		return rzpframe;
	}
	
	
	

	public void payAmountSuccess(WebDriver driver) throws Throwable
	{
		waitForElementToBeVisible(driver, walletPaymentMethod);
		walletPaymentMethod.click();
		Thread.sleep(2000);
		phonePePaymentMethod.click();
		Thread.sleep(2000);
		payButton.click();
		Thread.sleep(3000);
		swtichToWindow(driver, "razorpay");
		successBtn.click();
		swtichToWindow(driver, "sbmailer.com");
		waitForElementToBeVisible(driver, eventSBCode);
		Thread.sleep(2000);
		
			
	}
	
	public void payAmountSuccesspopuprfid(WebDriver driver, String mob) throws Throwable
	{
		Thread.sleep(6000);
		driver.switchTo().frame(1);       
		rzpmobno.sendKeys(mob);
		rzpproceed.click();
		Thread.sleep(3000);
		phonepeClk.click();
		Thread.sleep(2000);
		finalPayNow.click();
		Thread.sleep(2000);
		swtichToWindow(driver, "razorpay");
		succcessBtn.click();
		swtichToWindow(driver, "sbmailer.com");
		Thread.sleep(10000);
		waitForElementToBeVisible(driver, eventSBCode);
		Thread.sleep(5000);

		
					
	}
	
	public void payAmountId(WebDriver driver) throws Throwable
	{
		waitForElementToBeVisible(driver, payButton);
		Thread.sleep(2000);
		payButton.click();
		Thread.sleep(2000);
			
			
	}
	
	
	
	public void payAmountSuccesspopup(WebDriver driver, String mob) throws Throwable
	{
		
//		WebElement iframe = rzpframe;
//		//Switch to the frame
//		driver.switchTo().frame(iframe);
		Thread.sleep(6000);
		driver.switchTo().frame(0);       
		rzpmobno.sendKeys(mob);
//		rzpproceed.click();
		Thread.sleep(3000);
		phonepeClk.click();
		Thread.sleep(2000);
		finalPayNow.click();
		Thread.sleep(2000);
		swtichToWindow(driver, "razorpay");
		succcessBtn.click();
		Thread.sleep(10000);		
		swtichToWindow(driver, "sbmailer.com");
		Thread.sleep(5000);
						
	}

	   	
}
