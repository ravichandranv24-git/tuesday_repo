package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class CreateOpportunitiesPage extends webDriverUtility {

	@FindBy(name = "potentialname") 
	private WebElement Opponame;
	@FindBy(xpath ="//select[@id='related_to_type']") 
	private WebElement DropDow;
	@FindBy(xpath = "//img[@alt='Select']") 
	private WebElement ImgClick;
	@FindBy(xpath = "//input[@id='search_txt']") 
	private WebElement searchTxt;
    @FindBy(xpath = "//select[@name='search_field']") 
	private WebElement searchDropD;
    @FindBy(name ="search")
	private WebElement searchBt11;
	//@FindBy(xpath = "//a[text()='"+Org+"']") 
	//private WebElement SelectOrg; 
    @FindBy(xpath = "//select[@id='related_to_type']") 
   	private WebElement relaTy;
    @FindBy(xpath = "//img[@id='jscal_trigger_closingdate']") 
   	private WebElement Calender;
    @FindBy(xpath = "//input[@name='closingdate']") 
   	private WebElement Date;
    @FindBy(name = "sales_stage") 
   	private WebElement salesstage;
    @FindBy(xpath = "//input[@title='Save [Alt+S]']") 
   	private WebElement SaveBtn;
    
    public CreateOpportunitiesPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOpponame() {
		return Opponame;
	}

	public WebElement getDropDow() {
		return DropDow;
	}

	public WebElement getImgClick() {
		return ImgClick;
	}

	public WebElement getSearchTxt() {
		return searchTxt;
	}

	public WebElement getSearchDropD() {
		return searchDropD;
	}

	public WebElement getSearchBt11() {
		return searchBt11;
	}

	public WebElement getRelaTy() {
		return relaTy;
	}

	public WebElement getCalender() {
		return Calender;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getSalesstage() {
		return salesstage;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

    public void CreateOppo(CharSequence opponame, WebDriver driver, CharSequence Org, String value, String value1, CharSequence date, String Ele)
    {
    	Opponame.sendKeys(opponame);
    	dropDownUsingIndex(DropDow, 0);
    	ImgClick.click();
    	switchToWindow(driver,"Accounts&action");
    	searchTxt.sendKeys(Org);
    	dropDownUsingValue(searchDropD, value);
    	searchBt11.click();
    	driver.findElement(By.xpath("//a[text()='"+Org+"']")).click();
    	switchToWindow(driver, "Potentials&action");
    	dropDownUsingValue(relaTy, value1);
    	Calender.click();
    	Date.sendKeys(date);
    	dropDownUsingElemet(salesstage, Ele);
    	SaveBtn.click();
    	}
    
  
    

	
}
