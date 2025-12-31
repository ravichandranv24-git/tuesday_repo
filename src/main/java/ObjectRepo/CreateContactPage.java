package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class CreateContactPage extends webDriverUtility{

	
	@FindBy(xpath = "//input[@name='lastname']") 
	private WebElement lastname;
	@FindBy(xpath ="//img[@alt='Select']") 
	private WebElement ClickOrgBt;
	@FindBy(xpath = "//input[@id='search_txt']") 
	private WebElement searchTxtOrg;
	//@FindBy(xpath = "//a[@href='javascript:window.close();']") 
	//private WebElement OgrSelect;
	@FindBy(xpath = "//select[@name='search_field']") 
	private WebElement searchDropDo;
	
	@FindBy(name ="search")
	private WebElement searchBt;
	
	
	
	
	//@FindBy(xpath = "//a[text()='"+Org+"']") 
	//private WebElement SelectOrg;  
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']" ) 
	private WebElement SaveConBt;
	
	public CreateContactPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getClickOrgBt() {
		return ClickOrgBt;
	}

	public WebElement getSearchTxtOrg() {
		return searchTxtOrg;
	}

//public WebElement getOgrSelect() {
//		return OgrSelect;
//	}

	public WebElement getSaveConBt() {
		return SaveConBt;
	}
	public void CreatCon(String lsname)
	{
		lastname.sendKeys(lsname);
		SaveConBt.click();
	}
	
	
	public void CreatCon(CharSequence lsname, CharSequence Org, WebDriver driver, String value)
	{
		lastname.sendKeys(lsname);
	    ClickOrgBt.click();
		switchToWindow(driver, "Accounts&action");
		searchTxtOrg.sendKeys(Org);
		dropDownUsingValue(searchDropDo, value);
		 searchBt.click();
		driver.findElement(By.xpath("//a[text()='"+Org+"']")).click();
		switchToWindow(driver, "Contacts&action");
		SaveConBt.click();
		
		
	}
	
}
