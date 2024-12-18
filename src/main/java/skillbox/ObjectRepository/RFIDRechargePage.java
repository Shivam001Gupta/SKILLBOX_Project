package skillbox.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class RFIDRechargePage extends WebDriverUtility {
	
	
	
	@FindBy(xpath="//input[@placeholder='Enter Name']")
	private WebElement fullNameEdt;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	private WebElement emailEdt;
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	private WebElement mobileNumberEdt;
	
	@FindBy(xpath="//input[@placeholder='Enter Amount']")
	private WebElement amountEdt;

	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//button[@id='paymentButton']")
	private WebElement finalpaymentBtn;
	
	

	public RFIDRechargePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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

	public WebElement getAmountEdt() {
		return amountEdt;
	}


	public WebElement getPayConfirmationClk() {
		return submitBtn;
	}

	public WebElement getFinalpaymentBtn() {
		return finalpaymentBtn;
	}


	
	
	
	
	public void rfiduserdetail(WebDriver driver, String name, String email, String amount, String mobile) throws Throwable
	{
		fullNameEdt.sendKeys(name);
		emailEdt.sendKeys(email);
		mobileNumberEdt.sendKeys(mobile);
		amountEdt.sendKeys(amount);
		submitBtn.click();
		waitForElementToBeVisible(driver, finalpaymentBtn);
		Thread.sleep(2000);
		finalpaymentBtn.click();
		
		
		
		
	}
	
	
	
	
	
	
	

}
