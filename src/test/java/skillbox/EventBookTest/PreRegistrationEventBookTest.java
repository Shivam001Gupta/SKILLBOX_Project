package skillbox.EventBookTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventDetailPage;
import skillbox.ObjectRepository.EventTicketPage;
	
public class PreRegistrationEventBookTest extends BaseClass {
	
	@Test
	  public void freeticketbook() throws Throwable
	  {
		  //Open Free Event By URL
		  driver.get("https://www.sbmailer.com/events/the-pre-registration-event-kt");
		  
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
	      
	      //Add Questions
	      ebp.addGuestConfirm(driver, "guptashivam1711@gmail.com", "shivam", "979161580");	
	      System.out.println("Question Added Successfully");
	      Thread.sleep(5000);
	      
	      //Enter Pin and Book
	      ebp.pinAndPay(driver, "231001");
	      
	      //Success PopUp
	      ebp.freeticketconfirmation(driver);
	      
	      
	      String freeTicketConfirmationMsg = ebp.getFreeTicketConfirmationMsg().getText();
		  Assert.assertTrue(freeTicketConfirmationMsg.contains("successful"));
		  System.out.println(freeTicketConfirmationMsg);
		  
	      
	      
	  }
      
      
      

}
