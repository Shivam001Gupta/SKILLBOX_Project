package skillbox.CreateProfileWithProfileCompleteTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ProfileSettingPage;

class SignUpArtistTest extends BaseClass {
	
	@Test
	public void signua() throws Throwable  {
		
		//Creating Artist Profile
		HomePage hp = new HomePage(driver);
		hp.signUp(driver, "Ancort", "9811475955", "12345678");
		hp.signUpArtist(driver);
		System.out.println("Account creation successfully");
		
		//Complete Artist Profile
		ProfileSettingPage psp = new ProfileSettingPage(driver);
		psp.profileCompleteArtist(driver,"Ancotr", "India", "Allahabad", "Rock");
		
		String succesmsg = psp.getSuccesmsg().getText();
		Assert.assertTrue(succesmsg.contains("successfully"));
		System.out.println(succesmsg);

 
	}

	

}
