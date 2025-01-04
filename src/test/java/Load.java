import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Load {
	
	WebDriver driver;
@Test
public void g() {
	 try {
			 driver=new ChromeDriver();
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
         boolean found = false;
  

         while (true) {
        
             List<WebElement> nameElements = driver.findElements(By.xpath("//div[@class='cell_kUyVw']//span[@class='text_hLplk']")); // Adjust XPath to match your structure
             for (WebElement element : nameElements) {
                 if (element.getText().trim().equalsIgnoreCase("Tina")) {
                     found = true;
                     break;
                 }
             }

             if (found) {
                 System.out.println("true");
                 break;
             }

       
             try {
                 WebElement loadMoreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Load More']"))); // Adjust XPath as needed
                 loadMoreButton.click();
                 Thread.sleep(2000); 
             } catch (Exception e) {
                 System.out.println("Load More button not found or no more data to load.");
                 break;
             }
         }
     } catch (Exception e) {
         e.printStackTrace();
     } finally {

         //driver.quit();
     }
}}

