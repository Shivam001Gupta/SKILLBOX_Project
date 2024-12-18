package skillbox.RFID;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.PaymentPage;
import skillbox.ObjectRepository.RFIDRechargePage;
	
public class RFIDrechargeTest extends BaseClass {
	
		
	
		@Test
		public void rfidrecharge() throws Throwable{
			
			//Open Free Event By URL
			driver.get("https://www.sbmailer.com/recharge?cardno=CARD4420");
			
			//Enter DetailsS
			RFIDRechargePage rrp = new RFIDRechargePage(driver);
			rrp.rfiduserdetail(driver,"Shivam Gupta", "guptashivam1711@gmail.com", "420", "9511475955");
			
			
			//Pay Through Razorpay PopUp
			PaymentPage pp = new PaymentPage(driver);
			pp.payAmountSuccesspopup(driver, "9511475955");
			
			
			
			String succesmsg = pp.getEventSBCode().getText();
			Assert.assertTrue(succesmsg.contains("Order No:"));
			System.out.println(succesmsg);
				
        				
		}
}
