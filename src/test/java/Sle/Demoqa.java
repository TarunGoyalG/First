package Sle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoqa {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]")).click();
	Thread.sleep(2000);;
	driver.findElement(By.xpath("(//ul[@class='menu-list'])[3]/li[3]")).click();
	System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());
	
}
}
