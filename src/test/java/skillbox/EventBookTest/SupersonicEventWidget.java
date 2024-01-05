package skillbox.EventBookTest;

import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.AddOnPage;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventPaymentPage;
import skillbox.ObjectRepository.EventTicketPage;

public class SupersonicEventWidget extends BaseClass {

	@Test(enabled=false)
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
          
        ////Success page Generate  
          EventPaymentPage epp = new EventPaymentPage(driver);
          epp.payAmountSuccesspopup(driver);
          

	}

}
