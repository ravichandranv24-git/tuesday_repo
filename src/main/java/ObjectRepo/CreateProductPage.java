package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class CreateProductPage extends webDriverUtility{
	@FindBy(xpath = "//input[@name='productname']") 
	private WebElement Proname;
	@FindBy(xpath ="//input[@name='vendor_name']") 
	private WebElement Ventextfiled;
	@FindBy(xpath ="//img[@alt='Select']") 
	private WebElement VeSym;
	@FindBy(xpath ="//a[@href='javascript:window.close();']") 
	private WebElement vendorname;
	@FindBy(xpath ="//input[@title='Save [Alt+S]']") 
	private WebElement SaveBt;
	
	public CreateProductPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProname() {
		return Proname;
	}

	public WebElement getVentextfiled() {
		return Ventextfiled;
	}

	public WebElement getVeSym() {
		return VeSym;
	}

	public WebElement getVendorname() {
		return vendorname;
	}

	public WebElement getSaveBt() {
		return SaveBt;
	}
	public void CtPdoCre(CharSequence pro, WebDriver driver)
	{
		Proname.sendKeys(pro);
		Ventextfiled.click();
		VeSym.click();
		switchToWindow(driver, "Vendors&action");
		vendorname.click();
		switchToWindow(driver, "Products&action");
		SaveBt.click();
	}
	
	
}

