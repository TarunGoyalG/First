package Pra;

import java.time.Duration;

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
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/tool-tips");
Actions a=new Actions(driver);
WebElement m=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
a.moveToElement(m).perform();

String p = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
System.out.println(p);


}
}
