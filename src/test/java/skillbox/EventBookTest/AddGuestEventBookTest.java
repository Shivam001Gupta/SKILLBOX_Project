package skillbox.EventBookTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventDetailPage;
import skillbox.ObjectRepository.PaymentPage;
import skillbox.ObjectRepository.EventTicketPage;

public class AddGuestEventBookTest extends BaseClass {
	
	@Test
	  public void addoneventbook() throws Throwable
	  {
		  //Open Free Event By URL
		  driver.get(URL+"events/add-guest-event-kt");
		  
		  //Click on the Book Now Button
		  EventDetailPage edp = new EventDetailPage(driver);
	      edp.clickbooknowbtn(driver);
	      
	      	      		      
          //Select Ticket and Quantity
	      EventTicketPage etp = new EventTicketPage(driver);
	      etp.selectFreeTicket("1");
	           
	      
	      //login on Event Booking Page
	      EventBookingPage ebp = new EventBookingPage(driver);
	      ebp.loginOnEventBook(driver,"shivam@skillboxes.com", "12345678");
	      Thread.sleep(5000);
	      
	      //Add Guest
	      ebp.addGuestConfirm(driver, "guptashivam1711@gmail.com", "shivam", "979161580");	
	      System.out.println("Guest Added Successfully");
	      Thread.sleep(5000);
	      	      	      
	      //Enter Pin and Pay the Amount
	      ebp.pinAndPay(driver, "231001");
	      
	      //Success page Generate
	      PaymentPage epp = new PaymentPage(driver);
	      epp.payAmountSuccess(driver);
	      
	      String succesmsg = epp.getEventSBCode().getText();
		  Assert.assertTrue(succesmsg.contains("Order No:"));
		  System.out.println(succesmsg);
	      
	  }

	
}
