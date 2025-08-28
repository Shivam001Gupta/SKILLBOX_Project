package skillbox.ObjectRepository;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.IConstants;
import skillbox.GenericUtilities.WebDriverUtility;

public class ProfileSettingPage extends WebDriverUtility {	


	


	@FindBy(xpath="//input[@type='file']")
	private WebElement profilePic;
	
	@FindBy(xpath="//button[.='Save']")
	private WebElement profilePicSaveBtn;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement profileNameEdt;
	
	@FindBy(id="gender")
	private WebElement genderSelect;
	
	@FindBy(xpath="//nz-select[@nzplaceholder='Country']")
	private WebElement countryClk;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	private WebElement countryEdt;
	
	@FindBy(xpath="//nz-option-item/div")
	private List<WebElement> listItems;
		
	@FindBy(xpath="//nz-select[@nzplaceholder='City']")
	private WebElement cityClk;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement cityEdt;
	
	@FindBy(xpath="//span[.='DJ/Producer']")
	private WebElement category;
	
	@FindBy(xpath="//nz-select[@nzplaceholder='Select Sub-Category']")
	private WebElement subCategoryClk;
	
	@FindBy(xpath="//nz-select[@nzplaceholder='Select Sub Category']")
	private WebElement subCategorybusinessClk;

	@FindBy(xpath="//button[@id='step1_btn']")
	private WebElement step1BtnArtist;
	
	@FindBy(xpath="//nz-select[@nzplaceholder='Select Language']")
	private WebElement languageClk;
	
	@FindBy(xpath="//select[@placholder='Select Set Type']")
	private WebElement selectSetType;
	
	@FindBy(id="profile_file")
	private WebElement profileFile;
	
	@FindBy(xpath="//textarea[@placeholder='Describe yourself']")
	private WebElement descripeYourselfEdt;
	
	@FindBy(id="step2-btn")
	private WebElement step2BtnArtist;
	
	@FindBy(xpath="//input[@name='facebook']")
	private WebElement faceBookEdt;
	
	@FindBy(xpath="//input[@name='youTube']")
	private WebElement youTubeEdt;
	
	@FindBy(xpath="//input[@name='instagram']")	
	private WebElement instagraEdt;
	
	@FindBy(xpath="//input[@name='twitter']")
	private WebElement twitterEdt;
	
	@FindBy(id="step3-btn")
	private WebElement setp3BtnArtist;
	
	@FindBy(name="TagsCategory")
	private WebElement tagsCategoryClk;
	
	@FindBy(xpath="//button[@class='btn btn-dark float-end col-lg-3 col-12']")
	private WebElement saveBtnClkFan;
	
	@FindBy(xpath="//span[text()='Academy']")
	private WebElement categoryBusinessClk;
	
	@FindBy(xpath="//input[@placeholder='Address/Map Location']")
	private WebElement addressMapLocation;
	
	@FindBy(id="uploadAcademyBroucher")
	private WebElement uploadAcademyPdf;
	
	@FindBy(xpath="//nz-time-picker[@nzplaceholder='Open Time']")
	private WebElement timerClk1;
	
	@FindBy(xpath="//nz-time-picker[@nzplaceholder='Close Time']")
	private WebElement timerClk2;
	
	@FindBy(id="timepicker-item-id-4")
	private WebElement timeSelect1;
	
	@FindBy(id="timepicker-item-id-7")
	private WebElement timeSelect2;
	
	@FindBy(xpath="//button[@ class='atp-ref-dialog-close']")
	private WebElement operationalYearClk;
	
	@FindBy(xpath="//select[@placeholder='Operational Years']")
	private WebElement operationalYearSelect;
	
	@FindBy(xpath="//div[@class='ant-message']/nz-message")
	private WebElement succesmsg;


	public ProfileSettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProfilePic() {
		return profilePic;
	}

	public WebElement getProfilePicSaveBtn() {
		return profilePicSaveBtn;
	}

	public WebElement getProfileNameEdt() {
		return profileNameEdt;
	}

	public WebElement getGenderSelect() {
		return genderSelect;
	}

	public WebElement getCountryClk() {
		return countryClk;
	}
	
	public WebElement getCountryEdt() {
		return countryEdt;
	}


