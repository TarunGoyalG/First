package TClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PF.PFHomepage;
import PF.PFLoginpage;

public class Testckass {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://project1.qualibytes.com/backend/admin/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	PFLoginpage l=new PFLoginpage(driver);
	l.setUsername();
	l.setpass();
	l.clic();
	Thread.sleep(2000);
	//l.am();
	PFHomepage pa=new PFHomepage(driver);
	pa.logom();
	pa.dashboard();
	
}
}
