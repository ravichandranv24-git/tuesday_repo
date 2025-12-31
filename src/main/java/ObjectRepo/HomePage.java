package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeericLiraries.webDriverUtility;

public class HomePage extends webDriverUtility{

	
	@FindBy(xpath = "//a[text()='Organizations']") 
	private WebElement Organizations;
	@FindBy(xpath = "//a[text()='Opportunities']") 
	private WebElement Opportunities;
	@FindBy(xpath = "//a[text()='Contacts']") 
	private WebElement Contacts ;
	@FindBy(xpath ="//a[@href='index.php?module=Products&action=index']" ) 
	private WebElement Products;
	@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']" ) 
	private WebElement menuDnArrow;
	@FindBy(xpath = "//a[@href='index.php?module=Invoice&action=index' and @ id='more']" ) 
	private WebElement InvoiceBtn;
	@FindBy(xpath = "//a[@href='index.php?module=Vendors&action=index']" ) 
	private WebElement VendorsBtn;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']" ) 
	private WebElement SignOutDrop;
	@FindBy( linkText = "Sign Out" ) 
	private WebElement SignOut;
	
	
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrganizations() {                       
		return Organizations;
	}
	public WebElement getOpportunities() {
		return Opportunities;
	}
	public WebElement getContacts() {
		return Contacts;
	}
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getMenuDnArrow() {
		return menuDnArrow;
	}
	public WebElement getInvoiceBtn() {
		return InvoiceBtn;
	}
	public WebElement getVendorsBtn() {
		return VendorsBtn;
	}
	public WebElement getSignOut() {
		return SignOutDrop;
	}
	public void setSignOut(WebElement signOut) {
		SignOut = signOut;
	}

	public void CreateOrgaHdLn()
	{
		Organizations.click();	
	}
	public void CreateOppoHdLn()
	{
		Opportunities.click();	
	}
	public void CreateConHdLn()
	{
		Contacts.click();	
	}
	public void CreateProHdLn()
	{
		Products.click();	
	}
//	public void menuDnAr()
//	{
//		menuDnArrow.click();	
//	}
	public void InvoBtn(WebDriver driver)
	{
		waitUntillEleToeVisile(driver, 10, menuDnArrow);
		menuDnArrow.click();	
		waitUntillEleToeclickale(driver, 10, InvoiceBtn );
		InvoiceBtn.click();
		
			}
	public void VenBtn(WebDriver driver)
	{
		waitUntillEleToeVisile(driver, 15, menuDnArrow);
		menuDnArrow.click();
		waitUntillEleToeclickale(driver, 15,VendorsBtn);
		VendorsBtn.click();	
	}
	public void SiOuBt (WebDriver driver)
	{
		waitUntillEleToeVisile(driver, 0, SignOutDrop);
		SignOutDrop.click();
		
		SignOut.click();
	}
	
	
	
}
