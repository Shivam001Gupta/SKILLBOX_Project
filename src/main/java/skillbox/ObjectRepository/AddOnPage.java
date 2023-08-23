package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class AddOnPage extends WebDriverUtility {
	
	
	@FindBy(xpath="//input[@name='addOns']/..")
	private WebElement addOnSelectCheck;
	
	@FindBy(xpath="//div[@class='mr-3']/select")
	private WebElement addOnCategory;
	
	@FindBy(xpath="//div[@class='ng-star-inserted']/select")
	private WebElement addOnQuantity;
	
	@FindBy(xpath="//textarea[@placeholder='Enter your shipping address..']")
	private WebElement shippingAddressEdt;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement addOnCheckOutBtn;
	
	
	
	public AddOnPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddOnSelectCheck() {
		return addOnSelectCheck;
	}

	public WebElement getAddOnCategory() {
		return addOnCategory;
	}

	public WebElement getAddOnQuantity() {
		return addOnQuantity;
	}

	public WebElement getShippingAddressEdt() {
		return shippingAddressEdt;
	}

	public WebElement getAddOnCheckOutBtn() {
		return addOnCheckOutBtn;
	}

	
	public void addOnData(WebDriver driver, String category, String quantity, String Address) throws Throwable
	{
	    waitForElementToBeVisible(driver, addOnCheckOutBtn);
		Thread.sleep(3000);
		addOnSelectCheck.click();
		handleDropDown(category, addOnCategory);
		handleDropDown(quantity, addOnQuantity);
		shippingAddressEdt.sendKeys(Address);
		addOnCheckOutBtn.click();
				
	}
	
	

	

}
