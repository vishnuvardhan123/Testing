package emailTesting;

import javax.mail.Message;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Baseclass {
	
	  private static EmailUtils emailUtils;
	  

	  @BeforeClass
	  public static void connectToEmail() {
	    try {
	    
	      emailUtils = new EmailUtils("dondetivvardhan@gmail.com", "Vardhan@123", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail("The error msg is " + e.getMessage());
	      
	    }
	  }
	  
	  @Test
	  public void testVerificationCode() {
	    try {
	      //TODO: Execute actions to send verification code to email

	      String verificationCode = emailUtils.getAuthorizationCode();

	      //TODO: Enter verification code on screen and submit

	      //TODO: add assertions

	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	
//	  @Test
//	  public void testTextContained() {
//	    try{
//	    Message email = emailUtils.getMessagesBySubject("Your Cognizant account verification code", true, 5)[0];
//	    
//	    System.out.println(email);
//	    Assert.assertEquals("Approval message is not in email", emailUtils.isTextInMessage(email, "You have been approved"));
//	    
//	    } catch (Exception e) {
//	      e.printStackTrace();
//	      Assert.fail(e.getMessage());
//	    }
//	  }
}
