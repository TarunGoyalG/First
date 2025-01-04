package Test;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.LoginPage;

public class Tests {
	WebDriver driver;
@Test
public void m() throws InterruptedException {
 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://project2.qualibytes.com/admin/");
	
	
	LoginPage p=new LoginPage(driver);
	p.username("admin");
	p.password("Password@123");
	p.sign();
	
	Thread.sleep(4000);
	
//	Dashboard la=new Dashboard(driver);
//	la.m("Vinay Singh");
//	Thread.sleep(4000);
	
	
	;
}
}
