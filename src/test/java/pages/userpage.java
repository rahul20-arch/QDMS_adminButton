package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userpage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]")
	public static WebElement master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[6]")
	public static WebElement employee;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[4]")
	public static WebElement user;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[3]/button")
	public static WebElement adduser;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[1]/label/span/input")
	public static WebElement tick;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/button[1]/span")
	public static WebElement send;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[3]/div")
	public static WebElement drop1;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div/div")
	public static WebElement click1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[4]")
	public static WebElement drop2;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/span")
	public static WebElement click2;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[4]/div/span")
	public static WebElement click3;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[8]/div/span")
	public static WebElement click4;
	
	
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
//	public static WebElement save;
}
 