	public List<WebElement> getListItems() {
		return listItems;
	}

	public WebElement getCityClk() {
		return cityClk;
	}

	public WebElement getCityEdt() {
		return cityEdt;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getSubCategoryClk() {
		return subCategoryClk;
	}

	public WebElement getStep1BtnArtist() {
		return step1BtnArtist;
	}

	public WebElement getLanguageClk() {
		return languageClk;
	}

	public WebElement getSelectSetType() {
		return selectSetType;
	}

	public WebElement getProfileFile() {
		return profileFile;
	}

	public WebElement getDescripeYourselfEdt() {
		return descripeYourselfEdt;
	}

	public WebElement getStep2BtnArtist() {
		return step2BtnArtist;
	}

	public WebElement getFaceBookEdt() {
		return faceBookEdt;
	}

	public WebElement getYouTubeEdt() {
		return youTubeEdt;
	}

	public WebElement getInstagraEdt() {
		return instagraEdt;
	}

	public WebElement getTwitterEdt() {
		return twitterEdt;
	}

	public WebElement getSetp3BtnArtist() {
		return setp3BtnArtist;
	}
	
	public WebElement getTagsCategoryClk() {
		return tagsCategoryClk;
	}
	
	public WebElement getSaveBtnClkFan() {
		return saveBtnClkFan;
	}
	
	public WebElement getCategoryBusinessClk() {
		return categoryBusinessClk;
	}
	
	public WebElement getSubCategorybusinessClk() {
		return subCategorybusinessClk;
	}
	
	public WebElement getAddressMapLocation() {
		return addressMapLocation;
	}
	
	public WebElement getTimerClk1() {
		return timerClk1;
	}

	public WebElement getTimerClk2() {
		return timerClk2;
	}

	public WebElement getTimeSelect1() {
		return timeSelect1;
	}

	public WebElement getTimeSelect2() {
		return timeSelect2;
	}

	public WebElement getUploadAcademyPdf() {
		return uploadAcademyPdf;
	}
	
	public WebElement getOperationalYearClk() {
		return operationalYearClk;
	}

	public WebElement getOperationalYearSelect() {
		return operationalYearSelect;
	} 
	
	public WebElement getSuccesmsg() {
		return succesmsg;
	}

	
	/**
	 * This method is used to Complete Artist Profile
	 * @param driver
	 * @param name
	 * @param country
	 * @param city
	 * @param subcategory
	 * @throws Throwable
	 */
	public void profileCompleteArtist(WebDriver driver, String name, String country, String city, String subcategory) throws Throwable
	{
		profilePic.sendKeys(IConstants.imageFilePath);
		Thread.sleep(3000);
		profilePicSaveBtn.click();
		Thread.sleep(3000);
		profileNameEdt.sendKeys(name);
		handleDropDown("Male", genderSelect);
		Thread.sleep(2000);
		System.out.println("Gender Selected Successfully");
		countryClk.click();
		Thread.sleep(2000);	
		countryEdt.sendKeys(country);
		Thread.sleep(2000);	
		selectItemFromList(driver, country, listItems);
		Thread.sleep(3000);	
		cityClk.click();
		Thread.sleep(3000);
		System.out.println("Country Selected Successfully");
		cityEdt.sendKeys(city);
		Thread.sleep(3000);
		selectItemFromList(driver, city, listItems);
		System.out.println("City Selected Successfully");
		category.click();
		Thread.sleep(2000);
		subCategoryClk.click();
		Thread.sleep(2000);
		System.out.println("Category Selected Successfully");
		selectItemFromList(driver, subcategory, listItems);
		escapeClickAction(driver);
		System.out.println("Subcategory Selected Successfully");
		Thread.sleep(2000);
		tabButtonAction(driver);
		tabButtonAction(driver);
		enterButtonAction(driver);
		Thread.sleep(2000);
//		step1BtnArtist.click();
		Thread.sleep(2000);
		languageClk.click();
		selectItemFromList(driver, "Hindi", listItems);
		escapeClickAction(driver);
		System.out.println("Language Selected Successfully");
		handleDropDown("Original", selectSetType);
		profileFile.sendKeys(IConstants.pdfFilePath);
		Thread.sleep(2000);
		descripeYourselfEdt.sendKeys("Describe Your Self");
		step2BtnArtist.click();
		faceBookEdt.sendKeys("https://www.facebook.com/JustinBieber");
		youTubeEdt.sendKeys("https://www.youtube.com/channel/UCIwFjwMjI0y7PDBVEO9-bkQ");
		instagraEdt.sendKeys("https://www.instagram.com/justinbieber/?hl=en");
		twitterEdt.sendKeys("https://twitter.com/jbcrewdotcom?lang=en");
		setp3BtnArtist.click();
		waitForElementToBeVisible(driver, succesmsg);
		
		
	}
	
	/**
	 * This method is used to Complete Fan Profile
	 * @param driver
	 * @param name
	 * @param country
	 * @param city
	 * @param tag
	 * @throws Throwable
	 */
	
	public void profileCompleteFan(WebDriver driver, String name, String country, String city, String tag) throws Throwable
	{
		profilePic.sendKeys(IConstants.imageFilePath);
		Thread.sleep(3000);
		profilePicSaveBtn.click();
		Thread.sleep(3000);
		profileNameEdt.sendKeys(name);
		handleDropDown("Male", genderSelect);
		Thread.sleep(2000);
		System.out.println("Gender Selected Successfully");
		countryClk.click();
		Thread.sleep(2000);	
		countryEdt.sendKeys(country);
		Thread.sleep(2000);	
		selectItemFromList(driver, country, listItems);
		cityClk.click();
		Thread.sleep(3000);
		System.out.println("Country Selected Successfully");
		cityEdt.sendKeys(city);
		Thread.sleep(3000);
		System.out.println("City Selected Successfully");
		selectItemFromList(driver, city, listItems);
		tagsCategoryClk.click();
		Thread.sleep(3000);
		selectItemFromList(driver, tag, listItems);
		Thread.sleep(2000);
		escapeClickAction(driver);
		saveBtnClkFan.click();
		waitForElementToBeVisible(driver, succesmsg);
		
	}
	
	/**
	 * This Method is used to Complete Business Profile
	 * @param driver
	 * @param country
	 * @param city
	 * @param subcategory
	 * @throws Throwable
	 */
	public void profileCompleteBusiness(WebDriver driver, String country, String city, String subcategory ) throws Throwable
	{
		profilePic.sendKeys(IConstants.imageFilePath);
		Thread.sleep(3000);
		profilePicSaveBtn.click();
		Thread.sleep(3000);
		countryClk.click();		
		Thread.sleep(2000);	
		countryEdt.sendKeys(country);
		Thread.sleep(2000);	
		selectItemFromList(driver, country, listItems);
		System.out.println("Country Selected Successfully");
		cityClk.click();
		Thread.sleep(3000);
		cityEdt.sendKeys(city);
		Thread.sleep(3000);
		selectItemFromList(driver, city, listItems);
		System.out.println("City Selected Successfully");
		categoryBusinessClk.click();
		Thread.sleep(2000);
		subCategorybusinessClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, subcategory, listItems);
		escapeClickAction(driver);
		Thread.sleep(2000);	
		addressMapLocation.sendKeys("New Delhi");
		enterButtonAction(driver);
//		step1BtnArtist.click();
		Thread.sleep(2000);
		uploadAcademyPdf.sendKeys(IConstants.pdfFilePath);
		Thread.sleep(1000);
//		timerClk1.click();
//		timeSelect1.click();
//		timerClk2.click();
//		timeSelect2.click();
		handleDropDown("4 Year", operationalYearSelect);
		Thread.sleep(2000);
//		step2BtnArtist.click();
		Thread.sleep(2000);
		System.out.println("LInks");
		instagraEdt.sendKeys("https://www.instagram.com/justinbieber/?hl=en");
		youTubeEdt.sendKeys("https://www.youtube.com/channel/UCIwFjwMjI0y7PDBVEO9-bkQ");
		twitterEdt.sendKeys("https://twitter.com/jbcrewdotcom?lang=en");
		faceBookEdt.sendKeys("https://www.facebook.com/JustinBieber");
		System.out.println("LInks");
		
		Thread.sleep(2000);
		setp3BtnArtist.click();
		waitForElementToBeVisible(driver, succesmsg);
	}

	
}


	