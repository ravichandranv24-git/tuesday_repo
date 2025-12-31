package orgaizatio;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GeericLiraries.BaseClass;
import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrgaizationPage;

public class OrgazatiwithDel extends BaseClass {
	@Test
	public  void CreateLogiwithMadatoryFiledstestTest()  throws IOException, InterruptedException {
		HomePage Hp  = new HomePage(driver);
		Hp.CreateOrgaHdLn();
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		OrgaizationPage Og = new OrgaizationPage(driver);
		Og.CreateOrgLookUpImg();
		//driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		String Org = excUtil.readDataFromExcel("Organization", 0, 1)+javUtils.getRandomno();
		//driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(Org);
		CreateOrganizationPage Cog = new CreateOrganizationPage(driver);
		Cog.CreateOrg(Org);
		
		
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(Org);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String actuall = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(actuall);
		 if(actuall.contains(Org)) {
			 System.out.println("successfull");
		 }
		 else
		 {
			 System.out.println("fail");
		}
		 
		 Hp.CreateOrgaHdLn();
		 List<WebElement> alllink = driver.findElements(By.xpath("//a[@title='Organizations']"));//traversing through opportunity name
//			
			for(WebElement link: alllink) {
				if(link.equals(Org)) {
					break;
			} 
				driver.findElement(By.xpath("//a[text()='del']")).click();
	//System.out.println(driver.findElement(By.xpath("//a[text()= ' "+Org+ "']")).getText());
		//driver.findElement(By.xpath("//a[text()= ' "+Org+ "']/ancestor::tr[@class='lvtColData']/descendant::a[text()= 'del']")).click();
		 
		Alert a =driver.switchTo().alert();
		a.accept();
		
	}
}
}