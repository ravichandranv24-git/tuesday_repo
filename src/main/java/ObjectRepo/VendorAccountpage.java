package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorAccountpage {
	@FindBy(xpath = "//img[@alt='Create Vendor...']") 
	private WebElement CreateVendorSym;
	
	public  VendorAccountpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateVendorSym() {
		return CreateVendorSym;
	}
	
	public void VederLoopupIm()
	{
		CreateVendorSym.click();
	}
	
}
