import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Scro {
	@Test
	public void m() throws InterruptedException{
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
	WebElement jp=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='ant-select-selector'])[1]")));
jp.click();
		driver.findElement(By.xpath("//div[text()='10 / Page']")).click();
		boolean name=false;
		  while(true) {
			  List<WebElement> i = driver.findElements(By.xpath("//span[contains(@class,'text_hLplk')]"));
	for(WebElement j:i) {
			  if(	j.equals("Tina")){
			name=true;
			((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", j);

			break;
			
		}}
			if(name) {
				System.out.println("true");
				break;
			}
		try {	WebElement u=  driver.findElement(By.xpath("//a[text()='Load More']"));
			u.click();
			Thread.sleep(2000);
		  }catch (Exception e) { 
              System.out.println("Load More button not found or no more data to load.");
              break;
          }

		
}}}
