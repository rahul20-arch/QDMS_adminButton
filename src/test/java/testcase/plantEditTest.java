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
import pages.PlantEditPage;

public class plantEditTest extends base {
	PlantEditPage plantEditpg = new PlantEditPage();
	
	@Test
	public void PlantEditPage() throws InterruptedException, IOException{
		
		PageFactory.initElements(driver, plantEditpg);
		
		
		Thread.sleep(2000);
		PlantEditPage.master.click();
		
		Thread.sleep(2000);
		PlantEditPage.plant.click();
		
		Thread.sleep(2000);
		PlantEditPage.addplant.click();
		
	    Thread.sleep(2000);
		PlantEditPage.plantEdit.click();
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\QDMS_Auto\\src\\test\\java\\excel\\excel_qdms.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("editPlant");
		
		int rowcount =sheet.getLastRowNum();
		for (int j=0; j<=rowcount; j++ ) {
			XSSFRow row =sheet.getRow(j);
			
			
			String editPlant = (String)row.getCell(0).getStringCellValue();
			String editaddress = (String)row.getCell(1).getStringCellValue();
			String editcontactno = (String)row.getCell(2).getStringCellValue();
			String editfax = (String)row.getCell(3).getStringCellValue();
			String editdescription =(String)row.getCell(4).getStringCellValue();
			
		
		Thread.sleep(2000);
		PlantEditPage.editPlant.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		PlantEditPage.editPlant.sendKeys(editPlant);
		
		
		Thread.sleep(2000);
		PlantEditPage.editaddress.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		PlantEditPage.editaddress.sendKeys(editaddress);
		
		Thread.sleep(2000);
		PlantEditPage.editcontactno.sendKeys(Keys.CONTROL + "a" , Keys.DELETE);
		PlantEditPage.editcontactno.sendKeys(editcontactno);
		
		Thread.sleep(2000);
		PlantEditPage.editfax.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		PlantEditPage.editfax.sendKeys(editfax);
		
		Thread.sleep(2000);
		PlantEditPage.clickDrop1.click();
		
		Thread.sleep(2000);
		PlantEditPage.selectdrop1.click();
		
		Thread.sleep(2000);
		PlantEditPage.editdescription.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		PlantEditPage.editdescription.sendKeys(editdescription);
		
		Thread.sleep(2000);
		PlantEditPage.update.click();
		
	}
	}
	
}
