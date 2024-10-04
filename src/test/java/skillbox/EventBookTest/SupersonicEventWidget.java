package skillbox.EventBookTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.AddOnPage;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.PaymentPage;
import skillbox.ObjectRepository.EventTicketPage;

public class SupersonicEventWidget extends BaseClass {

	
	@Test
	public void supersonicaddonevent() throws Throwable {
		
		  //Open Supersonic Widget URL
		  driver.get("https://www.sbmailer.com/events-widget/tickets/vh1-supersonic-2024"); 
			
		
		  //Select Ticket and Quantity
	      EventTicketPage etp  = new EventTicketPage(driver);
	      etp.selectTicketsupersonicwidget("1");
	      
	      //Select Add-On and Submit  
	      AddOnPage ap = new AddOnPage(driver);
	      ap.addOnDataSupersonic(driver, "Allahabad", "231001", "Mirzapur");
	      
          //Login on Event Booking Page
          EventBookingPage ebp = new EventBookingPage(driver);
          ebp.loginOnEventBook(driver,"artist420@gmail.com", "12345678");
          System.out.println("Login Successfully");
          
          //Enter Pin and Pay the Amount
          ebp.supersonicPay(driver);
          
          PaymentPage pp = new PaymentPage(driver);
          pp.payAmountId(driver);
          pp.payAmountSuccesspopup(driver, "9511475955");
          
          
          String succesmsg = pp.getEventSBCode().getText();
		  Assert.assertTrue(succesmsg.contains("Order"));
		  System.out.println(succesmsg);
          

	}

}
