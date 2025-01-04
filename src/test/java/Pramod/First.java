package Pramod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
@Test
public void m() {
	WebDriver driver=new ChromeDriver();
	driver.get(" https://demo.applitools.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("Password@123");
	driver.findElement(By.id("log-in")).click();
	double sum=0;
	
	Double d;
List<WebElement> mp = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr/td[5]"));
	for(WebElement i:mp) {
		String ma=i.getText().replace("USD", "").replace(",","").trim().replaceAll(" ","");
	
	sum+=	 d=Double.parseDouble(ma);

	}
		
	System.out.println(sum);
	
}}
