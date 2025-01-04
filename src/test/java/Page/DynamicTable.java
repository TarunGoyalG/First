package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTable {
@Test
public void M() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	int row=driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr")).size();
	for(int i=1;i<=row;i++) {
	String j=	driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr["+i+"]/td")).getText();
	if(j.equalsIgnoreCase("chrome")) {
		
	String t=	driver.findElement(By.xpath("//td[text()='Chrome']/following-sibling::*[contains(text(),'%')]")).getText();
String m=	driver.findElement(By.tagName("strong")).getText();
System.out.println(t+" "+m);
if(t.equals(m)) {
	System.out.println("Equal");
}else {
	System.out.println("not equla");
}break;



	}
	
	}
	
	
	
	
}
}
