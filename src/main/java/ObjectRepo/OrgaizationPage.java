package ObjectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class OrgaizationPage extends webDriverUtility {
	@FindBy(xpath = "//img[@title='Create Organization...']") 
	private WebElement CreateOrganizationSym;
	
	@FindBy(xpath ="//a[@title='Organizations']") 
	private List<WebElement> ListOfOrg;
	@FindBy(xpath ="//a[text()='del']") 
	private WebElement DeletOrg;
	
	public OrgaizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganization() {
		return CreateOrganizationSym;
	}
	
	public void CreateOrgLookUpImg()
	{
		CreateOrganizationSym.click();
	}
	public void DeleOrga( String Org, WebDriver driver)
	{
		for(WebElement Opponame:ListOfOrg )
		{
			if(Opponame.equals(Org)) {
				break;
			}
		}
		DeletOrg.click();
		acceptAlertPopup(driver);
	}
    
	
}
