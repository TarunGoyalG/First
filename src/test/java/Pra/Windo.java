package Pra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windo {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	String m=driver.getWindowHandle();
	System.out.println(m);
	Set<String> j = driver.getWindowHandles();
	for(String i:j) {
		if(!i.equals(m)) {
			driver.switchTo().window(i);
			System.out.println(i);
			Thread.sleep(3000);
			driver.findElement(By.linkText("Open a popup window")).click();
			Thread.sleep(3000);
			String ma=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
			System.out.println(ma);
		
		}	if(!i.equals(j)) {
			driver.switchTo().window(m);
			Thread.sleep(3000);
			driver.findElement(By.linkText("Blogger")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.close();
		}
		
	}
driver.switchTo().defaultContent();
driver.findElement(By.name("q")).sendKeys("Tarun");
driver.close();
	
	
}
}
