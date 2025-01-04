package Sle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JAvaScriot {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");
	WebElement m=driver.findElement(By.id("loginbutton"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	//jse.executeScript("arguments[0].value='tarun';",m);
//	jse.executeScript("document.getElementById('emailaddress').value='tar';");
jse.executeScript("arguments[0].click();",m);

	
	Thread.sleep(8000);
	
	
}


}
