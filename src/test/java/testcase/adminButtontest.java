package testcase;

import java.io.IOException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.base;
import pages.adminButton;

public class adminButtontest extends base {
	adminButton adminbtn = new adminButton();
	@Test
public void adminButton() throws InterruptedException, IOException{
	
		
		
		
		
		
		
	PageFactory.initElements(driver,adminbtn);
	
	adminButton.username.sendKeys("admin");
	adminButton.password.sendKeys("tokyo@admin");
	adminButton.login.click();
	
	Thread.sleep(2000);
	//adminButton.CheckAdmin.click();

	
	
	SoftAssert aa = new SoftAssert();
	Point actual = adminButton.CheckAdmin.getLocation();
	
	int x = actual.getX();
	int expectedresult = 1244;
	System.out.println("x-axis = " + x);
	aa.assertEquals(x, expectedresult);
	
	
	int y = actual.getY();
	int expectresult =  18;
	System.out.println("y-axis = " + y);
	aa.assertEquals(expectresult, y);
	
	
	org.openqa.selenium.Dimension size = adminButton.CheckAdmin.getSize();
	int width = size.getWidth();
	System.out.println("width  = " + width);
	int expectedresult1 =84;
	aa.assertEquals(width, expectedresult1);	
	 
	int height = size.getHeight();
	System.out.println("height = " + height);
	int expectedresult2 =43;
	aa.assertEquals(height, expectedresult2);
	
	
	String backgroundColor = adminButton.CheckAdmin.getCssValue("background-color");
	System.out.println("backgroundclr = " + backgroundColor );
	String bgc = "rgba(0, 0, 0, 0)";
	aa.assertEquals(backgroundColor, bgc);
	
	
	
	
	String borderColor = adminButton.CheckAdmin.getCssValue("border-color");
	System.out.println("borderColor = " + borderColor);
	String bc = "rgb(255, 255, 255)";
	aa.assertEquals(borderColor, bc);
	

	
	
	

	String font = adminButton.CheckAdmin.getCssValue("font-family");
    System.out.println("Font of button: " + font);
	String ft = "Roboto, sans-serif";
	aa.assertEquals(font, ft);
	
	
	
    String color = adminButton.CheckAdmin.getCssValue("color");
	System.out.println("Font color of button: " + color);
	String fontclr = "rgba(255, 255, 255, 1)";
	aa.assertEquals(fontclr, color);
	
	
	 String txt = adminButton.CheckAdmin.getText();
	 System.out.println("text = " + txt);
	 String txxt = "admin";
	 aa.assertEquals(txt, txxt);
	 
	 aa.assertAll();
	
//	SpellChecker spellChecker = new SpellChecker();
//	spellChecker.addDictionary(new SpellDictionaryHashMap());
//	List<String> mispelledWords = spellChecker.getMispelledWords(text);
//	String text = adminButton.CheckAdmin.getText();
//	System.out.println("Text of button: " + text);
//	String txt = text;
//	
	
	

//	boolean rahul = x == 1244 && y == 18 && width == 84 && height == 43 && backgroundColor == bgc &&  borderColor == bc && font == ft && text == txt;
//	if ( rahul ) {
//		System.out.println("pass");
//		
//	}else 
//		System.out.println("fail");
//	
		
	//assertEquals(false, false);
	
	
}
	
		
	
	
	
	
	
	
	
	
	
	
	
}