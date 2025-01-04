package Sle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flip {
@Test
public void m() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
Actions a=new Actions(driver);

WebElement p=driver.findElement(By.className("_1wE2Px"));
WebElement m=driver.findElement(By.className("_1BJVlg _11MZbx"));
a.moveToElement(p).moveToElement(m).build().perform();




}
}
