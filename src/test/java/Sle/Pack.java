package Sle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pack {
@Test
public void t() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
String m=	driver.findElement(By.xpath("//div[text()=\"It's quick and easy.\"]")).getText();
	System.out.println(m);
	
	
}
}
