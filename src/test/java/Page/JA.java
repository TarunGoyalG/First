package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JA {
	WebDriver driver;

	
@Test
public void list() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		
driver.get("http://www.google.com");
JAvas tr=new JAvas(driver);
tr.j();
tr.s("Selenium 30");



}
}
