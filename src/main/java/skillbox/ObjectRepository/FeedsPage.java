package skillbox.ObjectRepository;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.IConstants;
import skillbox.GenericUtilities.WebDriverUtility;

public class FeedsPage extends WebDriverUtility{

	@FindBy(xpath="//div[text()=' Whats new? ']")
	private WebElement feedsPostClickPopup;
	
	@FindBy(xpath="//input[@placeholder='Post Title']")
	private WebElement postTitleEdt;
	
	@FindBy(xpath="//span [@contenteditable='true']")
	private WebElement postDescriptionEdt;
	
	@FindBy(xpath="//button[text()='Create Post']")
	private WebElement createPostBtn;
	
	@FindBy(xpath="//span[@data-toggle='dropdown']")
	private WebElement threeDotdelClk;
	
	@FindBy(xpath="//span[@class='action-count']")
	private WebElement deleteClk;
	
	@FindBy(xpath="//span[@class='mdi mdi-heart action-btn']")
	private WebElement likeClk;
	
	@FindBy(xpath="//button[@class='btn upload primary']")
	private WebElement audioBtnClk;
	
	@FindBy(xpath="//input[@accept='image/*']")
	private WebElement imgUpload;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement imgSaveBtn;
	
	@FindBy(xpath="//*[@placeholder='e.g. Hiphop, jazz']")
	private WebElement tagClk;
	
	@FindBy(xpath="//div[@class='option']")
	private List<WebElement> listItems;
	
	@FindBy(xpath="//*[@placeholder='e.g. English, Hindi']")
	private WebElement lngClk;
	
	@FindBy(xpath="//label[@class='uplaod-div ng-star-inserted']/input")
	private WebElement audioUpload;
	
	@FindBy(xpath="//button[@class='btn upload pink']")
	private WebElement videoBtnClk;
	
	@FindBy(xpath="//input[@accept='video/*, .flv']")
	private WebElement videoUpload;
	
	@FindBy(xpath="//button[@class='btn upload orange']")
	private WebElement imgBtnClk;
	
	@FindBy(xpath="//input[@accept='image/*']")
	private WebElement imgUploadP;
	
	@FindBy(xpath="//div[@class='ant-message']/nz-message")
	private WebElement succesmsg;
	
	@FindBy(xpath="//input[@formcontrolname='title']")
	private WebElement titleedtprofile;
	
	@FindBy(xpath="//textarea[@formcontrolname='description']")
	private WebElement deescriptionedtprofile;
	
	@FindBy(xpath="//button[text()='Upload Audio']")
	private WebElement uploadBtnprofile;
	
	@FindBy(xpath="//input[@placeholder='Enter Amount']")
	private WebElement enterAmountEdt;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement payBtn;
	
	@FindBy(xpath="//button[@id='paymentButton']")
	private WebElement finalpaybtn;
	
	@FindBy(xpath="(//h4[@_ngcontent-app-root-c31=''])[1]")
	private WebElement rfSbCode;
	
	@FindBy(xpath="//img[@src='/assets/images/rsvp-confirm-01.svg']")
	private WebElement thumbicon;
	
	
	
	
	
	
	

	public FeedsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFeedsPostClickPopup() {
		return feedsPostClickPopup;
	}


	public WebElement getPostTitleEdt() {
		return postTitleEdt;
	}


	public WebElement getPostdescriptionEdt() {
		return postDescriptionEdt;
	}

	
	public WebElement getCreatePostBtn() {
		return createPostBtn;
	}

	public WebElement getThreeDotdelClk() {
		return threeDotdelClk;
	}

	public WebElement getDeleteClk() {
		return deleteClk;
	}
	
	public WebElement getLikeClk() {
		return likeClk;
	}
	
	public WebElement getAudioBtnClk() {
		return audioBtnClk;
	}

	public WebElement getImgUpload() {
		return imgUpload;
	}

	public WebElement getImgSaveBtn() {
		return imgSaveBtn;
	}

	public WebElement getTagClk() {
		return tagClk;
	}

	public List<WebElement> getListItems() {
		return listItems;
	}
	public WebElement getLngClk() {
		return lngClk;
	}
	
	public WebElement getAudioUpload() {
		return audioUpload;
	}
	
	public WebElement getVideoBtnClk() {
		return videoBtnClk;
	}
	
	public WebElement getVideoUpload() {
		return videoUpload;
	}

	public WebElement getImgUploadP() {
		return imgUploadP;
	}
	
	public WebElement getImgBtnClk() {
		return imgBtnClk;
	}
	
	public WebElement getSuccesmsg() {
		return succesmsg;
	}
	
	public WebElement getTitleedtprofile() {
		return titleedtprofile;
	}

	public WebElement getDeescriptionedtprofile() {
		return deescriptionedtprofile;
	}
	
	public WebElement getUploadBtnprofile() {
		return uploadBtnprofile;
	}
	
	public WebElement getEnterAmountEdt() {
		return enterAmountEdt;
	}
	
	public WebElement getPayBtn() {
		return payBtn;
	}
	
	public WebElement getFinalpaybtn() {
		return finalpaybtn;
	}

	public WebElement getRfSbCode() {
		return rfSbCode;
	}
	
	public WebElement getThumbicon() {
		return thumbicon;
	}
	

	
	
	public void delete() throws InterruptedException
	 {
		 threeDotdelClk.click();
		 Thread.sleep(3000);
		 deleteClk.click();
		 
	 }

