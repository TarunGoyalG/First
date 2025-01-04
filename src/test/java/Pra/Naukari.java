package Pra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukari {
@Test
public void Nau() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("name")).sendKeys("Tarun");
	driver.findElement(By.id("email")).sendKeys("tarungoyal077@gmail.com");
String m=driver.getWindowHandle();
System.out.println(m);
   Set<String> g = driver.getWindowHandles();
for(String mt:g) {
	if(!m.equals(mt)) {
		driver.switchTo().window(mt);
		System.out.println(mt);
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("Software Tester");
		 
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[2]")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[text()='Search']")).click();

	
	
	}
}

	
	
	
	
	
}
}
