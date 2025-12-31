package Product;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.ExcelUtils;
import GeericLiraries.FileUtility;
import GeericLiraries.JavaUtils;
import GeericLiraries.webDriverUtility;
import ObjectRepo.CreateProductPage;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.ProductPage;

	public class CreateProductTest extends BaseClass
	{
		@Test(groups = "smoke")
		public void CreateProductTest () throws IOException, InterruptedException {
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
//					 String PASSWORD = fUtil.readdatafromPropertyfile("password");           // Product.CreateProductTest
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
//						//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//						driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//						driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//						driver.findElement(By.id("submitButton")).click();
			//click on product link
						HomePage Hp  = new HomePage(driver);
						Hp.CreateProHdLn();
			//driver.findElement(By.xpath("//a[@href='index.php?module=Products&action=index']")).click();
			
			//click on create product
						ProductPage Pp = new ProductPage(driver);
						Thread.sleep(1000);
						Pp.CrtProLookUpImg();
			//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			
			String Pro = excUtil.readDataFromExcel("Product", 0, 1)+javUtils.getRandomno();
			//pass the productname
			CreateProductPage CPp  = new CreateProductPage(driver);
			CPp.CtPdoCre(Pro, driver);
//			driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(Pro);
//			
//			//insepect the vendor textfiled
//			driver.findElement(By.xpath("//input[@name='vendor_name']")).click();
//			
//			//inspect the plus symbol of the vendor
//			driver.findElement(By.xpath("//img[@alt='Select']")).click();
//			
//			wUtil.switchToWindow(driver, "Vendors&action");
////			//switch to vendor page
////			String Parenthwindow= driver.getWindowHandle();
////			Set<String> allwindows = driver.getWindowHandles();
////			
////			for(String win: allwindows)
////			{
////				driver.switchTo().window(win);
////				String CurrentWindowid = driver.getWindowHandle();
////				if (!(CurrentWindowid.equals(Parenthwindow)))
////					break;
////				}
//			
//			//select the vendor name
//			driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
//			
//			//switch to parent window
//			//driver.switchTo().window(Parenthwindow);
//			wUtil.switchToWindow(driver, "Products&action");
//			
//			//cick on save button
//			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//			
			//printing the confirmation message
			
			
			Thread.sleep(3000);
			 String actuallPro = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
			 System.out.println(actuallPro);
			 assertTrue(actuallPro.contains(Pro), "Failed");
//			 if(actuallPro.contains(Pro)) {
//				 System.out.println("successfull");
//			 }
//			 else
//			 {
//				 System.out.println("fail");
//			}
//			 Hp.SiOuBt();
////			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
////			driver.findElement(By.linkText("Sign Out")).click();
//			driver.quit();
			
	         

			
			
	}
	}

