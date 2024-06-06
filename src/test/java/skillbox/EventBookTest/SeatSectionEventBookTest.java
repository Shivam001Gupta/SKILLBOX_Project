package skillbox.EventBookTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventDetailPage;
import skillbox.ObjectRepository.EventPaymentPage;
import skillbox.ObjectRepository.EventTicketPage;
import skillbox.ObjectRepository.SeatSectionPage;

public class SeatSectionEventBookTest extends BaseClass {
	
	@Test
	  public void addoneventbook() throws Throwable
	  {
		  //Open Free Event By URL
		  driver.get("https://www.sbmailer.com/events/the-event-seat-section-delhi");
		  
		  //Click on the Book Now Button
		  EventDetailPage edp = new EventDetailPage(driver);
	      edp.clickbooknowbtnseat(driver);
	      
	      	      	      
	      //Select Seat
	      SeatSectionPage ssp = new SeatSectionPage(driver);
	      ssp.SelectSeat(driver);
	      System.out.println("Seat Selected Successfully");
	    		  
	      
          //Select Ticket and Quantity
	      EventTicketPage etp = new EventTicketPage(driver);
	      etp.selectFreeTicket("1");
	           
	      
	      //login on Event Booking Page
	      EventBookingPage ebp = new EventBookingPage(driver);
	      ebp.loginOnEventBook(driver,"shivam@skillboxes.com", "12345678");
	      Thread.sleep(5000);
	      
	      //Enter Pin and Pay the Amount
	      ebp.pinAndPay(driver, "231001");
	      
	      //Success page Generate
	      EventPaymentPage epp = new EventPaymentPage(driver);
	      epp.payAmountSuccess(driver);
	      
	      String succesmsg = epp.getEventSBCode().getText();
		  Assert.assertTrue(succesmsg.contains("Order No:"));
		  System.out.println(succesmsg);
	      
	  }

	
}
