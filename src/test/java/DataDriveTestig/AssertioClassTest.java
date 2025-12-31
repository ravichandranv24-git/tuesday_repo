package DataDriveTestig;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(GeericLiraries.ListerImplemetatioClass.class)
public class AssertioClassTest {
	@Test
public void Assert() {
	System.out.println("--  1st Statemet---");
	System.out.println("2d Stat");
	Assert.assertEquals("A", "G");
	System.out.println("3rd Stat");
}
	@Test
	public void Assert1() {
		System.out.println("--  1st Statemet---");
		System.out.println("2d Stat");
		Assert.assertNotEquals("A", "V");
		System.out.println("3rd Stat");
	}
//	@Test
//	public void VtigerAssert() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	driver.get("http://localhost:8888");
//	String title = driver.getTitle();
//	//Assert.assertTrue(title.startsWith()
//	
//	}
//	
//	@Test
//	public void Assert2() {
//		SoftAssert sa = new SoftAssert();//creatio of oject 
//		System.out.println("--  1st Statemet---");
//		System.out.println("2d Stat");
//		sa.assertNotEquals("A", "V");
//		System.out.println("3rd Stat");
//		sa.assertAll();//should e last
//	}
//	
//	@Test
//	public void Assert3() {
//		int a = 30;
//		SoftAssert sa = new SoftAssert();//creatio of oject 
//		System.out.println("--  1st Statemet---");
//		System.out.println("2d Stat");
//		sa.assertNull(a);
//		System.out.println("3rd Stat");
//		sa.assertAll();//should e last
//	}
//	
	
	
	
	
	
	
	
	
	
	
	

	


	
	
	
}
