package Opportunities;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.ExcelUtils;
import GeericLiraries.FileUtility;
import GeericLiraries.JavaUtils;
import GeericLiraries.webDriverUtility;
import ObjectRepo.CreateOpportunitiesPage;
import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.DeletePage;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OpportunitiesPage;
import ObjectRepo.OrgaizationPage;
//@Listeners
public class OppertuitywithdeleteTest extends BaseClass {
	
	@Test
	public void OppertuitywithdeleteTest() throws IOException, InterruptedException {
//		WebDriver driver = null;
//		
//		FileUtility fUtil = new FileUtility();
//		ExcelUtils excUtil = new ExcelUtils();
//		JavaUtils javUtils = new JavaUtils();
//		webDriverUtility wUtil = new webDriverUtility();
//	
//		 String BROWSER = fUtil.readdatafromPropertyfile("browser");
//		 String URL = fUtil.readdatafromPropertyfile("url");
//		 String USERNAME = fUtil.readdatafromPropertyfile("username");
//		 String PASSWORD = fUtil.readdatafromPropertyfile("password");
//		 if(BROWSER.equalsIgnoreCase("chrome"))
//				 {
//			       driver = new ChromeDriver();
//				 }
//		 else if(BROWSER.equalsIgnoreCase("firefox"))
//			 {
//			 driver = new FirefoxDriver();
//			 }
//		 else if(BROWSER.equalsIgnoreCase("edge"))
//		 {
//			 driver = new EdgeDriver(); 
//		 }
//		 wUtil.maximizWidow(driver);
//		// driver.manage().window().maximize();
//			driver.get(URL);
//			wUtil.waitForPageLoad(driver);
//			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
////			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
////			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
////			driver.findElement(By.id("submitButton")).click();
//			LoginPage Lp = new LoginPage(driver);
//			Lp.loginToApp(USERNAME, PASSWORD);
			HomePage Hp  = new HomePage(driver);
			Hp.CreateOrgaHdLn();
//			
			OrgaizationPage Og = new OrgaizationPage(driver);
			Og.CreateOrgLookUpImg();
			//Assert.fail();
//			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			
			
			String Org = excUtil.readDataFromExcel("Organization", 0, 1)+javUtils.getRandomno();
			 String ind = excUtil.readDataFromExcel("Organization", 1, 1);
			 CreateOrganizationPage Cog = new CreateOrganizationPage(driver);
			 Cog.CreateOrg(Org, ind);
			 
			 
//			driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(Org);
//			WebElement Idustry = driver.findElement(By.xpath("//select[@name='industry']"));
//			Select s = new Select(Idustry);
//		s.selectByContainsVisibleText(ind);
//			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			String actuall = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			assertTrue(actuall.contains(Org), "failed");
//			 if(actuall.contains(Org)) {
//				 System.out.println("successfull");
//			 }
//			 else
//			 {
//				 System.out.println("fail");
//			}
//			 
// FileInputStream fis3 = new FileInputStream(".\\src\\test\\resources\\VTigerProIfo.xlsx");
// Workbook wb1 = WorkbookFactory.create(fis3);
// Sheet sh1 = wb1.getSheet("Opportunity");
// String Oppo = sh1.getRow(0).getCell(1).getStringCellValue()+random;
// String RelTo = sh1.getRow(1).getCell(1).getStringCellValue();
// String AssiTo = sh1.getRow(2).getCell(1).getStringCellValue();
// String Date = sh1.getRow(3).getCell(1).getStringCellValue();
// String SaStage = sh1.getRow(4).getCell(1).getStringCellValue();
// String In = sh1.getRow(5).getCell(1).getStringCellValue();
// String date=sh1.getRow(6).getCell(1).getStringCellValue();
			 
			 String Oppo = excUtil.readDataFromExcel("Opportunity", 0, 1)+javUtils.getRandomno();
			 String  RelTo = excUtil.readDataFromExcel("Opportunity", 1, 1);
			 String AssiTo = excUtil.readDataFromExcel("Opportunity", 2, 1);
			 String  Date  = excUtil.readDataFromExcel("Opportunity", 3, 1);
			 String SaStage = excUtil.readDataFromExcel("Opportunity", 4, 1);
			 String In  = excUtil.readDataFromExcel("Opportunity", 5, 1);
			 String date = excUtil.readDataFromExcel("Opportunity", 6, 1);
			
			 Hp.CreateOppoHdLn();
			 
//driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
			 OpportunitiesPage Op = new OpportunitiesPage(driver);
			 Op.CrteOppoLoopUpImg();
//driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
			 
			 CreateOpportunitiesPage COppo  = new CreateOpportunitiesPage(driver);
			 COppo.CreateOppo(Oppo, driver, Org, "accountname", "Accounts" , date, SaStage );
//driver.findElement(By.name("potentialname")).sendKeys(Oppo);
////Select s1 = new Select(driver.findElement(By.xpath("//select[@id='related_to_type']"))); 
//WebElement DropDo = driver.findElement(By.xpath("//select[@id='related_to_type']"));
////s1.selectByIndex(0);
//wUtil.dropDownUsingIndex(DropDo, 0);
//driver.findElement(By.xpath("//img[@alt='Select']")).click();
////String HostID = driver.getWindowHandle();
////Set<String> allIDs = driver.getWindowHandles();
////for(String ID:allIDs)
////if (!ID.equals(HostID)) {
////    driver.switchTo().window(ID);   // switch to child
////}
//wUtil.switchToWindow(driver,"Accounts&action" );
//driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(Org);
////Select s2 = new Select(driver.findElement(By.name("search_field")));
////s2.selectByContainsVisibleText(In);
//Thread.sleep(2000);
//WebElement SearchFi = driver.findElement(By.name("search_field"));
////wUtil.dropDownUsingContainsVisibleText(SearchFi, In );
////wUtil.dropDownUsingElemet(SearchFi, In);
//wUtil.dropDownUsingValue(SearchFi, "accountname");
////wUtil.dropDownUsingIndex(SearchFi, 1);
//driver.findElement(By.name("search")).click();
//driver.findElement(By.xpath("//a[text()='"+Org+"']")).click();
////driver.switchTo().window(HostID);
//wUtil.switchToWindow(driver, "Potentials&action");

//Select s3 = new Select(driver.findElement(By.xpath("//select[@id='related_to_type']"))); 
//s3.selectByValue("Accounts");
//WebElement RelTy = driver.findElement(By.xpath("//select[@id='related_to_type']"));
//wUtil.dropDownUsingValue(RelTy, "Accounts" );
//driver.findElement(By.xpath("//img[@id='jscal_trigger_closingdate']")).click();                //img[@id='jscal_trigger_closingdate']
//driver.findElement(By.xpath("//input[@name='closingdate']")).sendKeys(date);
////Select s4 = new Select(driver.findElement(By.name("sales_stage")));
////s4.selectByVisibleText(SaStage);

//WebElement SalesSag =driver.findElement(By.name("sales_stage"));
//wUtil.dropDownUsingElemet(SalesSag, SaStage );
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

String actuallOppor = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
System.out.println(actuallOppor);
assertTrue(actuallOppor.contains(Oppo),"Mismatch");
//if(actuallOppor.contains(Oppo)) {
// System.out.println("successfull");
//}
//else
//{
// System.out.println("fail");
//}

//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
////List<WebElement> list = driver.findElements(By.xpath("//a[@title='Organizations' ]"));
////for(WebElement lists:list)
////{
////if(lists.getText().contains(Org))
////	driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+Org+"']//ancestor::tr[@bgcolor='white' and @onmouseover=\"this.className='lvtColDataHover'\" ]/td[@width='2%']")).click();
////driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+Org+"']//ancestor::tr[@bgcolor='white' and @onmouseover=\"this.className='lvtColDataHover'\" ]/descendant::a[text()='del']")).click();
////}
////
////
////
//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//
//// Wait for table to load
//Thread.sleep(2000);
//
//List<WebElement> rows = driver.findElements(
//By.xpath("//table[@class='lvt small']//tr[@bgcolor='white']")
//);
//
//boolean found = false;
//
//for (WebElement row : rows) 
//{
// WebElement nameEle = driver.findElement(By.xpath("//a[@title='Organizations']"));
//    String name = nameEle.getText().trim();
//
//if (name.equalsIgnoreCase(Org.trim())) 
//{
//    // Click checkbox
//    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//
//    // Click delete link
//    row.findElement(By.xpath("//a[text()='del']")).click();
//    found = true;
//    break;
//}
//}
//
//if(found) {
//Alert al = driver.switchTo().alert();
//System.out.println("Alert message: " + al.getText());
//al.accept();
//} else {
//System.out.println("Organization NOT FOUND in list!");
//}
//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//driver.findElement(By.linkText("Sign Out")).click();

					// -----------------------------------------
					//delete Org

Hp.CreateOppoHdLn();
		//navigate to home page and click on opportunities link
		//driver.findElement(By.linkText("Opportunities")).click();
      DeletePage DP = new DeletePage(driver);
      DP.DeleOpportuity(Oppo, driver);




//		 Hp  = new HomePage(driver);
//		Hp.CreateOrgaHdLn();
//		List<WebElement> alllink = driver.findElements(By.xpath("//a[@title='Organizations']"));//traversing through opportunity name
//		
//		for(WebElement link: alllink) {
//			if(link.equals(Oppo)) {
//			break;
//			}
////			driver.findElement(By.xpath("//a[text()='Business']/../following-sibling::td[@onmouseout=\"vtlib_listview.trigger('cell.onmouseout', $(this))\"]")).click();
////		}
////		 click on delete link
//	driver.findElement(By.xpath("//a[text()='del']")).click();
////		
//	driver.switchTo().alert().accept();
				
					// -----------------------------------------
					// 10. Logout
					// -----------------------------------------
					
//					driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//					driver.findElement(By.linkText("Sign Out")).click();
//					driver.quit();
	}
//	}
//	@Test(groups = {"smoke"})
//	public void ImpactedReg()
//	{
//		System.out.println("Impacted Regio");
//	}
}




