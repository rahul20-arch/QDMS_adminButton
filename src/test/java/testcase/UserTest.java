package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.base;
import pages.userpage;

public class UserTest extends base {
	userpage userpg = new userpage();
	
	@Test
	public void userpage() throws  InterruptedException,IOException	{
	
		PageFactory.initElements(driver, userpage.class);
		
		
		userpage.master.click();
		Thread.sleep(4000);
	
		
		userpage.employee.click();
		Thread.sleep(2000);
	
		
		userpage.user.click();
		Thread.sleep(2000);
		
		
		userpage.adduser.click();
		Thread.sleep(2000);
			
		
	    userpage.tick.click();
	    Thread.sleep(2000);
	
	   userpage.send.click();
	   Thread.sleep(2000);
	 
	   userpage.drop1.click();
	   Thread.sleep(2000);
	
	   userpage.click1.click();
	   Thread.sleep(2000);
	
	   userpage.drop2.click();
	   Thread.sleep(2000);
	   
	   userpage.click2.click();
	   Thread.sleep(2000);
	   
	   
	   userpage.click3.click();
	   Thread.sleep(2000);
	   
	   userpage.click4.click();
	   Thread.sleep(2000);
	   
	   
//	   userpage.save.click();
//	   Thread.sleep(2000);
	   
}
	
	
	
	
	
}
