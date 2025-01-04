package Pramod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Third {
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/modal-dialogs");
		Thread.sleep(6000);
	driver.findElement(By.xpath("//div[.='Click on button to see modal']/following-sibling::button")).click();
String m=	driver.findElement(By.id("example-modal-sizes-title-sm")).getText();
	System.out.println(m);
		String j=driver.findElement(By.className("modal-body")).getText();
System.out.println(j);
	driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
	driver.findElement(By.xpath("//div[.='Click on button to see modal']/following-sibling::button[2]")).click();
	
String t=	driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-lg']")).getText();
	System.out.println(t);
if(	driver.findElement(By.xpath("//div[@class='modal-body']/p")).getText().contains("It has survived not only five centuries,")) {
	Assert.assertTrue(true);
}
driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();
	
	}
}
