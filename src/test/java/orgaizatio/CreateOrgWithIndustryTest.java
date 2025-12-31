package orgaizatio;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.sl.usermodel.GroupShape;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import GeericLiraries.ExcelUtils;
import GeericLiraries.FileUtility;
import GeericLiraries.JavaUtils;
import GeericLiraries.webDriverUtility;
import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OrgaizationPage;
@Listeners(GeericLiraries.ListerImplemetatioClass.class)
public class CreateOrgWithIndustryTest extends BaseClass{
	@Test(groups = "smoke", retryAnalyzer = GeericLiraries.RetryAnalyzer.class)
	public  void CreateOrgWithIndustryTest()  throws IOException, InterruptedException {
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
//			LoginPage Lp =  new LoginPage(driver);
//			Lp.loginToApp(USERNAME, PASSWORD);
//			
			HomePage Hp  = new HomePage(driver);
			Hp.CreateOrgaHdLn();
//			
			OrgaizationPage Og = new OrgaizationPage(driver);
			Og.CreateOrgLookUpImg();
			

//			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			
			String Org = excUtil.readDataFromExcel("Organization", 0, 1)+javUtils.getRandomno();
			 String ind = excUtil.readDataFromExcel("Organization", 1, 1);
			 
//			driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(Org);
//			WebElement Idustry = driver.findElement(By.xpath("//select[@name='industry']"));
//			Select s = new Select(Idustry);
//		s.selectByContainsVisibleText(ind);
//			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			 CreateOrganizationPage Cog = new CreateOrganizationPage(driver);
			 Cog.CreateOrg(Org, ind);
			 
			String actuall = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			assertTrue(actuall.contains(Org), "mismatch");
//			 if(actuall.contains(Org)) {
//				 System.out.println("successfull");
//			 }
//			 else
//			 {
//				 System.out.println("fail");
//			}
//			 driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//				driver.findElement(By.linkText("Sign Out")).click();
//				driver.quit();
//			 Hp.SiOuBt();
//			driver.quit();
			
}
//	@Test
//	public void Impact2()
//	{
//		System.out.println("Imapct2");
//	}
}