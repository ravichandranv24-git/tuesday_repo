package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class CreateOrganizationPage extends webDriverUtility{
	
	@FindBy(xpath = "//input[@name='accountname']") 
	private WebElement accountname;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") 
	private WebElement OrgSaveBt;
	@FindBy(xpath = "//select[@name='industry']") 
	private WebElement industryDropDo;
	
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccountname() {
		return accountname;
	}

	public WebElement getOrgSaveBt() {
		return OrgSaveBt;
	}

	public WebElement getIndustryDropDo() {
		return industryDropDo;
	}
	
	public void CreateOrg(String accname)
	{
		accountname.sendKeys(accname);
		OrgSaveBt.click();
		}
	
	public void CreateOrg(String accname, String indText)
	{
		accountname.sendKeys(accname);
		dropDownUsingContainsVisibleText(industryDropDo, indText);
		OrgSaveBt.click();
		}
	
	
	
}
