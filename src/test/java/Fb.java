import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fb {
@Test
public void m() throws InterruptedException {
	ChromeOptions m=new ChromeOptions();
	m.addArguments("--disable-notifications");
	

	WebDriver driver=new ChromeDriver(m);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/?stype=lo&flo=1&deoia=1&jlou=AfcpP9UueH0H8l6fpjubekMoMy3Dk5Q9W80T8bqJmUmiZxcMWSAGu09Bhnc04wPoZ0tlSZxE0ypY9i3Zw-qkzhx5-L7NjKVpA4bW5p1gngvhqQ&smuh=3325&lh=Ac_Q1rG0Zk_Gb-N_INU");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7417860653");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tarun1@goyal");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@d='M20.181 35.87C29.094 34.791 36 27.202 36 18c0-9.941-8.059-18-18-18S0 8.059 0 18c0 8.442 5.811 15.526 13.652 17.471L14 34h5.5l.681 1.87Z']")));
	
System.out.println(	driver.findElement(By.xpath("//*[@d='M20.181 35.87C29.094 34.791 36 27.202 36 18c0-9.941-8.059-18-18-18S0 8.059 0 18c0 8.442 5.811 15.526 13.652 17.471L14 34h5.5l.681 1.87Z']")).isDisplayed());
	
	driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Tarun Goyal");
	driver.findElement(By.xpath("//div[@class='x9f619 x1ja2u2z x78zum5 x1n2onr6 x1r8uery x1iyjqo2 xs83m0k xeuugli x1qughib x6s0dn4 xozqiw3 x1q0g3np xykv574 xbmpl8g x4cne27 xifccgj']")).click();
	
	WebElement r = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='x1b0d499 xaj1gnb']")));
	System.out.println(r.isDisplayed());	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
	while(true) {
		try{	
			WebElement t = driver.findElement(By.xpath("(//span[contains(text(),'See') and contains(text(),'More')])[1]"));

	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true);", t);
//	t.click();
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", t);
	
//    Thread.sleep(10000);
	js.executeScript("window.scrollBy(0,350)", "");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'See') and contains(text(),'More')])[1]")));
	
		}
		catch(Exception e) {
			System.out.println("Not more");
		break;
	
		}
	}
	
	
	
	
	
	
	
	
}
}
