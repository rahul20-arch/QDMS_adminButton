package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.base;
import pages.deletepage;

public class Deletetest extends base {
    deletepage deletepg = new deletepage();
    @Test
    public void deletepage() throws InterruptedException, IOException {
    	PageFactory.initElements(driver, deletepg);
    	
    	Thread.sleep(2000);
		deletepage.master.click();
    	
		Thread.sleep(2000);
		deletepage.material.click();
    	
		Thread.sleep(2000);
		deletepage.source.click();
    	
    	
    	Thread.sleep(2000);
		deletepage.deleteButton.click();
    	
		Thread.sleep(2000);
		deletepage.deleteok.click();
    	
    	
    	
    	
    }
    
    
    
    
    
    
}
