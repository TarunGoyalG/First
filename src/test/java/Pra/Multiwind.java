package Pra;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiwind {
	public static WebDriver driver=null;
	public static Set<String>j;
	@Test
	public void m() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		String m=driver.getWindowHandle();

		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		Set<String> j = driver.getWindowHandles();
		
		tp("New Window");
		
		String map=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(map);
		
		
	tp("Blogger.com - Create a unique and beautiful blog easily.");
			
			
				
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
				Thread.sleep(3000);
			
			
			
		
		driver.switchTo().window(m);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Tarun");}
		
		public static void tp(String title) {
			Iterator<String> ta = j.iterator();
			while(ta.hasNext()) {
				String tr=ta.next();
				driver.switchTo().window(tr);
				if(driver.getTitle().equals(title)) {
					break;
				}
			}}
	
}
