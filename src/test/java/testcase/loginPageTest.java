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
import pages.loginpage;



public class loginPageTest extends base {
	loginpage loginpg = new loginpage();


	@Test
	public void login () throws InterruptedException,IOException {
		PageFactory.initElements(driver, loginpg);
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\QDMS_Auto\\src\\test\\java\\base\\excel\\excel_qdms.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("login");
		
		int rowcount = sheet.getLastRowNum();
		for (int i=0 ; i<= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			String Username = (String)row.getCell(0).getStringCellValue();
			String Password = (String)row.getCell(1).getStringCellValue();
			
			Thread.sleep(2000);
			
			
//			loginpage.username.sendKeys(Keys.CONTROL + "a");
//			loginpage.username.sendKeys(Keys.DELETE);
	//		loginpage.username.sendKeys(Username);
			loginpage.username.sendKeys("admin");
			
			
			//Thread.sleep(2000);
			
//			loginpage.password.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
//			loginpage.password.sendKeys(Password);
			loginpage.password.sendKeys("tokyo@admin");
			//loginpage.password.clear();
			
			loginpage.login.click();
			Thread.sleep(2000);
		}	
	}
		}		
	