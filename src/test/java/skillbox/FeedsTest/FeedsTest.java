package skillbox.FeedsTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.FeedsPage;
import skillbox.ObjectRepository.HomePage;

public class FeedsTest extends BaseClass {
	
		@Test(priority = 1)
		public void text() throws Throwable {
			
			//Login From User and Open Feeds
			HomePage hp = new HomePage(driver);
			hp.getFeedsLnk().click();
			hp.loginUser(driver, "walker@gmail.com", "12345678");
			
			//Post Text
			FeedsPage fp = new FeedsPage(driver);
			fp.feedsPostText(driver);
			
			String succesmsg = fp.getSuccesmsg().getText();
			Assert.assertTrue(succesmsg.contains("Success"));
			System.out.println(succesmsg);
			
		  }
				
		@Test(priority = 2)
		public void like() throws Throwable {
			
			//Like on Feeds Post
			FeedsPage fp = new FeedsPage(driver);
			fp.feedLike(driver);
			
			String succesmsg = fp.getSuccesmsg().getText();
			Assert.assertTrue(succesmsg.contains("Success"));
			System.out.println(succesmsg);
		}
			
			
		
		@Test(priority = 3)
		public void audio() throws Throwable {
			
			//Post Audio
			FeedsPage fp = new FeedsPage(driver);
			fp.feedsPostAudio(driver, "Kids", "American English");
			
			String succesmsg = fp.getSuccesmsg().getText();
			Assert.assertTrue(succesmsg.contains("Success"));
			System.out.println(succesmsg);
		}      
		
		@Test(priority = 4)
		public void video() throws Throwable {
			
			//Post Video
			FeedsPage fp = new FeedsPage(driver);
			fp.feedsPostVideo(driver, "Kids", "American English");
			
			String succesmsg = fp.getSuccesmsg().getText();
			Assert.assertTrue(succesmsg.contains("Success"));
			System.out.println(succesmsg);
		}
		
		
		@Test (priority = 5)
		public void image() throws Throwable {
			
			//Post Image
			FeedsPage fp = new FeedsPage(driver);
			fp.feedsPostImg(driver, "Kids");
			
			String succesmsg = fp.getSuccesmsg().getText();
			Assert.assertTrue(succesmsg.contains("Success"));
			System.out.println(succesmsg);
	   }
	      
	   
}
		

