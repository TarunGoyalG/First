package Sle;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Am {
@Test
public void r() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/login/");
int h=driver.manage().window().getSize().getHeight();
int w=driver.manage().window().getSize().getWidth();
	System.out.println(h+" "+"wIDTH "+w);
	Thread.sleep(5000);
	
	Dimension d=new Dimension(700,1800);
	driver.manage().window().setSize(d);
	
	 Point p = driver.manage().window().getPosition();
	System.out.println(p.getX()+" "+ p.getY());
	
Point m = driver.findElement(By.id("email")).getLocation();
	System.out.println("x: "+m.getX()+" "+m.getY());
	
Point i=new Point(70,60);
driver.manage().window().setPosition(i);

}
}