	/**
	 * This Function is used to Post Text on Feeds
	 * @param driver
	 * @throws Throwable
	 */
	public void feedsPostText(WebDriver driver) throws Throwable
	{
		feedsPostClickPopup.click();
		Thread.sleep(2000);
		postTitleEdt.sendKeys("The Title of Post Text");
		postDescriptionEdt.sendKeys("The description of post Description");
		createPostBtn.click();
		waitForElementToBeVisible(driver, succesmsg);
		
	}
	
	/**
	 * This method is used to Like Feeds Post
	 * @param driver
	 * @throws Throwable
	 */
	public void feedLike(WebDriver driver) throws Throwable
	{
		likeClk.click();
		delete();
		waitForElementToBeVisible(driver, succesmsg);
	}
	
	/**
	 * This method is used to Post Audio on Feeds
	 * @param driver
	 * @param tags
	 * @param language
	 * @throws Throwable
	 */
	public void feedsPostAudio(WebDriver driver, String tags, String language) throws Throwable
	{
		feedsPostClickPopup.click();
		Thread.sleep(2000);
		postTitleEdt.sendKeys("The Title of Post Text");
		postDescriptionEdt.sendKeys("The description of post Description");
		audioBtnClk.click();
		Thread.sleep(2000);
		imgUpload.sendKeys(IConstants.imageFilePath);
		Thread.sleep(5000);
		imgSaveBtn.click();
		tagClk.click();
		selectItemFromList(driver, tags, listItems);
		escapeClickAction(driver);
		lngClk.click();
		selectItemFromList(driver, language, listItems);
		escapeClickAction(driver);
		audioUpload.sendKeys(IConstants.audioFilePath);
		waitForElementToBeClickable(driver, createPostBtn);
		Thread.sleep(2000);
		createPostBtn.click();
		waitForElementToBeVisible(driver, succesmsg);
		delete();
		waitForElementToBeVisible(driver, succesmsg);
		
	}
	
	/**
	 * This Method is used to Post Video on Feeds
	 * @param driver
	 * @param tags
	 * @param language
	 * @throws Throwable
	 */
	public void feedsPostVideo(WebDriver driver, String tags, String language) throws Throwable
	{
		feedsPostClickPopup.click();
		Thread.sleep(2000);
		postTitleEdt.sendKeys("The Title of Post Video");
		postDescriptionEdt.sendKeys("The description of post Video");
		videoBtnClk.click();
		Thread.sleep(2000);
		videoUpload.sendKeys(IConstants.videoFilePath);
		arrowDownAction(driver);
		arrowDownAction(driver);
		Thread.sleep(5000);
		tagClk.click();
		selectItemFromList(driver, tags, listItems);
		escapeClickAction(driver);
		tabButtonAction(driver);
//		lngClk.click();
		Thread.sleep(2000);
		selectItemFromList(driver, language, listItems);
		escapeClickAction(driver);
		Thread.sleep(3000);
		tabButtonAction(driver);
		arrowDownAction(driver);
		createPostBtn.click();
		Thread.sleep(2000);
		waitForElementToBeVisible(driver, succesmsg);
//		delete();
//		waitForElementToBeVisible(driver, succesmsg);
		
	}
	
	/**
	 * This Method is used to Post Image on Feeds
	 * @param driver
	 * @param tags
	 * @param language
	 * @throws Throwable
	 */
	public void feedsPostImg(WebDriver driver, String tags) throws Throwable
	{
		Thread.sleep(5000);
		feedsPostClickPopup.click();
		Thread.sleep(2000);
		postTitleEdt.sendKeys("The Title of Post Image");
		postDescriptionEdt.sendKeys("The description of post Image");
		imgBtnClk.click();
		Thread.sleep(2000);
		imgUpload.sendKeys(IConstants.imageFilePath);
		tagClk.click();
		selectItemFromList(driver, tags, listItems);
		escapeClickAction(driver);
		Thread.sleep(2000);
		tabButtonAction(driver);
		arrowDownAction(driver);
		createPostBtn.click();
		waitForElementToBeVisible(driver, succesmsg);
		delete();
		waitForElementToBeVisible(driver, succesmsg);
		
	}
	
	/**
	 * This method is used to Post Audio on Feeds
	 * @param driver
	 * @param tags
	 * @param language
	 * @throws Throwable
	 */
	public void uploadWork(WebDriver driver, String tags, String language) throws Throwable
	{
		Thread.sleep(2000);
		titleedtprofile.sendKeys("The Title of Post Text");
		deescriptionedtprofile.sendKeys("The description of post Description");
		Thread.sleep(2000);
		imgUpload.sendKeys(IConstants.imageFilePath);
		Thread.sleep(5000);
		imgSaveBtn.click();
		tagClk.click();
		selectItemFromList(driver, tags, listItems);
		escapeClickAction(driver);
		lngClk.click();
		selectItemFromList(driver, language, listItems);
		escapeClickAction(driver);
		audioUpload.sendKeys(IConstants.audioFilePath);
		waitForElementToBeClickable(driver, uploadBtnprofile);
		Thread.sleep(2000);
		uploadBtnprofile.click();
		
		
	}
	
	public void enterAmount(WebDriver driver, String amount ) throws Throwable
	{
	
		enterAmountEdt.sendKeys(amount);
		payBtn.click();
		waitForElementToBeVisible(driver, finalpaybtn);
		Thread.sleep(2000);
		finalpaybtn.click();
	
	}
	
	public void rfsbcodewait(WebDriver driver) throws InterruptedException
	{
		waitForElementToBeVisible(driver, rfSbCode);	
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
}
