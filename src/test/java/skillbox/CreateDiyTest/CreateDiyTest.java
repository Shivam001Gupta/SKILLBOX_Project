package skillbox.CreateDiyTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.CreateListingPage;
import skillbox.ObjectRepository.HomePage;

public class CreateDiyTest extends BaseClass {
	@Test
	public void creatediy() throws Throwable
	{
		//Login From User and Open Create Listing
		HomePage hp = new HomePage(driver);
		hp.loginUser(driver, "walker@gmail.com", "12345678");
		hp.clickOnCreateListingLnk(driver);
		 
		//Fill  DIY Form
		CreateListingPage clp = new CreateListingPage(driver);
		clp.fillDiyForm(driver, "New Delhi");
		
		//Create Artist
		clp.createArtist(driver, "Hercules" ,  "The BIo is main thing");

		//Create Partner
		clp.createPartner(driver, "ParGeneric" ,  "The BIo is main thing");
		
		
		//Create Paid Ticket
		clp.createTicket(driver, "Early Bird");
		
		//Create Free Ticket
		clp.createFreeTicket(driver, "RSVP");
		
        //Create Coupon & Delete Coupon
		clp.createCoupon(driver);
		
		String succesmsg = clp.getSuccesscouponchk().getText();
		Assert.assertTrue(succesmsg.contains("Coupon"));
		System.out.println(succesmsg);
		
				
	}
	
}

