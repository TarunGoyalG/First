package PF;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zoom {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testng.org/");
	Thread.sleep(4000);
JavascriptExecutor j=	(JavascriptExecutor)driver;
	j.executeScript("document.body.style.zoom='50';");
	
	
	
}
}
