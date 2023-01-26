package testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.base;
import pages.sourcepage;

public class sourcetest  extends base{
sourcepage sourcepg = new sourcepage();

@Test


	public void sourcepage() throws InterruptedException, IOException {
		PageFactory.initElements(driver, sourcepg);

		Thread.sleep(2000);
		sourcepage.master.click();
		
		Thread.sleep(2000);
		sourcepage.material.click();
		
		Thread.sleep(2000);
		sourcepage.source.click();
		
		Thread.sleep(2000);
		sourcepage.addsource.click();
	
		Thread.sleep(2000);
		sourcepage.entersource.click();
		
		
	
		
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\QDMS_Auto\\src\\test\\java\\excel\\excel_qdms.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Source");
		
		int rowcount =sheet.getLastRowNum();
		for (int j=0; j<=rowcount; j++ ) {
			XSSFRow row =sheet.getRow(j);
			
			String source = (String)row.getCell(0).getStringCellValue();
			String enterdescription = (String)row.getCell(1).getStringCellValue();
			
			
			sourcepage.entersource.sendKeys(source);
			//Thread.sleep(2000);
			sourcepage.enterdescription.sendKeys(enterdescription);
			
			
			sourcepage.save.click();
	}
	
	
}	
}
