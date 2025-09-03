package skillbox.ObjectRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	

	@FindBy(linkText ="Events")
	private WebElement eventsLnk;
	
	@FindBy(linkText= "Feeds")
	private WebElement feedsLnk;
	
	@FindBy(linkText ="Create Listings")
	private WebElement createListingLnk;
	
	@FindBy(xpath="//button[text()='Login/Sign Up']")
	private WebElement loginSignUpBtn;

	@FindBy(linkText="Sign up")
	private WebElement signUpLnk;
	
	@FindBy(xpath="//input[@value='A']")
	private WebElement artistType;
	
	@FindBy(xpath="//input[@value='F']")
	private WebElement fanType;
	
	@FindBy(xpath="//input[@value='B']")
	private WebElement BusinessType;
	
	@FindBy (xpath="//button[.='Sign up']")
	private WebElement signUpBtn;

	@FindBy(xpath="//button[text()='Continue with email or mobile']")
	private WebElement continuteWithEmailBtn;
	        
	@FindBy(xpath="//small[text()='Login via Password ']")
	private WebElement loginViaPassword;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement nameEdt;
	
	@FindBy(xpath="//input[@placeholder='Email or Mobile']")
	private WebElement emailIdEdt;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement emailEdt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@placeholder='Mobile']")
	private WebElement mobileEdt;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(id="dropdownMenuLink")
	private WebElement dropDownMenuLink;
	
	@FindBy(xpath="//*[text()='Profile Settings']")
	private WebElement profileSettingLnk;
	
	@FindBy(linkText="Promoter Sales")
	private WebElement promoterSalesLnk;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLnk;
	
	@FindBy(linkText="Skip for now")
	private WebElement skipForNow;
	
	@FindBy(linkText="Profile Settings")
	private WebElement profileSettings;
	
	@FindBy(linkText="Manage DIY Event")
	private WebElement manageDiyEventClk;
	
	@FindBy(xpath ="//*[text()='Profile']")
	private WebElement profile;
		
	@FindBy(xpath="//a[@class='icon-search search_header']")
	private WebElement searchclk;
	
	@FindBy(xpath="//input[@placeholder='Events, artists or celebrities']")
	private WebElement searchedt;
	
	@FindBy(linkText="Manage Sales")
	private WebElement manageSalesClk;
	
	
	@FindBy(linkText="Transactions")
	private WebElement transactionsclk;
	
	
	
	

	

	


	


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getEventsLnk() {
		return eventsLnk;
	}

	public WebElement getFeedsLnk() {
		return feedsLnk;
	}

	public WebElement getCreateListingLnk() {
		return createListingLnk;
	}

	public WebElement getDropDownMenuLink() {
		return dropDownMenuLink;
	}
	
	public WebElement getSignUpLnk() {
		return signUpLnk;
	}
	
	public WebElement getArtistType() {
		return artistType;
	}


	public WebElement getFanType() {
		return fanType;
	}


	public WebElement getBusinessType() {
		return BusinessType;
	}


	public WebElement getSignUpBtn() {
		return signUpBtn;
	}
	
	public WebElement getLoginSignUpBtn() {
		return loginSignUpBtn;
	}


	public WebElement getContinuteWithEmailBtn() {
		return continuteWithEmailBtn;
	}

	public WebElement getNameEdt() {
		return nameEdt;
	}


	public WebElement getMobileEdt() {
		return mobileEdt;
	}
	
	public WebElement getLoginViaPassword() {
		return loginViaPassword;
	}


	public WebElement getEmailIdEdt() {
		return emailIdEdt;
	}
	
	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getProfileSettingLnk() {
		return profileSettingLnk;
	}

	public WebElement getPromoterSalesLnk() {
		return promoterSalesLnk;
	}

	public WebElement getLogoutLnk() {
		return logoutLnk;
	}
	
	public WebElement getSkipForNow() {
		return skipForNow;
	}
	

	public WebElement getProfileSettings() {
		return profileSettings;
	}
	
	public WebElement getManageDiyEventClk() {
		return manageDiyEventClk;
	}
	
	public WebElement getProfile() {
		return profile;
	}
	
	public WebElement getSearchclk() {
		return searchclk;
	}


	public WebElement getSearchedt() {
		return searchedt;
	}
	
	public WebElement getManageSalesClk() {
		return manageSalesClk;
	}
	
	public WebElement getTransactionsclk() {
		return transactionsclk;
	}

	
	public void logoutOfApp (WebDriver driver) throws Throwable
	{
		dropDownMenuLink.click();
		Thread.sleep(1000);
		logoutLnk.click();
	}
	
	public void clickOnEvent(WebDriver driver)
	{
		eventsLnk.click();
	}
	
	public void clickOnPromoterSales (WebDriver driver, String email, String password) throws Throwable
	{
		loginSignUpBtn.click();
		continuteWithEmailBtn.click();
		Thread.sleep(2000);
		loginViaPassword.click();
		Thread.sleep(2000);
		emailIdEdt.sendKeys(email);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		Thread.sleep(5000);
		dropDownMenuLink.click();
		Thread.sleep(2000);
		promoterSalesLnk.click();
				
	}
	
	public void signUp(WebDriver driver, String name, String password) throws InterruptedException
	{
		loginSignUpBtn.click();
		signUpLnk.click();
		nameEdt.sendKeys(name);
		String c = RandomStringUtils.randomNumeric(10);
		emailEdt.sendKeys(c+"@ghel.com");
		mobileEdt.sendKeys(c);
		passwordEdt.sendKeys(password);		
	}
	
	
	public void signUpArtist(WebDriver driver) throws Throwable
	{
		artistType.click();
		signUpBtn.click();
		waitForElementToBeVisible(driver, dropDownMenuLink);
//		waitForElementToBeVisible(driver, skipForNow);
//		skipForNow.click();
		dropDownMenuLink.click();
		Thread.sleep(2000);
		profileSettings.click();
		
	}
	
	public void signUpFan(WebDriver driver) throws Throwable
	{
		fanType.click();
		signUpBtn.click();
		waitForElementToBeVisible(driver, dropDownMenuLink);
//		waitForElementToBeVisible(driver, skipForNow);
//		skipForNow.click();
		dropDownMenuLink.click();
		Thread.sleep(2000);
		profileSettings.click();
		
	}
	
	public void signUpBusiness(WebDriver driver) throws Throwable
	{
		BusinessType.click();
		signUpBtn.click();
		waitForElementToBeVisible(driver, dropDownMenuLink);
//		waitForElementToBeVisible(driver, skipForNow);
//		skipForNow.click();
		dropDownMenuLink.click();
		Thread.sleep(2000);
		profileSettings.click();
		
	}
	
	public void loginUser (WebDriver driver, String email, String password) throws Throwable
	{
		loginSignUpBtn.click();
		continuteWithEmailBtn.click();
		loginViaPassword.click();
		Thread.sleep(1000);
		emailIdEdt.sendKeys(email);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		Thread.sleep(5000);
		
	}
	
	public void clickOnCreateListingLnk(WebDriver driver) throws InterruptedException
	{
//		Thread.sleep(5000);
		createListingLnk.click();
	}
	
	public void selectManageDiy(WebDriver driver) throws InterruptedException
	{
		dropDownMenuLink.click();
		Thread.sleep(2000);
		manageDiyEventClk.click();
		
	}
	
	public void selectUpdateWork(WebDriver driver)throws InterruptedException
	{
		dropDownMenuLink.click();
		Thread.sleep(2000);
		profile.click();
	}
	
	public void searchEvent(WebDriver driver, String eventName) throws InterruptedException
	{
		searchclk.click();
		Thread.sleep(5000);
		searchedt.sendKeys(eventName);
		
	}
	
	public void selectmangesales(WebDriver driver)throws InterruptedException
	{
		dropDownMenuLink.click();
		Thread.sleep(2000);
		manageSalesClk.click();
	}
	
	public void selectTransaction(WebDriver driver)throws InterruptedException
	{
		dropDownMenuLink.click();
		Thread.sleep(2000);
		transactionsclk.click();
	}
	
	
	
	

}
