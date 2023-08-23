package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class PromoterDetailsPage extends WebDriverUtility {
	
	
	@FindBy(xpath="//button[text()='+ Add Promoters']")
	private WebElement addPromoterBtn;
	
	@FindBy(xpath="//button[text()='+ Add WalkIn']")
	private WebElement addWalkinBtn;
	
	@FindBy(xpath="(//input[@placeholder='Full Name'])[2]")
	private WebElement promoterFullNameEdt;
	
	@FindBy(xpath="(//input[@placeholder='Email'])[2]")
	private WebElement promoterEmailEdt;
	
	@FindBy(xpath="(//input[@placeholder='Mobile Number'])[2]")
	private WebElement promoterMobileNumberEdt;
	
	@FindBy(xpath="(//button[text()=' Add '])[2]")
	private WebElement promoterAddBtn;
	
	@FindBy(xpath="(//input[@placeholder='Full Name'])[1]")
	private WebElement walkinFullNameEdt;
	
	@FindBy(xpath="(//input[@placeholder='Email'])[1]")
	private WebElement walkinEmailEdt;
	
	@FindBy(xpath="(//input[@placeholder='Mobile Number'])[1]")
	private WebElement walkinMobileNumberEdt;
	
	@FindBy(xpath="(//button[text()=' Add '])[1]")
	private WebElement walkinAddBtn;
	
	@FindBy(linkText="Delete")
	private WebElement deleteclk;
	
	@FindBy(xpath="//span[text()='Yes']/..")
	private WebElement deleteConfirmYes;
	
	
	
	public PromoterDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getAddPromoterBtn() {
		return addPromoterBtn;
	}

	public WebElement getAddWalkinBtn() {
		return addWalkinBtn;
	}

	
	public WebElement getPromoterFullNameEdt() {
		return promoterFullNameEdt;
	}

	public WebElement getPromoterEmailEdt() {
		return promoterEmailEdt;
	}

	public WebElement getPromoterMobileNumberEdt() {
		return promoterMobileNumberEdt;
	}

	public WebElement getPromoterAddBtn() {
		return promoterAddBtn;
	}

	public WebElement getWalkinFullNameEdt() {
		return walkinFullNameEdt;
	}

	public WebElement getWalkinEmailEdt() {
		return walkinEmailEdt;
	}

	public WebElement getWalkinMobileNumberEdt() {
		return walkinMobileNumberEdt;
	}

	public WebElement getWalkinAddBtn() {
		return walkinAddBtn;
	}
	
	public WebElement getDeleteclk() {
		return deleteclk;
	}


	public WebElement getDeleteConfirmYes() {
		return deleteConfirmYes;
	}
	
	/**
	 * This Method is used to perform Delete Action
	 * @throws Throwable
	 */
	public void delete(WebDriver driver) throws Throwable {
		waitForElementToBeVisible(driver, deleteclk);
		deleteclk.click();
		Thread.sleep(2000);
		deleteConfirmYes.click();
	}
	

	/**
	 * This Method is used to Add Promoter
	 * @param driver
	 * @param fullname
	 * @param email
	 * @param mobile
	 * @throws Throwable
	 */
	public void addpromoter(WebDriver driver, String fullname, String email,String mobile ) throws Throwable {
		waitForElementToBeVisible(driver, addPromoterBtn);
		Thread.sleep(2000);
		addPromoterBtn.click();
		promoterFullNameEdt.sendKeys(fullname);
		promoterEmailEdt.sendKeys(email);
		promoterMobileNumberEdt.sendKeys(mobile);
		promoterAddBtn.click();
		waitForElementToBeVisible(driver, addPromoterBtn);
		delete(driver);
	}
	
	/**
	 * This Method is used to Add WalkIn
	 * @param driver
	 * @param fullname
	 * @param email
	 * @param mobile
	 * @throws Throwable
	 */
	public void addwalkin(WebDriver driver, String fullname, String email,String mobile ) throws Throwable {
		waitForElementToBeVisible(driver, addWalkinBtn);
		Thread.sleep(2000);
		addWalkinBtn.click();
		walkinFullNameEdt.sendKeys(fullname);
		walkinEmailEdt.sendKeys(email);
		walkinMobileNumberEdt.sendKeys(mobile);
		walkinAddBtn.click();
		waitForElementToBeVisible(driver, addWalkinBtn);
		delete(driver);
	}

	

}
