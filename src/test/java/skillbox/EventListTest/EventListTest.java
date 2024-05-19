package skillbox.EventListTest;

import org.testng.annotations.Test;

import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventListingPage;

public class EventListTest extends  BaseClass {
	
	@Test
	  public void categoryFilter() throws Throwable
	  {
		  //Open Free Event By URL
		  driver.get("https://www.sbmailer.com/events");
		  
		  EventListingPage elp = new EventListingPage(driver);
	      elp.selectCategory(driver);
		 
	      
		  
		  
		  
		  
		  
//		  
//	      String succesmsg = epp.getEventSBCode().getText();
//		  Assert.assertTrue(succesmsg.contains("Order No:"));
//		  System.out.println(succesmsg);
	      
	  }

	
}

	
	
	
	

