package skillbox.FeedsTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.FeedsPage;
import skillbox.ObjectRepository.HomePage;

public class StoryReliefFundTest extends BaseClass {
	
		@Test(priority = 1)
		public void text() throws Throwable {
			
			 
			//Open Free Event By URL
			driver.get("https://www.sbmailer.com/story/artist/artist42075/post/39/1661348390u2dfz2kxsukspwsrmp4");
			
			//Login From User and Open Feeds
			HomePage hp = new HomePage(driver);
			hp.loginUser(driver, "shivam@skillboxes.com", "12345678");
			
			//Post Text
			FeedsPage fp = new FeedsPage(driver);
			fp.payAmountSuccesspopup(driver,"300", "9511475955");
			
			String succesmsg = fp.getRfSbCode().getText();
			Assert.assertTrue(succesmsg.contains("Order"));
			System.out.println(succesmsg);
			
		  }				
}