package Pramod;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tool {
	@Test
	public void tu() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.thetestingacademy.com/courses/job-ready-automation-tester-blueprint-with-java-by-pramod-dutta");
		Actions a=new Actions(driver);
	
		WebElement js=driver.findElement(By.xpath("//p[@class='vwo-countdown-timer__title vwo-countdown-timer__timer_runs_out-js']"));
		a.moveToElement(js).perform();
		System.out.println(js.getAttribute("elem_clicks"));
	WebElement at=driver.findElement(By.xpath("//p[@elem_clicks='3']"));
		a.moveToElement(at).build().perform();
		Thread.sleep(2000);
	System.out.println(	driver.findElement(By.xpath("//div[@id='vwo_tooltip']")).getText());
		WebElement t=driver.findElement(By.xpath("(//div[@elem_clicks='3'])[2]"));
	a.moveToElement(t).build().perform();
	Thread.sleep(1000);
	System.out.println(	driver.findElement(By.xpath("//div[@id='vwo_tooltip']")).getText());
		
	}
}
