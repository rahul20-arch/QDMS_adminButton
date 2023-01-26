package testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.base;
import pages.Plantpage;

public class planttest extends base {
  Plantpage plantpg = new Plantpage();
  
  @Test
  public void Plantpage() throws InterruptedException, IOException{
	  
	 PageFactory.initElements(driver, plantpg);
	 
	 Plantpage.master.click();
	 Thread.sleep(2000);
	  
	 Plantpage.plant.click();
	 Thread.sleep(2000);
	  
	 
	 
	 
	 
	 
	FileInputStream file =  new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\QDMS_Auto\\src\\test\\java\\excel\\excel_qdms.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("plant");
	
	int rowcount = sheet.getLastRowNum();
	
	
	
	for(int i = 0; i<=rowcount; i++) {
		XSSFRow row =sheet.getRow(i);
		
		
		
		
		
		
		Thread.sleep(2000);
		Plantpage.addplant.click();
		
		Thread.sleep(2000); 
		Plantpage.plantcode.click();
		
		String code = (String)row.getCell(0).getStringCellValue();
		String plant = (String)row.getCell(1).getStringCellValue();
		String address = (String)row.getCell(2).getStringCellValue();
		String contactno = (String)row.getCell(3).getStringCellValue();
		String fax = (String)row.getCell(4).getStringCellValue();
		String description = (String)row.getCell(5).getStringCellValue();
		
		
		
		
		//Plantpage.plantcode.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Plantpage.plantcode.sendKeys(code);
		Thread.sleep(2000);
		
//		Plantpage.plantname.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Plantpage.plantname.sendKeys(plant);
		Thread.sleep(2000);
		
//		Plantpage.plantaddress.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Plantpage.plantaddress.sendKeys(address);
		Thread.sleep(2000);
		
//		Plantpage.plantcontactno.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Plantpage.plantcontactno.sendKeys(contactno);
		Thread.sleep(2000);
		
//		Plantpage.fax.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Plantpage.fax.sendKeys(fax);
		Thread.sleep(2000);
		
		
		Plantpage.SubBusinessUnit.click();
		Thread.sleep(2000);
		
		
		Plantpage.drop1.click();
		Thread.sleep(2000);
		
//		Plantpage.description.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Plantpage.description.sendKeys(description);
		Thread.sleep(2000);
		
		
//		Plantpage.savebutton.click();
		Plantpage.cancelbutton.click();
		
			
	}
		
	
	 
	  
	  
	  
  }
  
  
  
  
  
  
}
