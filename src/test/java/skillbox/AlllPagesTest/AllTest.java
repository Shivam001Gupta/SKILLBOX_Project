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
	

   
        driver.get(URL+"feedbox");;
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        
//        
//        driver.get(URL+"wedding-packages");;
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        
//        driver.get(URL+"corporate-packages");;
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        
//        driver.get(URL+"private-event-packages");
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        
//        driver.get(URL+"venue-club-gig-packages");
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);

        
        driver.get(URL+"events");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"shoutout-packages");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"livebox");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"discover");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"streambox");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"short-url");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"about-us");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"career");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"franchise");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"team");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"contact-us");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"privacy-policy");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"terms-conditions");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"refund-policy");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"annual-return");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"artist/profile/alanwalker95");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"booking-pannels/settlement");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"manage/draft");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"booking-pannels");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.get(URL+"booking-pannels/event-tickets/cWdpMUlNMFZKUGExRUJSYjE3VWFVUT09");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        
        driver.get(URL+"promoter");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"orders/ticket-bookings");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"user-change-password");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        
        driver.get(URL+"manage/create");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
	}
}
