package Pramod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Four {
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com");
		driver.findElement(By.id("login-username")).sendKeys("tarungoyal0508@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Tarun1@goyal");
		
		driver.findElement(By.xpath("//label[@for='checkbox-remember']/span")).click();
		driver.findElement(By.id("js-login-btn")).click();
		Thread.sleep(18000);
	String j=	driver.findElement(By.xpath("//p[@class='page-sub-title']/span")).getText();
		System.out.println(j);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='icon-button'])[3]/img")).click();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu-list Miw(140px)']/li[2]")).click();
	
	//run parallel
	
	
	
	
	}
	
}
