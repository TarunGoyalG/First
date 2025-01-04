package Pra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeHRM {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
String j=driver.getTitle();
System.out.println(j);
Thread.sleep(3000);
JavascriptExecutor jse = (JavascriptExecutor)driver;
WebElement b=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
jse.executeScript("arguments[0].scrollIntoView(true);", b);
Thread.sleep(3000);
Actions a=new Actions(driver);

a.moveToElement(b).build().perform();
b.click();
Set<String> p = driver.getWindowHandles();
for(String i:p) {
	
WebDriver pt=	driver.switchTo().window(i);
System.out.println(pt);
	if(pt.getTitle().equals("Human Resources Management Software | OrangeHRM")) {
		driver.close();
	}
}

}
}
