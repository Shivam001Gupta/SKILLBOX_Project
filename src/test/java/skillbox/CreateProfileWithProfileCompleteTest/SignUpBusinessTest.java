package skillbox.CreateProfileWithProfileCompleteTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ProfileSettingPage;

public class SignUpBusinessTest extends BaseClass {
	
	@Test
	public void signupb() throws Throwable {
		
		//Create Business Profile
		HomePage hp = new HomePage(driver);
		hp.signUp(driver, "Fn cort", "9811475955", "12345678");
		hp.signUpBusiness(driver);
	    System.out.println("Account creation successfully");
	    
	    //Complete Business Profile
	    ProfileSettingPage psp = new ProfileSettingPage(driver);
	    psp.profileCompleteBusiness(driver,"India", "Allahabad","Tech-House");
	   
	    String succesmsg = psp.getSuccesmsg().getText();
		Assert.assertTrue(succesmsg.contains("successfully"));
		System.out.println(succesmsg);
    
        
            
	}

}
