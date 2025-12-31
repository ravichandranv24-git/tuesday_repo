package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendorAccountpage {
	@FindBy(xpath = "//input[@name='vendorname']") 
	private WebElement vendorname;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") 
	private WebElement SaveBt;
	
	public CreateVendorAccountpage  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getVendorname() {
		return vendorname;
	}

	public WebElement getSaveBt() {
		return SaveBt;
	}
	
	public void CrtVeAcc(String Vename)
	{
		vendorname.sendKeys(Vename);
		SaveBt.click();
		
	}
}
