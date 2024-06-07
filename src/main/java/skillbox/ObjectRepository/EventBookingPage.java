package skillbox.ObjectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import skillbox.GenericUtilities.WebDriverUtility;

public class EventBookingPage extends WebDriverUtility {
	
	

	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement emailOnEventBook;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement eventBookCntbtn;
	
	@FindBy(xpath="//small[@class='cursor-pointer']")
	private WebElement loginViaPassword;
	
	@FindBy(xpath="//input[@placeholder='Create Password']")
	private WebElement createPasswordOnEventBookEdt;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	private WebElement passwordOnEventBookEdt;
	
	@FindBy(linkText="Sign out")
	private WebElement signOutFromEventBook;
	
	@FindBy(xpath="//input[@placeholder='Your Name']")
	private WebElement nameOnEventBookEdt;
	
	@FindBy(xpath="//input[@placeholder='Mobile']")
	private WebElement mobileOnEventBookEdt;
		
	@FindBy(xpath="//a[@data-target='#couponModal']")
	private WebElement couponDiscount;	
	
	@FindBy(xpath="//input[@placeholder='Have a Promo Code?']")
	private WebElement couponCodeonEventBookEdt;
	
	@FindBy(xpath="//button[text()='APPLY']")
	private WebElement applyCouponBtn;
	
	@FindBy(xpath="//input[@placeholder='Pincode*']")
	private WebElement pinCodeEdt;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement confirmPay;
	
	@FindBy(xpath="//a[@data-target='#couponModal']")
	private WebElement couponPopUPClk;
	
	@FindBy(xpath="//input[@placeholder='Have a Promo Code?']")
	private WebElement promoCodeEdt;
	
	@FindBy(xpath="//button[text()='APPLY']")
	private WebElement applyBtn;
	
	@FindBy(xpath="//*[@id='couponModal']/div/div/div[2]/p")
	private WebElement errorTextMsg;
	
	@FindBy(xpath="//h2[@class='ng-star-inserted']")
	private WebElement freeTicketConfirmationMsg;
	
	@FindBy(xpath="//*[text()=' Confirm ']/..")
	private WebElement acceptCovidguidelines;
	
	@FindBy(xpath="//p[@data-target='#formQuestionModal']")
	private WebElement addGuestBtn;
	
	@FindBy(xpath="(//input[@placeholder='Your Name'])[2]")
	private WebElement nameGuestEdt;
	
	@FindBy(xpath="(//input[@placeholder='Email address'])[2]")
	private WebElement emailGuestEdt;
	
	@FindBy(xpath="//span[text()='Male']")
	private WebElement genderRadioGuest;
	
	@FindBy(xpath="//span[text()='Burger']")
	private WebElement checkBoxGuest;
	
	@FindBy(xpath="//button[text()='Save ']")
	private WebElement guestSaveBtn;
	
	
	
	
	

	public EventBookingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailOnEventBook() {
		return emailOnEventBook;
	}

	public WebElement getEventBookCntbtn() {
		return eventBookCntbtn;
	}

	public WebElement getLoginViaPassword() {
		return loginViaPassword;
	}

	public WebElement getPasswordOnEventBookEdt() {
		return passwordOnEventBookEdt;
	}
	
	public WebElement getCreatePasswordOnEventBookEdt() {
		return createPasswordOnEventBookEdt;
	}

	public WebElement getSignOutFromEventBook() {
		return signOutFromEventBook;
	}

	public WebElement getNameOnEventBookEdt() {
		return nameOnEventBookEdt;
	}

	public WebElement getMobileOnEventBookEdt() {
		return mobileOnEventBookEdt;
	}

	public WebElement getCouponDiscount() {
		return couponDiscount;
	}

	public WebElement getCouponCodeonEventBookEdt() {
		return couponCodeonEventBookEdt;
	}

	public WebElement getApplyCouponBtn() {
		return applyCouponBtn;
	}

	public WebElement getPinCodeEdt() {
		return pinCodeEdt;
	}

	public WebElement getConfirmPay() {
		return confirmPay;
	}
	
	public WebElement getCouponPopUPClk() {
		return couponPopUPClk;
	}

