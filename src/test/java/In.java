import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class In {
@Test
public void m() throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://go.trackwick.com/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("atul.srivastava@kaptune.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("track@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Employee']")));
	
	driver.findElement(By.xpath("//a[text()='Employee']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@aria-label='Page Size']/div[@class='ant-select-selector']")).click();
	driver.findElement(By.xpath("//div[text()='25 / page']")).click();
	WebElement k = driver.findElement(By.xpath("//div[@class='ant-table-tbody-virtual-scrollbar ant-table-tbody-virtual-scrollbar-vertical']//div[@class='ant-table-tbody-virtual-scrollbar-thumb']"));
	WebElement r=driver.findElement(By.xpath("//div[@class='ant-table-tbody-virtual-scrollbar ant-table-tbody-virtual-scrollbar-horizontal']//div[@class='ant-table-tbody-virtual-scrollbar-thumb']"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	//jse.executeScript("scroll(0,-//div[@class='ant-table-tbody-virtual-scrollbar ant-table-tbody-virtual-scrollbar-horizontal']//div[@class='ant-table-tbody-virtual-scrollbar-thumb']10000)");
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//	String scroll = "//div[@class='ant-table-tbody-virtual-scrollbar ant-table-tbody-virtual-scrollbar-horizontal']//div[@class='ant-table-tbody-virtual-scrollbar-thumb']";
//	jse.executeScript("document.querySelector(scroll).scrollLeft=1000");
//	
	jse.executeScript("window.scrollTo(0, document.body.scrollRight);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollTo(0, document.body.scrollLeft);");
	
}
}
