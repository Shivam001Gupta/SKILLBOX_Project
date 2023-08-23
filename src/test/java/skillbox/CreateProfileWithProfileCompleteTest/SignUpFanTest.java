package skillbox.CreateProfileWithProfileCompleteTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ProfileSettingPage;

public class SignUpFanTest extends BaseClass { 
	
	@Test
	public void signupf() throws Throwable {
		
		//Create Fan Profile
		HomePage hp = new HomePage(driver);
		hp.signUp(driver, "Fn cort", "9811475955", "12345678");
		hp.signUpFan(driver);
		System.out.println("Account creation successfully");
		
		//Complete Fan Profile
	    ProfileSettingPage psp = new ProfileSettingPage(driver);
	    psp.profileCompleteFan(driver, "fn Cort", "India", "Allahabad", "Biking");
        
		
        String succesmsg = psp.getSuccesmsg().getText();
		Assert.assertTrue(succesmsg.contains("successfully"));
		System.out.println(succesmsg);
		

	}	}
