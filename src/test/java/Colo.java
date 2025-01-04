import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Colo {
	@Test
	public void g() {
	ChromeOptions m=new ChromeOptions();
	m.addArguments("--disable-notifications");
	

	WebDriver driver=new ChromeDriver(m);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/?stype=lo&flo=1&deoia=1&jlou=AfcpP9UueH0H8l6fpjubekMoMy3Dk5Q9W80T8bqJmUmiZxcMWSAGu09Bhnc04wPoZ0tlSZxE0ypY9i3Zw-qkzhx5-L7NjKVpA4bW5p1gngvhqQ&smuh=3325&lh=Ac_Q1rG0Zk_Gb-N_INU");
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	String p=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).getCssValue("background-color");
System.out.println(	org.openqa.selenium.support.Color.fromString(p).asHex());
	System.out.println(p);
	if (p.equals("rgb(0, 128, 0)")) { // RGB for green
        System.out.println("The button color is green.");
    } else {
        System.out.println("The button color is NOT green. Actual color: " + p);
    }
	
}
}