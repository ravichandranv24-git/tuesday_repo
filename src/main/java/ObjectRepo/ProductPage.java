package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") 
	private WebElement CreateProductSym;
	
	public ProductPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateProductSym() {
		return CreateProductSym;
	}
	public void CrtProLookUpImg()
	{
		CreateProductSym.click();
	}
	
	
	
}
