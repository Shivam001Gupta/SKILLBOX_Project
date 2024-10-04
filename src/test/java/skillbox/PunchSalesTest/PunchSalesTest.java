package skillbox.PunchSalesTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.PunchSalesPage;
	
public class PunchSalesTest extends BaseClass {
	
		
	
		@Test
		public void punchsale() throws Throwable{
			
			/* Read Data from Excel sheet - Test data */			
//			String fullname = eUtil.getDataFromExcel("PunchSales", 4, 3);
//			String email = eUtil.getDataFromExcel("PunchSales", 4, 4);
//			String mobilenumber = eUtil.getDataFromExcel("PunchSales", 4, 5);
//			String ticketname = eUtil.getDataFromExcel("PunchSales", 4, 6);
//			String amount = eUtil.getDataFromExcel("PunchSales", 4, 7);
//			String noofticket = eUtil.getDataFromExcel("PunchSales", 4, 8);
//			
			
			//Login
			HomePage hp = new HomePage(driver);
			hp.clickOnPromoterSales(driver, "artist420@gmail.com", "12345678");
			
			//Punch Sales
			PunchSalesPage psp = new PunchSalesPage(driver);
			psp.punchSalesForm(driver, "Shivam Gupta", "shivam@skillboxes.com", "9511475955", "Early Bird", "1000", "5");
		
            //Bulk Punch Sales
			psp.bulkPunchSales(driver);
			
			String succesmsg = psp.getSaleEntryVerify().getText();
			Assert.assertTrue(succesmsg.contains("Shubham"));
			System.out.println(succesmsg);
				
        				
		}
}
