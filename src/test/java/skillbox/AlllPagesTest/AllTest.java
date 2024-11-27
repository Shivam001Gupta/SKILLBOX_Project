package skillbox.AlllPagesTest;
import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;

public class AllTest extends BaseClass 


{
	@Test(enabled=false)
	public void creatediy() throws Throwable
	{
		//Login From User and Open Create Listing
		HomePage hp = new HomePage(driver);
		hp.loginUser(driver, "walker@gmail.com", "12345678");;
	

   
        driver.get("https://www.sbmailer.com/feedbox");;
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        
//        
//        driver.get("https://www.sbmailer.com/wedding-packages");;
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        
//        driver.get("https://www.sbmailer.com/corporate-packages");;
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        
//        driver.get("https://www.sbmailer.com/private-event-packages");
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        
//        driver.get("https://www.sbmailer.com/venue-club-gig-packages");
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/events");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/shoutout-packages");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/livebox");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/discover");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/streambox");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/short-url");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/about-us");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/career");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/franchise");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/team");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/contact-us");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/privacy-policy");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/terms-conditions");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/refund-policy");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/annual-return");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/artist/profile/alanwalker95");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/booking-pannels/settlement");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/manage/draft");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/booking-pannels");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.get("https://www.sbmailer.com/booking-pannels/event-tickets/cWdpMUlNMFZKUGExRUJSYjE3VWFVUT09");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        
        driver.get("https://www.sbmailer.com/promoter");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/orders/ticket-bookings");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/user-change-password");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get("https://www.sbmailer.com/manage/create");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
	}
}
