package Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	Actions a=new Actions(driver);
//WebElement g=	driver.findElement(By.xpath("(//div[@class='header-text'])[3]"));
//	Actions a=new Actions(driver);
//	a.moveToElement(g).click().build().perform();
//	WebElement t=driver.findElement(By.id("item-0"));
//
//
//	a.moveToElement(g).moveToElement(t).click().build().perform();
//	Thread.sleep(2000);
	WebElement g=driver.findElement(By.id("tabButton"));
	a.moveToElement(g).click().build().perform();
WebElement j=	driver.findElement(By.id("windowButton"));
a.moveToElement(j).click().build().perform();
WebElement pt=driver.findElement(By.id("messageWindowButton"));
a.moveToElement(pt)	.click().build().perform();
String p=driver.getWindowHandle();
ArrayList<String>s=new ArrayList<>(	driver.getWindowHandles());
	driver.switchTo().window(s.get(1));
	Thread.sleep(3000);
String m=	driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("Page1"+m);
	
	driver.switchTo().window(s.get(2));
	Thread.sleep(3000);
String ma=	driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("Page12"+ma);
	
	driver.switchTo().window(s.get(3));
	Thread.sleep(3000);
String pm=	driver.findElement(By.tagName("body")).getText();
	System.out.println("Page"+pm);
}
}
