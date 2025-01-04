
package PF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScWith {

	WebDriver driver;
	PFLoginpage l;
	PFHomepage pa;
	
	@Test
	public void verifylogo() {
		System.out.println("tsI IS Executed for logo verification");
		pa.logom();
		System.out.println("tsI IS Executed successfully nand logo verified");
		
	}
	
	@BeforeClass
	public void openbrowser() throws InterruptedException {
		System.out.println("open browser");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://project1.qualibytes.com/backend/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	l=new PFLoginpage(driver);
	pa=new PFHomepage(driver);
		
		
	}
		@BeforeMethod
		public void loginHms() {
			l.setUsername();;
			l.setpass();
			l.clic();
			
			
			
		}
		@AfterMethod
		public void logout() {
			System.out.println("Logout successfully");
			pa.logom();
			pa.dashboard();
		}
		@AfterClass
		public void closebrowser() {
			System.out.println("Close Browere");
			driver.quit();
		}
	
	
}
