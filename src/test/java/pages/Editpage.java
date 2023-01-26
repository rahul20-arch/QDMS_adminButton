package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Editpage {

	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]")
	public static WebElement material;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[4]")
	public static WebElement source;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/span/a[1]/span")
	public static WebElement editButton;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	public static WebElement editsource;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/input")
	public static WebElement editdescription;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement save;
	
	
}
