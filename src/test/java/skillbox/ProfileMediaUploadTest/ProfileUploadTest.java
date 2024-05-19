package skillbox.ProfileMediaUploadTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.FeedsPage;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.ProfilePage;


public class ProfileUploadTest extends BaseClass{

	@Test
	public void profileUpload() throws Throwable {
		
		//Login From User and Open Feeds
		HomePage hp = new HomePage(driver);
		hp.loginUser(driver, "walker@gmail.com", "12345678");
		hp.selectUpdateWork(driver);
		
		//Select Track from Profile
		ProfilePage pp  = new ProfilePage(driver);
		pp.selectTrack(driver);
		
		//Upload Track
		FeedsPage fp = new FeedsPage(driver);
		fp.uploadWork(driver, "Kids", "American English");
		
		//Delete Track
		pp.deleteTrack(driver);
		
		String succesmsg = fp.getSuccesmsg().getText();
		Assert.assertTrue(succesmsg.contains("Success"));
		System.out.println(succesmsg);
				
		
	}

}
