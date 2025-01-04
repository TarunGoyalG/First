package Pra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Minimise {
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement m=driver.findElement(By.xpath("(//span[@class='_1XjE3T']/span)[3]"));
	Actions a=new Actions(driver);
	a.moveToElement(m).build().perform();
	WebElement t=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/descendant::a[4]"));
	a.moveToElement(t).build().perform();
	WebElement ta=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/descendant::a[14]"));
	a.moveToElement(t).moveToElement(ta).click().build().perform();
	
	
	}
}
