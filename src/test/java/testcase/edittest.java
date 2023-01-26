package testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.base;
import pages.Editpage;

public class edittest extends base {
	Editpage editpg = new Editpage();
	
	@Test
	public void Editpage() throws InterruptedException, IOException {
		PageFactory.initElements(driver, editpg);
		
		Thread.sleep(2000);
		Editpage.master.click();
		
		Thread.sleep(2000);
		Editpage.material.click();
		
		Thread.sleep(2000);
		Editpage.source.click();
		
		Thread.sleep(2000);
		Editpage.editButton.click();
		
		Thread.sleep(2000);
		Editpage.editsource.click();
	
		
		
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\QDMS_Auto\\src\\test\\java\\excel\\excel_qdms.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("description");
		
		int rowcount =sheet.getLastRowNum();
		for (int j=0; j<=rowcount; j++ ) {
			XSSFRow row =sheet.getRow(j);
			
			
			String editsource = (String)row.getCell(0).getStringCellValue();
			String editenterdescription = (String)row.getCell(1).getStringCellValue();
			
			Editpage.editsource.sendKeys(Keys.CONTROL + "a");
			Editpage.editsource.sendKeys(Keys.DELETE);
			Editpage.editsource.sendKeys(editsource);
			
			Thread.sleep(2000);
			Editpage.editdescription.sendKeys(Keys.CONTROL + "a");
			Editpage.editdescription.sendKeys(Keys.DELETE);
			Editpage.editdescription.sendKeys(editenterdescription);
		
			Editpage.save.click();
		
		
	}
		
		
	
	
	
	}	
}
 