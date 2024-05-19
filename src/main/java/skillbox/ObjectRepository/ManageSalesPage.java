package skillbox.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class ManageSalesPage extends WebDriverUtility{
	

	@FindBy(xpath="//input[@placeholder='Search events']")
	private WebElement searchEventEdt;
	
	@FindBy(linkText="View Details")
	private WebElement viewDetailsClk;
	
	@FindBy(xpath="(//div[@class='card-body'])[2]/h4")
	private WebElement totalTicketText;
	
	@FindBy(xpath="(//div[@class='card-body'])[5]/h4")
	private WebElement totalOrderText;
		
	@FindBy(xpath="(//div[@class='card-body'])[1]/h4")
	private WebElement totalSaleInrText;
	
	@FindBy(xpath="(//div[@class='card-body'])[3]/h4")
	private WebElement totalAllowinText;
	
	
	@FindBy(xpath="//button[text()= ' Download CSV']")
	private WebElement downloadCsv;
		


	public ManageSalesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getSearchEventEdt() {
		return searchEventEdt;
	}

	public WebElement getViewDetailsClk() {
		return viewDetailsClk;
	}

	public WebElement getTotalTicketText() {
		return totalTicketText;
	}

	public WebElement getTotalOrderText() {
		return totalOrderText;
	}

	public WebElement getTotalSaleInrText() {
		return totalSaleInrText;
	}

	public WebElement getTotalAllowinText() {
		return totalAllowinText;
	}
	
	public WebElement getDownloadCsv() {
		return downloadCsv;
	}

	
	

	
	public void searchEvent(WebDriver driver, String eventname) throws Throwable
	{
	    waitForElementToBeVisible(driver, viewDetailsClk);
		Thread.sleep(2000);
		searchEventEdt.sendKeys(eventname);
		Thread.sleep(5000);
		viewDetailsClk.click();
		waitForElementToBeVisible(driver, totalTicketText);
		Thread.sleep(3000);
		String totalticket = totalTicketText.getText();
		System.out.println("Total Ticket\n"+totalticket);
		Thread.sleep(2000);
		String totalOrder = totalOrderText.getText();
		System.out.println("Total Order\n"+totalOrder);
		Thread.sleep(2000);

		String totalSale = totalSaleInrText.getText();
		System.out.println("Total Sale\n"+totalSale);
		Thread.sleep(2000);

		String totalAllow = totalAllowinText.getText();
		System.out.println("Total Allow In\n"+totalAllow);
		
		
		
					
	}

	

	
	

}
