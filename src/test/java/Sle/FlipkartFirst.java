package Sle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartFirst {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions a=new Actions(driver);
	WebElement m=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]/span"));
	a.moveToElement(m).build().perform();
	WebElement mt=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/descendant::a[5]"));
	WebElement mta=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/descendant::a[16]"));
//	a.moveToElement(mt).build().perform();
   try {
	a.moveToElement(mt).moveToElement(mta).click().build().perform();}
   catch(StaleElementReferenceException e) {
	 mt=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/descendant::a[5]"));
		mta=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/descendant::a[16]"));
	   a.moveToElement(mt).moveToElement(mta).click().build().perform();
   }
	Thread.sleep(3000);
Integer at=Integer.MIN_VALUE;
List<WebElement> mu = driver.findElements(By.xpath("//div[@class='hl05eU']/div[1]"));
	for(WebElement i:mu) {
	String mp=	i.getText().replace("₹", "").replace(",","");
	Integer d=Integer.parseInt(mp);
		if(d>at) {
			at=d;
		}
	
	}
	System.out.println(at);
	Thread.sleep(3000);

	driver.findElement(By.xpath("//div[contains(text(),'"+at+"')]")).click();
}
}
