package Pra;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wind {
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		String m=driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		ArrayList<String>mp=new ArrayList<String>(	driver.getWindowHandles());
		
				driver.switchTo().window(mp.get(0));
				System.out.println(driver.getTitle());
				
				Thread.sleep(3000);
				driver.switchTo().window(mp.get(1));
				System.out.println(driver.getTitle());
				String ma=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
				System.out.println(ma);
		
		
				driver.switchTo().window(mp.get(2));
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			
		
				driver.switchTo().window(mp.get(0));
	driver.findElement(By.name("q")).sendKeys("Tarun");
	
		
		
	}
}
