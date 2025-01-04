package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	Thread.sleep(5000);
WebElement j=	driver.findElement(By.id("toolTipButton"));
	Actions a=new Actions(driver);
	a.moveToElement(j).build().perform();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText());
	
	
}
}
