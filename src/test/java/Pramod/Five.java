package Pramod;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Five {
@Test
public void tu() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
	Actions a=new Actions(driver);
WebElement p=	driver.findElement(By.xpath("(//div[@class='screenshot-thumb ng-isolate-scope'])[2]/img"));
	a.moveToElement(p).click().build().perform();
	Thread.sleep(40000);
	ArrayList<String>ta=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(ta.get(1));
	Thread.sleep(5000);
	driver.switchTo().frame("heatmap-iframe");
	driver.findElement(By.xpath("//div[@id='option-section']/div[2]")).click();
	String tw=driver.findElement(By.xpath("//span[@class='C(#fff) Tt(u)']")).getText();
System.out.println(tw);
	//	Dimension mt = driver.findElement(By.xpath("//div[@class='slider-bar']")).getSize();
//	int y=mt.getHeight();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[@id='option-section']/div[3]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[@id='option-section']/div[2]")).click();
	Thread.sleep(6000);
	WebElement ji=driver.findElement(By.xpath("//div[@class=\"slider-handle js-slider-handle\"]"));
	a.dragAndDropBy(ji, -50, 0).perform();
	driver.findElement(By.xpath("//div[@id='option-section']/div[3]")).click();
	Thread.sleep(6000);

	//slider  and tool tip get text
	
	driver.switchTo().defaultContent();
	WebElement js=driver.findElement(By.xpath("//p[@class='vwo-countdown-timer__title vwo-countdown-timer__timer_runs_out-js']"));
	a.moveToElement(js).perform();
	System.out.println(js.getAttribute("elem_clicks"));
WebElement at=driver.findElement(By.xpath("//p[@elem_clicks='3']"));
	a.moveToElement(at).build().perform();
	Thread.sleep(3000);
System.out.println(	driver.findElement(By.xpath("//div[@id='vwo_tooltip']")).getText());
	WebElement t=driver.findElement(By.xpath("(//div[@elem_clicks='3'])[2]"));
a.moveToElement(t).build().perform();
Thread.sleep(3000);
System.out.println(	driver.findElement(By.xpath("//div[@id='vwo_tooltip']")).getText());
	
}
}
