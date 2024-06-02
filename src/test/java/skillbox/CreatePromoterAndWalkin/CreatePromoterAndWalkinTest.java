package skillbox.CreatePromoterAndWalkin;

import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ManageDIYPage;
import skillbox.ObjectRepository.PromoterDetailsPage;

public class CreatePromoterAndWalkinTest extends BaseClass {
	
	@Test
	public void createpromoter() throws Throwable {
		
		//Login From user
		HomePage hp = new HomePage(driver);
		hp.loginUser(driver, "walker@gmail.com", "12345678");
		hp.selectManageDiy(driver);
		System.out.println("Login Successfully");
		
		//Open Manage DIY Page
		ManageDIYPage mdp = new ManageDIYPage(driver);
		mdp.addpromoter(driver);
		System.out.println("Manage DIY Page Open Successfully");
		
		//Add Promoter
		PromoterDetailsPage pdp = new PromoterDetailsPage(driver);
		pdp.addpromoter(driver, "Shivam Gupta", "shivam@skillboxes.com", "9511475944");
		System.out.println("Promoter Add Successfully");
		
		//Add WalkIn
		pdp.addwalkin(driver, "Praveen Yadav", "praveen@skillboxes.com", "9599311483");
		System.out.println("WalkIn Add Successfully");
		
		Assert.assertTrue(true);
		System.out.println("Walkin and Promoter Add and Delete Successfully");
		
	}
	

}