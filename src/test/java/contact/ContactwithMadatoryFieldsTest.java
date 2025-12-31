package contact;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.ExcelUtils;
import GeericLiraries.FileUtility;
import GeericLiraries.JavaUtils;
import GeericLiraries.webDriverUtility;
import ObjectRepo.ContactPage;
import ObjectRepo.CreateContactPage;
import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OrgaizationPage;

public class ContactwithMadatoryFieldsTest extends BaseClass {
	@Test(groups = "smoke")
	public void ContactwithMadatoryFieldsTest() throws IOException, InterruptedException {
//WebDriver driver = null;
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
			
			String Org = excUtil.readDataFromExcel("Organization", 0, 1)+javUtils.getRandomno();
			String Lastname= excUtil.readDataFromExcel("Contact", 0, 1);
			HomePage Hp  = new HomePage(driver);
			Hp.CreateConHdLn();
			ContactPage Cp =  new ContactPage(driver);
			Cp.CreateContactLoopUp();
//			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//			driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
			CreateContactPage conPg =  new CreateContactPage(driver);
			
			conPg.CreatCon(Lastname);
//			
//			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
//			driver.findElement(By.xpath("//img[@alt='Select']")).click();
//			
//			//String HostID = driver.getWindowHandle();
////			Set<String> allIDs = driver.getWindowHandles();
////			for(String ID:allIDs)
////				if (!ID.equals(HostID)) {
////			        driver.switchTo().window(ID);   // switch to child
////			    }
//			wUtil.switchToWindow(driver, "Accounts&action");
//			driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(Org);
//			driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
//			//driver.switchTo().window(HostID);
//			wUtil.switchToWindow(driver,"Contacts&action" );
			
			
//			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
//			w.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@title='Save [Alt+S]']")));
//			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			String actuallCo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			Assert.assertTrue(actuallCo.contains(Lastname));
			
//			System.out.println(actuallCo);
//			System.out.println(Lastname)
//			 if(actuallCo.contains(Lastname)) {
//				 System.out.println("successfull");
//			 }
//			 else
//			 {
//				 System.out.println("fail");
//			}
			// Hp.SiOuBt(driver);
//			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//			driver.findElement(By.linkText("Sign Out")).click();
			//driver.quit();
			
			
}
	
//	@Test
//	public void  CreateOrgAdCotactInOeTest()  throws IOException, InterruptedException {
//		
////		WebDriver driver = null;
////		
////		FileUtility fUtil = new FileUtility();
////		ExcelUtils excUtil = new ExcelUtils();
////		JavaUtils javUtils = new JavaUtils();
////		webDriverUtility wUtil = new webDriverUtility();
////		 String BROWSER = fUtil.readdatafromPropertyfile("browser");
////		 String URL = fUtil.readdatafromPropertyfile("url");
////		 String USERNAME = fUtil.readdatafromPropertyfile("username");
////		 String PASSWORD = fUtil.readdatafromPropertyfile("password");
////		 if(BROWSER.equalsIgnoreCase("chrome"))
////				 {
////			       driver = new ChromeDriver();
////				 }
////		 else if(BROWSER.equalsIgnoreCase("firefox"))
////			 {
////			 driver = new FirefoxDriver();
////			 }
////		 else if(BROWSER.equalsIgnoreCase("edge"))
////		 {
////			 driver = new EdgeDriver(); 
////		 }
////		 wUtil.maximizWidow(driver);
////		 //driver.manage().window().maximize();
////			driver.get(URL);
////			wUtil.waitForPageLoad(driver);
////			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//////			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//////			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//////			driver.findElement(By.id("submitButton")).click();
////		 LoginPage Lp = new LoginPage(driver);
////		 Lp.loginToApp(USERNAME, PASSWORD);
//		 
////		 Random ran =  new Random();
////		 int random = ran.nextInt(500);
//		 
//		 String Org = excUtil.readDataFromExcel("Organization", 0, 1)+javUtils.getRandomno();
//		 String ind = excUtil.readDataFromExcel("Organization", 1, 1);
////		 FileInputStream fis1 = new FileInputStream(".\\src\\test\\resources\\VTigerProIfo.xlsx");
////		 Workbook wb = WorkbookFactory.create(fis1);
////		 Sheet sh = wb.getSheet("Organization");
////		 String Org = sh.getRow(0).getCell(1).getStringCellValue()+random;
////		 String ind = sh.getRow(1).getCell(1).getStringCellValue();
//		 
//		 HomePage Hp  = new HomePage(driver);
//			Hp.CreateOrgaHdLn();
////			
//			OrgaizationPage Og = new OrgaizationPage(driver);
//			Og.CreateOrgLookUpImg();
//			
////		    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
////			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//			 CreateOrganizationPage Cog = new CreateOrganizationPage(driver);
//			 Cog.CreateOrg(Org, ind);
//			
////			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(Org);
////			WebElement Idustry = driver.findElement(By.xpath("//select[@name='industry']"));
////			Select s = new Select(Idustry);
////			s.selectByContainsVisibleText(ind);
////			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//			 String actuall = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//			 System.out.println(Org);
//			 System.out.println(actuall);
//			 if(actuall.contains(Org)) {
//				 System.out.println("successfull");
//			 }
//			 else
//			 {
//				 System.out.println("fail");
//			}
//			
//				Hp.CreateConHdLn();
//				ContactPage Cp =  new ContactPage(driver);
//				Cp.CreateContactLoopUp();
////			 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
////				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
//			 
//			 
//				String Lastname= excUtil.readDataFromExcel("Contact", 0, 1)+javUtils.getRandomno();
//				CreateContactPage conPg =  new CreateContactPage(driver);
//				conPg.CreatCon(Lastname, Org, driver, "accountname");
//				
////				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
////				driver.findElement(By.xpath("//img[@alt='Select']")).click();
////				
//////				String HostID = driver.getWindowHandle();
//////				Set<String> allIDs = driver.getWindowHandles();
//////				//Iterator<String> it = windows.iterator();
//////				for(String ID:allIDs)
//////					if (!ID.equals(HostID)) {
//////				        driver.switchTo().window(ID);   // switch to child
//////				    }
////				wUtil.switchToWindow(driver, "Accounts&action");
////				driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(Org);
////				Select s1 = new Select(driver.findElement(By.xpath(" //select[@name='search_field']")));
////				s1.selectByContainsVisibleText("Organization Name");
////				driver.findElement(By.name("search")).click();
////				driver.findElement(By.xpath("//a[text()='"+Org+"']")).click();
////				wUtil.switchToWindow(driver,"Contacts&action" );
//////wUtil.waitUntillEleToeclickale(driver, 0, Idustry)
//////				WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
//////				w.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@title='Save [Alt+S]']")));
////				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//				 String actuallCo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//				 System.out.println(actuallCo);
//				 if(actuallCo.contains(Lastname)) {
//					 System.out.println("successfull");
//				 }
//				 else
//				 {
//					 System.out.println("fail");
//				}
////				 Hp.SiOuBt();
//////				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//////				driver.findElement(By.linkText("Sign Out")).click();
////				driver.quit();
//				
//			
//				
//			
//			
//			
//			
			
			
			
}


//Contacts&action