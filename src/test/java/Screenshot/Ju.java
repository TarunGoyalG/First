package Screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ju {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
List<WebElement> m = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[3]"));
double d=0;
for( int i=0;i<m.size();i++) {
	if((i+1)%2==0) {
	String t=	m.get(i).getText().replace("$","");
	d+=Double.parseDouble(t);
	}
}
	
	System.out.println(d);
	WebElement ma=driver.findElement(By.id("colors"));
	Select c=new Select(ma);
	c.selectByValue("blue");
	c.selectByValue("red");
	
	driver.findElement(By.id("input1")).sendKeys("Tarun");
	
//	WebElement t=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
//t.getSize();
WebElement me=	driver.findElement(By.xpath("//button[text()='Copy Text']"));
Actions a=new Actions(driver);
a.doubleClick(me).build().perform();
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(100,400)");
WebElement tr=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
a.dragAndDropBy(tr, 40, 0).build().perform();
WebElement g=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
a.dragAndDropBy(g,80, 90).perform();




}
}
