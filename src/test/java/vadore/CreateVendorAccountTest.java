package vadore;



	import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.ExcelUtils;
import GeericLiraries.FileUtility;
import GeericLiraries.JavaUtils;
import GeericLiraries.webDriverUtility;
import ObjectRepo.CreateVendorAccountpage;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.VendorAccountpage;

	public class CreateVendorAccountTest extends BaseClass
	{
		@Test(retryAnalyzer = GeericLiraries.RetryAnalyzer.class)
		public void CreateVendorAccountTest ()  throws IOException, InterruptedException {
//			WebDriver driver = null;
//					
//					FileUtility fUtil = new FileUtility();
//					ExcelUtils excUtil = new ExcelUtils();
//					JavaUtils javUtils = new JavaUtils();
//					webDriverUtility wUtil = new webDriverUtility();
//					
//					 String BROWSER = fUtil.readdatafromPropertyfile("browser");
//					 String URL = fUtil.readdatafromPropertyfile("url");
//					 String USERNAME = fUtil.readdatafromPropertyfile("username");
//					 String PASSWORD = fUtil.readdatafromPropertyfile("password");
//					 if(BROWSER.equalsIgnoreCase("chrome"))
//							 {
//						       driver = new ChromeDriver();
//							 }
//					 else if(BROWSER.equalsIgnoreCase("firefox"))
//						 {
//						 driver = new FirefoxDriver();
//						 }
//					 else if(BROWSER.equalsIgnoreCase("edge"))
//					 {
//						 driver = new EdgeDriver(); 
//					 }
//					 wUtil.maximizWidow(driver);
//					// driver.manage().window().maximize();
//						driver.get(URL);
//						wUtil.waitForPageLoad(driver);
//						LoginPage Lp =  new LoginPage(driver);
//						Lp.loginToApp(USERNAME, PASSWORD);
////						//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//						driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//						driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//						driver.findElement(By.id("submitButton")).click();
				
				//inspect the more button
						HomePage Hp  = new HomePage(driver);
						Hp.VenBtn(driver);
//				driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
//				
				Assert.fail();
//			    //click on vendor button
//				driver.findElement(By.xpath("//a[@href='index.php?module=Vendors&action=index']")).click();
//				
				//clcik on create vendor account
						VendorAccountpage VA = new VendorAccountpage(driver);
						VA.VederLoopupIm();
						
				//driver.findElement(By.xpath("//img[@alt='Create Vendor...']")).click();
				
				String Ven = excUtil.readDataFromExcel("Vendors", 0, 1)+javUtils.getRandomno();
				//pass the vendor name
				CreateVendorAccountpage CVA = new CreateVendorAccountpage(driver);
				Thread.sleep(1000);
				CVA.CrtVeAcc(Ven);
		//driver.findElement(By.xpath("//input[@name='vendorname']")).sendKeys(Ven);
//				
//				//save the account
//				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//				
//
//				Thread.sleep(3000);
//				
				//printing the confirmation message
				System.out.println(driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText());

				
				Thread.sleep(3000);
				 String actuallVen = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
				 System.out.println(actuallVen);
				 assertTrue(actuallVen.contains(Ven));
//				 if(actuallVen.contains(Ven)) {
//					 System.out.println("successfull");
//				 }
//				 else
//				 {
//					 System.out.println("fail");
//				}
				
				Thread.sleep(5000);
				//signout
	//  driver.findElement(By.xpath("//a[text()= 'Sign Out']")).click();
//				Actions act = new 	Actions(driver);
//	            act.moveToElement(signout).click().perform();
//				 Hp.SiOuBt();
////				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
////				driver.findElement(By.linkText("Sign Out")).click();
//				driver.quit();
				
				
	}
	}

