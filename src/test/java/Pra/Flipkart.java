package Pra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
@Test
public void m() {
	 ChromeOptions options = new ChromeOptions();
     options.addArguments("--start-maximized");
     WebDriver driver = new ChromeDriver(options);
     Actions a=new Actions(driver);
driver.get("https://www.flipkart.com/independence-day-large-sale-store?fm=neo%2Fmerchandising&iid=M_a3a6073e-8729-49b2-acb0-c01c5a02511d_1_KUZ8W60OFFMO_MC.8TVKUWT87M16&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_TVs%2B%2526%2BAppliances_8TVKUWT87M16&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=8TVKUWT87M16");
List<WebElement> m = driver.findElements(By.className("TSD49J"));;
System.out.println(m.size());
for(WebElement i:m) {
	if(i.getText()=="Men") {
		System.out.println(i.getText());
		a.moveToElement(i).build().perform();
		List<WebElement> g = driver.findElements(By.className("CP4tVY"));


		a.moveToElement(g.get(0)).build().perform();
	}

}
 



}
}
