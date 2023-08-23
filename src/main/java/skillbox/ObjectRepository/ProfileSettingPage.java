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
	
	@FindBy(xpath="//li[@unselectable='unselectable']")
	private List<WebElement> listItems;
	
	@FindBy(xpath="//nz-select[@formcontrolname='currentCity']")
	private WebElement cityClk;
	
	@FindBy(xpath="//nz-select[@formcontrolname='currentCity']/div/div/div/div/input")
	private WebElement cityEdt;
	
	@FindBy(xpath="//span[.='DJ/Producer']")
	private WebElement category;
	
	@FindBy(xpath="//nz-select[@formcontrolname='subCategory']")
	private WebElement subCategoryClk;
	
	@FindBy(id="step1_btn")
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
	
	@FindBy(name="facebook")
	private WebElement faceBookEdt;
	
	@FindBy(name="youTube")
	private WebElement youTubeEdt;
	
	@FindBy(name="instagram")	
	private WebElement instagraEdt;
	
	@FindBy(name="twitter")
	private WebElement twitterEdt;
	
	@FindBy(id="step3-btn")
	private WebElement setp3BtnArtist;
	
	@FindBy(name="TagsCategory")
	private WebElement tagsCategoryClk;
	
	@FindBy(xpath="//button[@class='btn btn-primary float-right col-lg-3']")
	private WebElement saveBtnClkFan;
	
	@FindBy(xpath="//span[text()='Academy']")
	private WebElement categoryBusinessClk;
	
	@FindBy(xpath="//input[@placeholder='Address/Map Location']")
	private WebElement addressMapLocation;
	
	@FindBy(id="uploadAcademyBroucher")
	private WebElement uploadAcademyPdf;
	
	@FindBy(xpath="//div[@class='form-row']/div/input")
	private WebElement timerClk1;
	
	@FindBy(xpath="//button[@ class='atp-ref-dialog-close']")
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
		Thread.sleep(3000);
		selectItemFromList(driver, country, listItems);
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
		step1BtnArtist.click();
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
		Thread.sleep(3000);
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
		Thread.sleep(3000);
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
		subCategoryClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, subcategory, listItems);
		escapeClickAction(driver);
		Thread.sleep(2000);
		addressMapLocation.sendKeys("New Delhi");
		step1BtnArtist.click();
		Thread.sleep(2000);
		uploadAcademyPdf.sendKeys(IConstants.pdfFilePath);
		Thread.sleep(1000);
		timerClk1.click();
		timeSelect1.click();
		timerClk2.click();
		timeSelect2.click();
		handleDropDown("4 Year", operationalYearSelect);
		step2BtnArtist.click();
		faceBookEdt.sendKeys("https://www.facebook.com/JustinBieber");
		youTubeEdt.sendKeys("https://www.youtube.com/channel/UCIwFjwMjI0y7PDBVEO9-bkQ");
		instagraEdt.sendKeys("https://www.instagram.com/justinbieber/?hl=en");
		twitterEdt.sendKeys("https://twitter.com/jbcrewdotcom?lang=en");
		setp3BtnArtist.click();
		waitForElementToBeVisible(driver, succesmsg);
	}

	
}


	