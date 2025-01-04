package Pra;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mini {
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String mp=driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement m=driver.findElement(By.xpath("(//span[@class='_1XjE3T']/span)[2]"));
	m.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
WebElement j=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slAVV4 qt3Pmj']")));
	j.click();
	Set<String> pa = driver.getWindowHandles();
	for(String mt:pa) {
		if(!mp.equals(pa)) {
			driver.switchTo().window(mt);
			System.out.println(mt);
			
		
		
		}
	}
	ArrayList<String> s=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(s.get(0));

	

	
	}
}
