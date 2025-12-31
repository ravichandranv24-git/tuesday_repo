package Invoice;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.ExcelUtils;
import GeericLiraries.FileUtility;
import GeericLiraries.JavaUtils;
import GeericLiraries.webDriverUtility;
import ObjectRepo.CreateInvoicePage;
import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.CreateProductPage;
import ObjectRepo.HomePage;
import ObjectRepo.InvoicePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OrgaizationPage;
import ObjectRepo.ProductPage;

public class waitInvoice extends BaseClass {                   //Invoice.waitInvoice
	@Test
public void waitInvoice () throws IOException, InterruptedException {
		
		
					
					HomePage Hp  = new HomePage(driver);
					Hp.CreateOrgaHdLn();
//					
					OrgaizationPage Og = new OrgaizationPage(driver);
					Og.CreateOrgLookUpImg();
					
					
					String Org = excUtil.readDataFromExcel("Organization", 0, 1)+javUtils.getRandomno();
					String ind = excUtil.readDataFromExcel("Organization", 1, 1);
					
					
					CreateOrganizationPage Cog = new CreateOrganizationPage(driver);
					 Cog.CreateOrg(Org, ind);
Thread.sleep(1000);

					String actuall = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
					assertTrue(actuall.contains(Org));
//					System.out.println(actuall);
//					 if(actuall.contains(Org)) {
//						 System.out.println("successfull");
//					 }
//					 else
//					 {
//						 System.out.println("fail");
//					}
//					 
					 
					
				
	
					 Hp.CreateProHdLn();
		
		String Pro = excUtil.readDataFromExcel("Invoice", 0, 1);
		//pass the productname
		ProductPage Pp = new ProductPage(driver);
		Pp.CrtProLookUpImg();
		CreateProductPage CPp  = new CreateProductPage(driver);
		CPp.CtPdoCre(Pro, driver);
		


		String actuallPro =(driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText());
		
		
		System.out.println(actuallPro);
		System.out.println(Pro);
		assertTrue(actuallPro.contains(Pro));
//		 if(actuallPro.contains(Pro)) {
//			 System.out.println("successfull");
//		 }
//		 else
//		 {
//			 System.out.println("fail");
//		}
				 
		 Hp.InvoBtn(driver);
		 InvoicePage IVoiceSy = new InvoicePage(driver);
		 IVoiceSy.CreateInvoiceLookup();
      
      String Sub = excUtil.readDataFromExcel("Invoice", 0, 1)+javUtils.getRandomno();
      String BillAd = excUtil.readDataFromExcel("Invoice", 1, 1);
      String ShipAd = excUtil.readDataFromExcel("Invoice", 2, 1);
      Thread.sleep(1000);
      CreateInvoicePage CIP = new CreateInvoicePage (driver);
      CIP.CreateInvo(Sub, driver, Org, "accountname", BillAd,ShipAd , Pro, "productname", 1);
//      driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(Sub);
//
//      // -------------------------
//      // Select Organization from Popup
//      // -------------------------
//      driver.findElement(By.xpath("(//img[@alt='Select'])[3]")).click();
//      wUtil.switchToWindow(driver, "Accounts&action");
////      String parentID = driver.getWindowHandle();
////      Set<String> allIDs = driver.getWindowHandles();
////
////      for (String id : allIDs) {
////          if (!id.equals(parentID)) {
////              driver.switchTo().window(id);
////          }
////      }
////
//      // Search product
//      driver.findElement(By.id("search_txt")).sendKeys(Org);
//
//      Select s1 = new Select(driver.findElement(By.name("search_field")));
//      s1.selectByVisibleText("Organization Name");
//
//      driver.findElement(By.name("search")).click();
//
//      driver.findElement(By.xpath("//a[text()='" + Org + "']")).click();
//   Alert a = driver.switchTo().alert();
//      a.accept();
//
//      // Switch back to parent
//      wUtil.switchToWindow(driver, "Invoice&action");
//      //driver.switchTo().window(parentID);
//
//      // Billing & Shipping Address
//      driver.findElement(By.name("bill_street")).sendKeys(BillAd);
//      driver.findElement(By.name("ship_street")).sendKeys(ShipAd);
//      //Thread.sleep(2000);
//      WebElement searchIcon = driver.findElement(By.xpath("//img[@id='searchIcon1']"));
//      wUtil.waitUntillEleToeclickale(driver, 0, searchIcon);
//      searchIcon.click();
//      
//      wUtil.switchToWindow(driver, "Products&action");
////      String Parenthwindow1= driver.getWindowHandle();
////		Set<String> allwindows1 = driver.getWindowHandles();
////		
////		for(String win: allwindows1)
////		{
////			driver.switchTo().window(win);
////			String CurrentWindowid = driver.getWindowHandle();
////			if (!(CurrentWindowid.equals(Parenthwindow1)))
////				break;
////			}
//		//Thread.sleep(3000);
//      WebElement ProTextField = driver.findElement(By.id("search_txt"));
//      wUtil.waitUntillEleToeVisile(driver, 0, ProTextField);
//
//      ProTextField.sendKeys(Pro);
//      Select s2 = new Select(driver.findElement(By.name("search_field")));
//      s2.selectByVisibleText("Product Name");
//
//      driver.findElement(By.name("search")).click();
//
//      driver.findElement(By.xpath("//a[text()='" + Pro + "']")).click();
//      wUtil.switchToWindow(driver, "Invoice&action");
//      //driver.switchTo().window(Parenthwindow1);
//      driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("1");
//     // Thread.sleep(2000);
//
//      // Save Invoice
//      WebElement SaveButt = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
//      wUtil.waitUntillEleToeclickale(driver, 0, SaveButt);
//      SaveButt.click();
      
      String actuallInvio = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		 System.out.println(actuallInvio);
		 assertTrue(actuallInvio.contains(Sub));
//		 if(actuallInvio.contains(Sub)) {
//			 System.out.println("successfull");
//		 }
//		 else
//		 {
//			 System.out.println("fail");
//		}

      // -------------------------
      // Logout

  }



				
				
			             






}