	public WebElement getPromoCodeEdt() {
		return promoCodeEdt;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}

	public WebElement getErrorTextMsg() {
		return errorTextMsg;
	}
	
	public WebElement getFreeTicketConfirmationMsg() {
		return freeTicketConfirmationMsg;
	}
	
	public WebElement getAddGuestBtn() {
		return addGuestBtn;
	}

	public WebElement getGenderRadioGuest() {
		return genderRadioGuest;
	}

	public WebElement getCheckBoxGuest() {
		return checkBoxGuest;
	}
	
	public WebElement getGuestSaveBtn() {
		return guestSaveBtn;
	}

	
	public WebElement getNameGuestEdt() {
		return nameGuestEdt;
	}

	public WebElement getEmailGuestEdt() {
		return emailGuestEdt;
	}

	public void loginOnEventBook(WebDriver driver, String email, String password ) throws Throwable
	{
		waitForElementToBeVisible(driver, emailOnEventBook);
		Thread.sleep(2000);
		emailOnEventBook.sendKeys(email);
		eventBookCntbtn.click();
		Thread.sleep(3000);
		loginViaPassword.click();
		Thread.sleep(2000);
		passwordOnEventBookEdt.sendKeys(password);
		eventBookCntbtn.click();
				
	}
	
	
	public void signupOnEventBook(WebDriver driver, String name, String number, String password) throws Throwable
	{
		
		waitForElementToBeVisible(driver, emailOnEventBook);
		Thread.sleep(2000);
		String c = RandomStringUtils.randomAlphabetic(7);
        System.out.println(c);
		emailOnEventBook.sendKeys(c+"@gmail.com");
		eventBookCntbtn.click();
		waitForElementToBeVisible(driver, nameOnEventBookEdt);
		nameOnEventBookEdt.sendKeys(name);
		mobileOnEventBookEdt.sendKeys(number);
		createPasswordOnEventBookEdt.sendKeys(password);
		eventBookCntbtn.click();
		signOutFromEventBook.click();
	
	}
	
	public void couponModelEventBook(WebDriver driver, String Coupon1, String Coupon2, String Coupon3, String Coupon4 ) throws Throwable
	
	{
		waitForElementToBeVisible(driver, couponPopUPClk);
		System.out.println("Coupons Models");
		System.out.println(couponPopUPClk.getText());
		couponPopUPClk.click();
		Thread.sleep(3000);
		promoCodeEdt.sendKeys(Coupon1);
		Thread.sleep(2000);
		applyBtn.click();
		Thread.sleep(2000);
		System.out.println(errorTextMsg.getText());
		promoCodeEdt.clear();
		promoCodeEdt.sendKeys(Coupon2);
		applyBtn.click();
		System.out.println(errorTextMsg.getText());
		promoCodeEdt.clear();
		promoCodeEdt.sendKeys(Coupon3);
		Thread.sleep(2000);
		applyBtn.click();
		promoCodeEdt.clear();
		promoCodeEdt.sendKeys(Coupon4);
		applyBtn.click();
		Thread.sleep(3000);
		
		
		
	}
	
	public void pinAndPay(WebDriver driver, String pincode)
	{
		pinCodeEdt.sendKeys(pincode);
		confirmPay.click();
			
	}
	
	public void supersonicPay(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		confirmPay.click();
		Thread.sleep(3000);
		acceptCovidguidelines.click();
			
	}
	
	public void freeticketconfirmation(WebDriver driver) throws Throwable
	{
		waitForElementToBeVisible(driver,freeTicketConfirmationMsg);
		Thread.sleep(2000);
		
	}
	
	public void addGuestConfirm(WebDriver driver, String email, String name, String number) throws Throwable
	{
		addGuestBtn.click();
		Thread.sleep(3000);
		emailGuestEdt.sendKeys(email);				
		nameGuestEdt.sendKeys(name);
		mobileOnEventBookEdt.sendKeys(number);
		Thread.sleep(2000);
		genderRadioGuest.click();
		Thread.sleep(2000);
		checkBoxGuest.click();
		Thread.sleep(2000);
		guestSaveBtn.click();
		
		

	}
	
	
	
	
	 
    
	   
	

}
