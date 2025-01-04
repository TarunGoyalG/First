import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tar {
@Test
public void z() throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://go.trackwick.com/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("atul.srivastava@kaptune.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("track@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Targets']")));
	
driver.findElement(By.xpath("//a[text()='Targets']")).click();
driver.findElement(By.xpath("//div[@class='ant-select ant-select-sm ant-select-outlined ant-select-single ant-select-show-arrow']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='10 / Page']")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)", "");
while(true) {
	

WebElement t = driver.findElement(By.xpath("//a[text()='Load More']"));
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].scrollIntoView(true);", t);
//t.click();

JavascriptExecutor js1 = (JavascriptExecutor)driver;
js1.executeScript("arguments[0].click();", t);
js.executeScript("window.scrollBy(0,350)", "");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Load More']")));
System.out.println(	driver.findElement(By.xpath("//span[text()='Tina']")).isDisplayed());
driver.findElement(By.tagName("div")).getShadowRoot();
}







}
}
