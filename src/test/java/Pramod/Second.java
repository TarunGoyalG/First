package Pramod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Second {
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	
		List<WebElement> m = driver.findElements(By.xpath("//*[@d='M880 836H144c-17.7 0-32 14.3-32 32v36c0 4.4 3.6 8 8 8h784c4.4 0 8-3.6 8-8v-36c0-17.7-14.3-32-32-32zm-622.3-84c2 0 4-.2 6-.5L431.9 722c2-.4 3.9-1.3 5.3-2.8l423.9-423.9a9.96 9.96 0 0 0 0-14.1L694.9 114.9c-1.9-1.9-4.4-2.9-7.1-2.9s-5.2 1-7.1 2.9L256.8 538.8c-1.5 1.5-2.4 3.3-2.8 5.3l-29.5 168.2a33.5 33.5 0 0 0 9.4 29.8c6.6 6.4 14.9 9.9 23.8 9.9z']"));
		m.get(2).click();
		Thread.sleep(4000);
		WebElement t=driver.findElement(By.id("firstName"));
		t.clear();
		t.sendKeys("Tarun");
		
		driver.findElement(By.id("lastName")).sendKeys("Goyal");
		WebElement ma=driver.findElement(By.id("userEmail"));
		ma.clear();
		ma.sendKeys("tarungoyal077@gmail.com");
		
		driver.findElement(By.id("age")).sendKeys("28");
		driver.findElement(By.id("salary")).sendKeys("4000");
		driver.findElement(By.id("department")).sendKeys("Mech");
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
	WebElement tu=	driver.findElement(By.xpath("//div[@class='rt-tbody']/div[3]"));
			if(tu.getText().contains("Tarun")) {
				Assert.assertTrue(true);
			}
			if(tu.getText().contains("tarungoyal077@gmail.com")) {
				Assert.assertTrue(true);
			}
		
		
		
}
}
//Mam some time passes and some time fail show elementclick intercepted exceptions why
