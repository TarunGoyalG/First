package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrame {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/nestedframes");
	driver.switchTo().frame("frame1");
	System.out.println(driver.findElement(By.tagName("body")).getText());
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
driver.switchTo().defaultContent();
Thread.sleep(1000);
System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());


}
}
