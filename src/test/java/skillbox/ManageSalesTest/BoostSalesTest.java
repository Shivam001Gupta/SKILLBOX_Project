package skillbox.ManageSalesTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.CampignPage;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ManageSalesPage;
import skillbox.ObjectRepository.PaymentPage;

public class BoostSalesTest extends BaseClass {
	
	@Test
	public void text() throws Throwable {
		
		//Login From User and Open Feeds
		HomePage hp = new HomePage(driver);
		
		hp.loginUser(driver, "guptashivam1711@gmail.com", "12345678");
		hp.selectmangesales(driver);
				
		//Get Event From Manage Sales
		ManageSalesPage mnp = new ManageSalesPage(driver);
		mnp.selectBoostSale(driver);
		
		//Select Contact
		CampignPage cp  = new CampignPage(driver);
		cp.selectContacts(driver);
		
		//Pay Through Razorpay PopUp
		PaymentPage pp = new PaymentPage(driver);
		pp.payAmountSuccesspopup(driver, "9511475955");
		
		//Success
		cp.successmsgwait(driver);
		
		
		String succesmsg = cp.getSuccesmsg().getText();
		Assert.assertTrue(succesmsg.contains("Payment"));
		System.out.println(succesmsg);
		
	  }
	
}
