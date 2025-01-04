package Pra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiwindow {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	String m=driver.getWindowHandle();

	driver.findElement(By.linkText("Open a popup window")).click();
	driver.findElement(By.linkText("Blogger")).click();
	Set<String> j = driver.getWindowHandles();
	
	Iterator<String>ma=j.iterator();
	while(ma.hasNext()) {
	String ap=	ma.next();
	driver.switchTo().window(ap);
	System.out.println(ap);
	if(driver.getTitle().equals("New Window")) {
		System.out.println(ap);
	String map=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
	System.out.println(map);
	
	}}
	Iterator<String> ma2 = j.iterator();
	while (ma2.hasNext()) {
		driver.switchTo().window(ma2.next());
		System.out.println(ma2);
		if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {
		
			
			driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			Thread.sleep(3000);
		
		}
		
	}
	driver.switchTo().window(m);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("Tarun");
}
}

