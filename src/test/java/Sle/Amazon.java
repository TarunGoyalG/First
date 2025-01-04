package Sle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
@Test
public void m() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=8004780519578270594&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301033&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Earphone",Keys.ENTER);
	Actions a=new Actions(driver);
	List<WebElement> mp = driver.findElements(By.xpath("//div[@class='sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16']"));
if(mp.size()>=5) {
	a.moveToElement(mp.get(4)).click().build().perform();
	Thread.sleep(3000);
	WebElement p = mp.get(4);
	WebElement ta=p.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	a.moveToElement(mp.get(4)).moveToElement(ta).click().build().perform();
	System.out.println("5th earphone added to cart ");
}else {
	System.out.println("Less than 5 earphones found.");
}
	

}
}
