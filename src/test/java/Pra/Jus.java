package Pra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jus {
@Test
public void m() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/login/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	
}
}
