package skillbox.ManageSalesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.TransactionHistoryPage;

public class TransactionHistoryTest extends BaseClass {
	
	@Test
	public void transactionHistory() throws Throwable {
		
		//Login From User and Open Feeds
		HomePage hp = new HomePage(driver);
		
		hp.loginUser(driver, "guptashivam1711@gmail.com", "12345678");
		hp.selectTransaction(driver);
				
		//Get Event From Transaction History
		TransactionHistoryPage thp = new TransactionHistoryPage(driver);
		thp.TransactionHistoryDetails(driver);
		
		String ButtonText = thp.getGetTicketBtn().getText();
		Assert.assertTrue(ButtonText.contains("Get"));
		System.out.println(ButtonText);
		
		
		
		
	  }
	
}
