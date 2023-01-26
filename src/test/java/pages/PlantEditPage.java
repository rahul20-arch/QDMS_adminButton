package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlantEditPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[1]/span/a")
	public static WebElement plant;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]/div[1]")
	public static WebElement addplant;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[9]/span/a/span")
	public static WebElement plantEdit;
	
	@FindBy(id = "plant_name")
	public static WebElement editPlant;
	
	@FindBy(id = "plant_address")
	public static WebElement editaddress;
	
	@FindBy(id = "plant_contactno")
	public static WebElement editcontactno;
	
	@FindBy(id =  "fax")
	public static WebElement editfax;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[2]/div/div[1]")
	public static WebElement clickDrop1;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[4]/div")
	public static WebElement selectdrop1;
	
	@FindBy(id = "plant_description")
	public static WebElement editdescription;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement update;
	
	
	
	
	
	
	
	
}
