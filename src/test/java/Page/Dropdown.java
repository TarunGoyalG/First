package Page;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;

public class Dropdown {
	
    String path = "C:\\Users\\HP\\Desktop\\Book1.xlsx";
	WebDriver driver;
@Test(dataProvider = "Logindata", dataProviderClass = Utilities.DataProviders.class)
public void m(String j,int rowind) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
WebElement d=	driver.findElement(By.xpath("//select[@id='country']"));
	Select s=new Select(d);
List<WebElement> m = driver.findElements(By.xpath("//select[@id='country']/option"));
String res = null;	
try{
for(WebElement i:m) {
		if(i.getText().contains(j)) {
			res="pass";
		}else {
			res="fail";
		}
		}

}
		catch (Exception e) {
            res = "Fail"; // If element is not found or error occurs
        }


	}
ExcelUtility s=new ExcelUtility(path);
//s.setCellData("Sheet1",)

}

