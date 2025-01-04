package Pra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ja {
@Test
public void t() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.id("selenium143")).click();
	driver.findElement(By.linkText("Open a popup window")).click();
Set<String> m = driver.getWindowHandles();
	for(String j:m) {
		driver.switchTo().window(j);
	String p=	driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
	System.out.println(p);
	
	}
}
}
