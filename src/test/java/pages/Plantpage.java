package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Plantpage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]")
	public static WebElement plant;
	
	@FindBy(xpath = "//*[@id=\"addPlant\"]")
	public static WebElement addplant;
	
	@FindBy(id  = "plant_code")
	public static WebElement plantcode;
	
	@FindBy(id = "plant_name")
	public static WebElement plantname;
	
	@FindBy(id = "plant_address")
	public static WebElement plantaddress;
	
	@FindBy(id = "plant_contactno")
	public static WebElement plantcontactno;
	
	@FindBy(id = "fax")
	public static WebElement fax;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[2]/div/div[1]")
	public static WebElement SubBusinessUnit;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[3]/div/span")
	public static WebElement drop1;
	
	@FindBy(id = "plant_description")
	public static WebElement description;
	
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
//	public static WebElement savebutton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[1]")
	public static WebElement cancelbutton;
}
