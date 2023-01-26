package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sourcepage {

	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]")
	public static WebElement material;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[4]")
	public static WebElement source;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button")
	public static WebElement addsource;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	public static WebElement entersource;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/input")
	public static WebElement enterdescription;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement save;
	
	
	
	
}
