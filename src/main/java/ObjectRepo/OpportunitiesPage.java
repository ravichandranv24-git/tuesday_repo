package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	@FindBy(xpath = "//img[@title='Create Opportunity...']") 
	private WebElement CreateOpportunitySym;
	
	public OpportunitiesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOpportunitySym() {
		return CreateOpportunitySym;
	}

	public void CrteOppoLoopUpImg() {
		 CreateOpportunitySym.click();
		
	}
	
}
