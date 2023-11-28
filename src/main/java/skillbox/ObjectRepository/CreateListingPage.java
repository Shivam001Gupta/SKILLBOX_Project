package skillbox.ObjectRepository;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.IConstants;
import skillbox.GenericUtilities.WebDriverUtility;

public class CreateListingPage extends WebDriverUtility {
	

	@FindBy(xpath="//input[@placeholder='Put up a title for your Event']")
	private WebElement eventTitleTextEdt;
	
	@FindBy(xpath="//div[@class='row']/div[4]/nz-select")
	private WebElement categoryClk;
	
	@FindBy(xpath="//li[@unselectable='unselectable']")
	private List<WebElement> listItems;
	
	@FindBy(xpath="//nz-select[@nzplaceholder='Select Tags']")
	private WebElement tagsclk;
	
	@FindBy(xpath="//div[@class='col-lg-8 form-group form-label text-left mt-4']/input[1]")
	private WebElement uploadEventCover;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement imgSaveBtn;
	
	@FindBy(xpath="//*[text()='Multiple Day Event ']/span")
	private WebElement selectMultipleDayEventClk;
	
	@FindBy(xpath="//input[@placeholder='Start date']")
	private WebElement selectDateclk;
	
	@FindBy(xpath="(//div[@aria-disabled='false'])[2]")
	private WebElement selectStartDate;
	
	@FindBy(xpath="(//div[@aria-disabled='false'])[3]")
	private WebElement selectEndDate;
		
	@FindBy(xpath="//input[@placeholder='Start Time']")
	private WebElement selectStartTimeClk;
	
	@FindBy(xpath="//li[@class='ant-time-picker-panel-select-option-selected ng-star-inserted']")
	private WebElement selectTime;
	
	@FindBy(xpath="//input[@placeholder='End Time']")
	private WebElement slectEndTimeClk;
	
	@FindBy(xpath="//button[@nztype='primary']")
	private WebElement selectTimeBtn;
	
	@FindBy(xpath="//*[text()='Description']/..//angular-editor/div/div/div")
	private WebElement eventDescriptionEdt;
	
	@FindBy(xpath="//div[text()='Search city']")
	private WebElement selectCityClk;
	
	@FindBy(xpath="//label[text()='Venue']/../nz-select")
	private WebElement selectVenueClk;
	
	@FindBy(xpath="//input[@placeholder='Search Venue..']")
	private WebElement searchVenueEdt;
	
	@FindBy(xpath="//div[@class='gs_text']")
	private WebElement selectVenue;
	
	@FindBy(xpath="//button[text()='Save & Continue']")
	private WebElement saveContinueBtn;
	
	@FindBy(xpath="//p[text()='Tickets']/..")
	private WebElement selectTicketSection;
	
	@FindBy(linkText="Paid")
	private WebElement paidTicketClk;
	
	@FindBy(linkText="RSVP/Free")
	private WebElement freeTicketClk;
		
	@FindBy(xpath="//input[@placeholder='Ticket Name']")
	private WebElement ticketNameEdt;
	
	@FindBy(xpath="//input[@placeholder='Ticket price']")
	private WebElement ticketPriceEdt;
	
	@FindBy(xpath="//select[@formcontrolname='gstType']")
	private WebElement selectGstType;
	
	@FindBy(xpath="//input[@placeholder='Ticket quantity']")
	private WebElement ticketQuantity;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement ticketSubmitBtn;
	
	@FindBy(xpath="//span[text()='No']/..")
	private WebElement ticketEnableBtn;
	
	@FindBy(xpath="//div[text()=' Add More Tickets '][1]")
	private WebElement addMoreTicketClk;

	@FindBy(xpath="//*[text()='Manage Discounts']")
	private WebElement couponManageDiscountsClk;
	
	@FindBy(xpath="//input[@placeholder='Coupon Name']")
	private WebElement couponNameEdt;
	
	@FindBy(xpath="//input[@placeholder='Quantity']")
	private WebElement couponQuantity;
	
	@FindBy(xpath="//input[@placeholder= 'Discount Value']")
	private WebElement couponDiscountValue;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement couponAddBtn;
	
	@FindBy(linkText="Delete")
	private WebElement deleteclk;
	
	@FindBy(xpath="//span[text()='Yes']/..")
	private WebElement deleteConfirmYes;
	
	@FindBy(xpath="//h4[@class='text-dark']")
	private WebElement successcouponchk;
			
	public CreateListingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEventTitleTextEdt() {
		return eventTitleTextEdt;
	}

	public WebElement getCategoryClk() {
		return categoryClk;
	}

	public List<WebElement> getListItems() {
		return listItems;
	}

	public WebElement getTagsclk() {
		return tagsclk;
	}

	public WebElement getUploadEventCover() {
		return uploadEventCover;
	}

	public WebElement getImgSaveBtn() {
		return imgSaveBtn;
	}
	
	public WebElement getSelectMultipleDayEventClk() {
		return selectMultipleDayEventClk;
	}

	public WebElement getSelectDateclk() {
		return selectDateclk;
	}

	public WebElement getSelectStartDate() {
		return selectStartDate;
	}
	
	public WebElement getSelectEndDate() {
		return selectEndDate;
	}

	public WebElement getSelectStartTimeClk() {
		return selectStartTimeClk;
	}

	public WebElement getSelectTime() {
		return selectTime;
	}

	public WebElement getSlectEndTimeClk() {
		return slectEndTimeClk;
	}

	public WebElement getSelectTimeBtn() {
		return selectTimeBtn;
	}

	public WebElement getEventDescriptionEdt() {
		return eventDescriptionEdt;
	}

