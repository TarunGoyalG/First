import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pa {
	 public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
      driver.get("https://www.nimblework.com/");
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10-second explicit wait
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kairon-client-container")));
		    WebElement shadowHost = driver.findElement(By.id("kairon-client-container")).findElement(By.tagName("div"));

		SearchContext z = shadowHost.getShadowRoot();
		    Thread.sleep(2000);
		    z.findElement(By.cssSelector("button[class='ka-button']")).click();
		    Thread.sleep(2000);
		    
		    z.findElement(By.cssSelector("input[placeholder='Type a message']")).sendKeys("Tarun");
		    
		    Thread.sleep(2000);
		    
		    z.findElement(By.cssSelector("button[type='submit']")).click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
		    
		    
		    
//		    try {
//		      driver.get("https://www.nimblework.com/");
////wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("kairon-client-container")));
//Thread.sleep(15000);
//		      WebElement hostElement = driver.findElement(By.id("kairon-client-container"));
//
//	SearchContext j = hostElement.findElement(By.tagName("div")).getShadowRoot();
//		Thread.sleep(1000);
//		
//		WebElement m = j.findElement(By.xpath("//img[@class='imageSrcIcon']"));
//		//Thread.sleep(1000);
//	m	.click();
//		WebElement r=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='ka-button']")));
//r.click();
//		      
//		 
//		      
//		      
//		      
//		      
//		      WebElement shadowRootElement = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", hostElement);
//
//		
//		      WebElement element = shadowRootElement.findElement(By.xpath("//button[@class='ka-button']"));
//		     Thread.sleep(2000);
//		     
//		      element.click();
//		      Thread.sleep(2000);
//		    } catch (NoSuchShadowRootException e) {
//		      System.out.println("Unable to find the shadow root: " + e.getMessage());
//		    } 
		  }
}
