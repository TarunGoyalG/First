package Pra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkar {
@Test
public void t() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	String j=driver.getWindowHandle();
WebElement m = driver.findElement(By.xpath("//span[text()='Electronics']"));
WebElement g=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[2]"));
Actions a=new Actions(driver);

a.moveToElement(m).build().perform();
a.moveToElement(g).click().build().perform();
//Set<String> pt = driver.getWindowHandles();
//ArrayList<String> s=new ArrayList<>(pt);
//driver.switchTo().window(s.get(1));
driver.navigate().back();
Thread.sleep(3000);
//driver.findElement(By.xpath("//div[@class='_4WELSP']/img")).click();
//
//driver.switchTo().window(s.get(0));
//Thread.sleep(3000);

WebElement pu=driver.findElement(By.xpath("(//span[@class='_1XjE3T']/span)[3]"));
//a.moveToElement(pu).build().perform();
Thread.sleep(5000);
WebElement ta=driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
//a.moveToElement(pu).moveToElement(ta).build().perform();
WebElement pra=driver.findElement(By.xpath("(//a[@class='_3490ry'])[5]"));
a.moveToElement(pu).moveToElement(ta).moveToElement(pra).click().build().perform();

}}

