package skillbox.ManageSalesTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ManageSalesPage;

public class ManageSalesTest extends BaseClass {
	
	@Test
	public void text() throws Throwable {
		
		//Login From User and Open Feeds
		HomePage hp = new HomePage(driver);
		
		hp.loginUser(driver, "guptashivam1711@gmail.com", "12345678");
		hp.selectmangesales(driver);
		
		
		
		//Get Event From Manage Sales
		ManageSalesPage mnp = new ManageSalesPage(driver);
		mnp.searchEvent(driver, "Skillbox Paid Event KT (INR 100 - 10000)");
		
		String succesmsg = mnp.getDownloadCsv().getText();
		Assert.assertTrue(succesmsg.contains("CSV"));
		System.out.println(succesmsg);
		
	  }
	
	
	

}
