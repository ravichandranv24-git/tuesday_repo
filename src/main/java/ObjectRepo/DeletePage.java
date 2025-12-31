package ObjectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class DeletePage extends webDriverUtility {
	
	@FindBy(xpath ="//a[@title='Opportunities']") 
	private List<WebElement> ListOfOppos;
	@FindBy(xpath ="//a[text()='del']") 
	private WebElement DeletOppo;
	
	
	
	public DeletePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public List<WebElement> getListOfOppo() {
		return ListOfOppos;
	}
   public WebElement getDeletOppo() {
		return DeletOppo;
	}
	public void DeleOpportuity( String Oppo, WebDriver driver)
	{
		for(WebElement Opponame:ListOfOppos )
		{
			if(Opponame.equals(Oppo)) {
				break;
			}
		}
		DeletOppo.click();
		acceptAlertPopup(driver);
	}
    
}
