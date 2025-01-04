package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TableDataFetch {
	WebDriver driver;
public TableDataFetch (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void m(String name) throws InterruptedException {
	boolean value=false;
	List<WebElement> m = driver.findElements(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//td//a"));
for(WebElement t:m) {
	if(t.getText().equalsIgnoreCase(name)) {
		System.out.println(t.getText());
		value=true;
		break;
	}
}
Assert.assertTrue(value,"Value not found");
String l = driver.findElement(By.xpath("//td//a[text()='"+name+"']/../preceding-sibling::td[1]")).getText();
System.out.println(l);
Thread.sleep(5000);
driver.findElement(By.xpath("//td//a[text()='"+name+"']/../following-sibling::td[4]//a")).click();




}





}
