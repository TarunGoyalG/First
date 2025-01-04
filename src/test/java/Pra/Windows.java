package Pra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
@Test
public void t() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[@id='selenium143']")).click();
	String m=driver.getWindowHandle();
	driver.findElement(By.linkText("Open a popup window")).click();
	Set<String> ma=driver.getWindowHandles();
	for(String j:ma) {
		if(!m.equals(j)) {
		driver.switchTo().window(j);
		System.out.println(j);
	if(driver.getPageSource().contains("New Window")) {
		driver.close();
	}
		}
	}	
	driver.switchTo().window(m);
System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("Tarun");
	
	
	
}
}
