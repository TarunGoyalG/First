import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Interview {
@Test
public void m() throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://go.trackwick.com/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("atul.srivastava@kaptune.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("track@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Targets']")));
//	
//	driver.findElement(By.xpath("//a[text()='Targets']")).click();
//	String a = "A";
//	boolean name=false;
//	while(true) {
//	List<WebElement> j = driver.findElements(By.xpath("//span[text()='"+a+"']"));
//		for(WebElement i:j) {
//			if(i.getText().equals(a)) {
//			i.click();
//			name=true;
//			((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", i);
//			 j = driver.findElements(By.xpath("//span[text()='"+a+"']"));
//			break;
//		}
//		
//		
//	}
//		if(name) {
//			break;
//		}
//	
//		  List<WebElement> loadMoreButtons = driver.findElements(By.xpath("//button[contains(text(), 'Load More')]"));
//          if (!loadMoreButtons.isEmpty() && loadMoreButtons.get(0).isDisplayed()) {
//              loadMoreButtons.get(0).click();
//              Thread.sleep(2000); // Wait for the new items to load
//          } else {
//              System.out.println("No more pages to load. 'Ambika' not found.");
//              break; // Exit the loop if no "Load More" button is present
//          }
//	}
//	



	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Employee']")));
	
	driver.findElement(By.xpath("//a[text()='Employee']")).click();
//	List<WebElement> l = driver.findElements(By.xpath("//ul[@class='ant-pagination ant-pagination-mini']/li/a"));
//	
//	
//	for(int i=1;i<=l.size();i++) {
//		driver.findElement(By.xpath("//a[text()='"+i+"']")).click();
//	System.out.println(	driver.findElement(By.xpath("//span[text()='24-Dec-2024']")).isDisplayed());
//	
//	if(i<=l.size()) {
//		
//	}
//	
//	}


	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and @id='Path_58' ]")));
	driver.findElement(By.xpath("//*[name()='path' and @id='Path_58' ]")).click();
	boolean rt=driver.findElement(By.xpath("//label[@title='Name']")).getText().contains("*")?true:false;
	System.out.println(rt);
	driver.findElement(By.id("emp-name")).sendKeys("Tarun");
	driver.findElement(By.id("emp-number")).sendKeys("784578956");
	driver.findElement(By.id("emp-email")).sendKeys("tarungo.@gmail.com");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
WebElement m = driver.findElement(By.xpath("//span[@title='Employee']"));
	m.click();
	driver.findElement(By.xpath("//span[text()='Manpower']")).click();
	driver.findElement(By.xpath("//span[@class='ant-switch-inner']")).click();
	


	
	driver.findElement(By.xpath("//input[contains(@id,'rc_select_12')]")).click();

	driver.findElement(By.xpath("//span[contains(text(),'Vikash Sharma (VS) ')]")).click();
	Thread.sleep(1000);
	WebElement t = driver.findElement(By.xpath("//span[text()='Select Functional Manager']"));
	jse.executeScript("arguments[0].click()", t);
		WebElement mt = driver.findElement(By.xpath("//span[text()='Himanshu Vashistha']"));
//	jse.executeScript("arguments[0].click()", mt);
//	driver.findElement(By.id("rc_select_8")).click();
//	driver.findElement(By.xpath("//span[text()='All License']")).click();
//	driver.findElement(By.xpath("//span[@class='ant-switch-inner']")).click();
//	WebElement mtt=driver.findElement(By.xpath("(//div[@class='ant-select-selection-overflow'])[1]"));
//	
//    Select select = new Select(mtt);
//    select.selectByVisibleText("Kartik");
//    


}}
//	driver.findElement(By.id("rc_select_8")).click();
//	driver.findElement(By.xpath("//span[text()='Holiday 1']")).click();
//	driver.findElement(By.name("formData.emp-dob")).click();
	

//	String year = "2020";
//	String month = "May";
//	String day = "20";
//	
//	
//	
//	while(true)
//	{
//		String currentmonth =driver.findElement(By.xpath("//button[@class='ant-picker-month-btn']")).getText();
//		String currentyear = driver.findElement(By.xpath("//button[@class='ant-picker-year-btn']")).getText();
//		
//		if (currentmonth.equals(month)&& currentyear.equals(year))
//		{
//			break;
//		}
//		
//		  //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//		  driver.findElement(By.xpath("//button[@class='ant-picker-header-prev-btn']")).click();
//		}
//	
//	//select the date
//	
//	List<WebElement> alldate =   driver.findElements(By.xpath("//table[@class='ant-picker-content']/tbody/tr/td/div"));
//	for(WebElement dt:alldate)
//		if(dt.getText().equals(day))
//		{
//			dt.click();
//			break;
//			}
//	driver.findElement(By.xpath("//span[text()='Choose Multiple Files']")).click();
//	Robot robot=new Robot();
//	robot
//	.delay(2000);
//	 StringSelection stringSelection = new StringSelection("C:\\Users\\HP\\Desktop\\CBIPassbook.jpeg");
//	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//	   robot.keyPress(KeyEvent.VK_CONTROL);
//	   robot.keyPress(KeyEvent.VK_V);
//	   robot.keyRelease(KeyEvent.VK_V);
//	   robot.keyRelease(KeyEvent.VK_CONTROL);
//	   robot.keyPress(KeyEvent.VK_ENTER);
//	   robot.keyRelease(KeyEvent.VK_ENTER);
//	driver.findElement(By.xpath("//span[text()='Save Image']")).click();
//	
//	driver.findElement(By.xpath("//*[@viewBox='0 0 38 38']//*//*[name()='path']")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@viewBox='0 0 24 24']//*//*[name()='path']")).click();
//	
//	//driver.findElement(By.xpath("//*[@d='M482 152h60q8 0 8 8v704q0 8-8 8h-60q-8 0-8-8V160q0-8 8-8z']")).click();
//	
//	Thread.sleep(2000);
//	driver.findElement(By.name("formData.65f3dd93b95bab2823596b19")).sendKeys("7");
//	
//	
	

	
	
	