	public WebElement getSelectCityClk() {
		return selectCityClk;
	}

	public WebElement getSelectVenueClk() {
		return selectVenueClk;
	}

	public WebElement getSearchVenueEdt() {
		return searchVenueEdt;
	}

	public WebElement getSelectVenue() {
		return selectVenue;
	}

	public WebElement getSaveContinueBtn() {
		return saveContinueBtn;
	}
	
	
	public WebElement getSelectTicketSection() {
		return selectTicketSection;
	}

	public WebElement getTicketNameEdt() {
		return ticketNameEdt;
	}

	public WebElement getTicketPriceEdt() {
		return ticketPriceEdt;
	}

	public WebElement getSelectGstType() {
		return selectGstType;
	}

	public WebElement getTicketQuantity() {
		return ticketQuantity;
	}

	public WebElement getTicketSubmitBtn() {
		return ticketSubmitBtn;
	}

	public WebElement getTicketEnableBtn() {
		return ticketEnableBtn;
	}
	

	public WebElement getPaidTicketClk() {
		return paidTicketClk;
	}
	
	public WebElement getFreeTicketClk() {
		return freeTicketClk;
	}
	
	public WebElement getAddMoreTicketClk() {
		return addMoreTicketClk;
	}

	
	public WebElement getCouponManageDiscountsClk() {
		return couponManageDiscountsClk;
	}

	public WebElement getCouponNameEdt() {
		return couponNameEdt;
	}

	public WebElement getCouponQuantity() {
		return couponQuantity;
	}

	public WebElement getCouponDiscountValue() {
		return couponDiscountValue;
	}

	public WebElement getCouponAddBtn() {
		return couponAddBtn;
	}

	public WebElement getDeleteclk() {
		return deleteclk;
	}

	
	public WebElement getDeleteConfirmYes() {
		return deleteConfirmYes;
	}

	public WebElement getSuccesscouponchk() {
		return successcouponchk;
	}


	
	/**
	 * This Function is used to Put Date and Time
	 * @param driver
	 * @throws Throwable
	 */
	public void dateAndTime(WebDriver driver) throws Throwable
	{
		selectDateclk.click();
		selectStartDate.click();
		selectEndDate.click();
		selectStartTimeClk.click();
		Thread.sleep(2000);
		selectTime.click();
		escapeClickAction(driver);
		Thread.sleep(2000);
		slectEndTimeClk.click();
		Thread.sleep(2000);
		selectTime.click();
		escapeClickAction(driver);
		Thread.sleep(5000);
			
	}
	
	

	public void fillDiyForm(WebDriver driver, String city) throws Throwable
	{
		Thread.sleep(5000);
		eventTitleTextEdt.sendKeys("The Title of Event Night Club TEST");
		categoryClk.click();
		Thread.sleep(3000);
		selectItemFromList(driver, "Poetry Events", listItems);
		tagsclk.click();
		Thread.sleep(3000);
		selectItemFromList(driver, "Online Streaming", listItems);
		escapeClickAction(driver);
		uploadEventCover.sendKeys(IConstants.imageFilePath);
		Thread.sleep(3000);
		imgSaveBtn.click();
		Thread.sleep(3000);
		selectMultipleDayEventClk.click();
		dateAndTime(driver);
		eventDescriptionEdt.sendKeys("This is the Event Description of the Check Point");
		selectCityClk.click();
		selectItemFromList(driver, city, listItems);
		selectVenueClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, "Decided", listItems);
		searchVenueEdt.sendKeys("Auro");
		Thread.sleep(3000);
		selectVenue.click();
		Thread.sleep(3000);
		saveContinueBtn.click();
		
	}
	
	public void createTicket(WebDriver driver, String ticketname ) throws Throwable
	{
		waitForElementToBeVisible(driver, selectTicketSection);
		Thread.sleep(2000);
		selectTicketSection.click();
		waitForElementToBeVisible(driver, paidTicketClk);
		paidTicketClk.click();
		ticketNameEdt.sendKeys(ticketname);
		dateAndTime(driver);
		ticketPriceEdt.sendKeys("799");
		selectGstType.click();
		ticketQuantity.sendKeys("100");
		ticketSubmitBtn.click();
		Thread.sleep(2000);
		ticketEnableBtn.click();
		
	}
	
	public void createFreeTicket(WebDriver driver, String ticketname ) throws Throwable
	{
		waitForElementToBeVisible(driver, addMoreTicketClk);
		Thread.sleep(5000);
		addMoreTicketClk.click();
		Thread.sleep(2000);
		waitForElementToBeVisible(driver, freeTicketClk);
		freeTicketClk.click();
		ticketNameEdt.sendKeys(ticketname);
		dateAndTime(driver);
		ticketQuantity.sendKeys("100");
		ticketSubmitBtn.click();
		Thread.sleep(2000);
		ticketEnableBtn.click();
		
	}
	
	
	public void createCoupon(WebDriver driver) throws Throwable
	{
		couponManageDiscountsClk.click();
		waitForElementToBeVisible(driver, couponNameEdt);
		Thread.sleep(2000);
		String c = RandomStringUtils.randomAlphabetic(7);
		couponNameEdt.sendKeys(c);
		couponQuantity.sendKeys("100");
		dateAndTime(driver);
		couponDiscountValue.sendKeys("10");
		couponAddBtn.click();
		waitForElementToBeVisible(driver, deleteclk);
		Thread.sleep(2000);
		deleteclk.click();
		waitForElementToBeVisible(driver, deleteConfirmYes);
		deleteConfirmYes.click();
		waitForElementToBeVisible(driver, successcouponchk);
		
		
	}

	
	
	
	
	}

