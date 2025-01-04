package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
public static WebDriver driver;

@BeforeSuite
public void launchBrowser() {
	driver=new ChromeDriver();
}

@AfterSuite
public void closeBrowser() {
	driver.close();
}



}
