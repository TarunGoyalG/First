package Pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cla {
	
@Test
public void t()  throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		//Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.name("q")).sendKeys("Dresses for women");
		//Thread.sleep(5000);
		driver.findElement(By.tagName("svg")).click();
		driver.findElement(By.className("Pke_EE")).sendKeys("Dresses");
}
}
