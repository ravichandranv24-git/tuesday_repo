package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class CreateInvoicePage extends webDriverUtility {

	@FindBy(xpath = "//input[@name='subject']") 
	private WebElement SupTextFd;
	@FindBy(xpath = "(//img[@alt='Select'])[3]")
	private WebElement ClickBt;
	@FindBy(id = "search_txt")
	private WebElement searchtxt;
	@FindBy(name = "search_field")
	private WebElement searchFd;
	@FindBy(name = "search")
	private WebElement searchBt1;
	@FindBy(name = "bill_street")
	private WebElement billText;
	@FindBy(name = "ship_street")
	private WebElement shipAd;
	@FindBy(xpath = "//img[@title='Products']")
	private WebElement searchIcon1;
	@FindBy(xpath = "//input[@id='search_txt']") 
	private WebElement searchTxt;
	//@FindBy(xpath = "//a[@href='javascript:window.close();']") 
	//private WebElement OgrSelect;
	@FindBy(xpath = "//select[@name='search_field']") 
	private WebElement searchDropDo;
	@FindBy(name ="search")
	private WebElement searchBt2;
	@FindBy(xpath ="//input[@id='qty1']")
	private WebElement Qty;
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement SaveBt;
	
	public CreateInvoicePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSupTextFd() {
		return SupTextFd;
	}

	public WebElement getClickBt() {
		return ClickBt;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getSearchFd() {
		return searchFd;
	}

	public WebElement getSearchBt1() {
		return searchBt1;
	}

	public WebElement getBillText() {
		return billText;
	}

	public WebElement getShipAd() {
		return shipAd;
	}

	public WebElement getSearchIcon1() {
		return searchIcon1;
	}

	public WebElement getSearchTxtOrg() {
		return searchTxt;
	}

	public WebElement getSearchDropDo() {
		return searchDropDo;
	}

	public WebElement getSearchBt2() {
		return searchBt2;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getSaveBt() {
		return SaveBt;
	}
	
	
	public void CreateInvo(String sup, WebDriver driver, String Org, String Value, String Add, String ShAdd, String Pro, String Value2, int a)
	{
		SupTextFd.sendKeys(sup);
		ClickBt.click();
	switchToWindow(driver, "Accounts&action");
		searchtxt.sendKeys(Org);
		dropDownUsingValue(searchFd, Value);
		searchBt1.click();
		 driver.findElement(By.xpath("//a[text()='" + Org + "']")).click();
		 acceptAlertPopup(driver);
		 switchToWindow(driver, "Invoice&action");
		 billText.sendKeys(Add);
		 shipAd.sendKeys(ShAdd);
		 waitUntillEleToeclickale(driver, 10,searchIcon1 );
		 searchIcon1 .click();
	     switchToWindow(driver, "Products&action");
	     waitUntillEleToeVisile(driver, 0, searchTxt);
	     searchTxt.sendKeys(Pro);
	     dropDownUsingValue(searchDropDo, Value2);
	     searchBt2.click();
	     driver.findElement(By.xpath("//a[text()='" + Pro + "']")).click();
	     switchToWindow(driver, "Invoice&action");
	     Qty.sendKeys(String.valueOf(a));

	    // Qty.sendKeys(a);
	     waitUntillEleToeclickale(driver,10,SaveBt );
	     SaveBt.click();

		 
	}
	
	
	
	
	
	
	
	
	
}
