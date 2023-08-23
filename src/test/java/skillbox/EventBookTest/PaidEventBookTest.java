package skillbox.EventBookTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventDetailPage;
import skillbox.ObjectRepository.EventListingPage;
import skillbox.ObjectRepository.EventPaymentPage;
import skillbox.ObjectRepository.EventTicketPage;
import skillbox.ObjectRepository.HomePage;


public class PaidEventBookTest extends BaseClass {
	
	
	@Test
	public void eventbook() throws Throwable {
		
		//Click on the Events
		HomePage hp = new HomePage(driver);
		hp.clickOnEvent(driver);
		
		//Click on the Event from Listing
		EventListingPage elp = new EventListingPage(driver);
		elp.selectEventFromList(driver, "Skillbox Paid Event KT (INR 100 - 10000)");
        
		//Click on the Book Now button from Event detail Page
        EventDetailPage edp = new EventDetailPage(driver);
        edp.clickbooknowbtn(driver);
       
        //Select Ticket 
        EventTicketPage etp = new EventTicketPage(driver);
        etp.selectTicket("1");
        
        //Login on Event Booking Page
        EventBookingPage ebp = new EventBookingPage(driver);
        ebp.loginOnEventBook(driver,"artist420@gmail.com", "12345678");
        System.out.println("Login Successfully");
        
        //Signin on Event Booking Page
        ebp.signupOnEventBook(driver, "GIRT", "9898801029", "12345678");
		
        //Put Coupon on Event Booking Page
        ebp.couponModelEventBook(driver, "SBR24ZMKNB", "SBR24ZMKNB", "SBR24ZMKNB", "COUPONLPP");
        
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


