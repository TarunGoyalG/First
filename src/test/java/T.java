import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class T {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
WebElement p = driver.findElement(By.xpath("//select"));
Select t=new Select(p);
List<WebElement> z = t.getOptions();
	
ArrayList m=new ArrayList();
ArrayList pa=new ArrayList();
for(WebElement i:z) {
	m.add(i.getText());
pa.add(i.getText());

}
Collections.sort(m);
System.out.println(m);
System.out.println(pa);
if(m.equals(pa)) {
	System.out.println("Equal");
	
}else {
	System.out.println("Not equal");
}
}


}
