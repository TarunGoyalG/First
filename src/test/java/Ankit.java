import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ankit {
	public static void main(String s[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 // configure options parameter to Chrome driver

		//Creating an object of ChromeDriver
//		WebDriver driver = new ChromeDriver();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://go.trackwick.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("atul.srivastava@kaptune.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("track@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Targets']")));
		
	driver.findElement(By.xpath("//a[text()='Targets']")).click();
//		String a = "A";
//		boolean name=false;
//		while(true) {
//		List<WebElement> j = driver.findElements(By.xpath("//span[text()='"+a+"']"));
//			for(WebElement i:j) {
//				if(i.getText().equals(a)) {
//				i.click();
//				name=true;
//				((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", i);
//				 j = driver.findElements(By.xpath("//span[text()='"+a+"']"));
//				break;
//			}
//			
//			
//		}
//			if(name) {
//				break;
//			}
	//	
//			  List<WebElement> loadMoreButtons = driver.findElements(By.xpath("//button[contains(text(), 'Load More')]"));
//	          if (!loadMoreButtons.isEmpty() && loadMoreButtons.get(0).isDisplayed()) {
//	              loadMoreButtons.get(0).click();
//	              Thread.sleep(2000); // Wait for the new items to load
//	          } else {
//	              System.out.println("No more pages to load. 'Ambika' not found.");
//	              break; // Exit the loop if no "Load More" button is present
//	          }
//		}
	//	



		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Employee']")));
		
		driver.findElement(By.xpath("//a[text()='Employee']")).click();
//		List<WebElement> l = driver.findElements(By.xpath("//ul[@class='ant-pagination ant-pagination-mini']/li/a"));
	//	
	//	
//		for(int i=1;i<=l.size();i++) {
//			driver.findElement(By.xpath("//a[text()='"+i+"']")).click();
//		System.out.println(	driver.findElement(By.xpath("//span[text()='24-Dec-2024']")).isDisplayed());
	//	
//		if(i<=l.size()) {
//			
//		}
	//	
//		}


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
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[3]//input")).click();
		
		//driver.findElement(By.xpath("//input[contains(@id,'rc_select_12')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Vikash Sharma (VS) ')]")).click();
		Thread.sleep(1000);
		WebElement t = driver.findElement(By.xpath("//span[text()='Select Functional Manager']/../div"));
		t.click();
			WebElement mt = driver.findElement(By.xpath("//span[text()='Himanshu Vashistha']"));
			mt.click();
			WebElement mt1 = driver.findElement(By.xpath("//span[text()='Billing Manager']"));
			mt1.click();
			WebElement mt2 = driver.findElement(By.xpath("//span[text()='Suraj Employee']"));
			mt2.click();
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[5]/input")).click();
			driver.findElement(By.xpath("//span[text()='Contract Company']")).click();
			//driver.findElement(By.xpath("//span[text()='Payroll Company']")).click();
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[4]/input")).click();
			driver.findElement(By.xpath("//span[text()='Billing License']")).click();
			driver.findElement(By.xpath("//span[@class='ant-switch-inner']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Select Date of Birth']")).click();
		
		List<WebElement> z = driver.findElements(By.xpath("//table[@class='ant-picker-content']/tbody/tr/td/div"));
			for(WebElement i:z) {
			if	(i.getText().equals("5")) {
				i.click();
			}
			}
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[6]/input")).click();
			driver.findElement(By.xpath("//span[text()='India']")).click();
			driver.findElement(By.xpath("(//span[@class='ant-legacy-form-item-children'])[15]/input")).sendKeys("78");
			driver.findElement(By.xpath("(//span[@class='ant-legacy-form-item-children'])[16]/input")).sendKeys("85");
			driver.findElement(By.xpath("(//span[@class='ant-legacy-form-item-children'])[17]/input")).sendKeys("65");
			
			driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[2]/input")).click();
			driver.findElement(By.xpath("(//table[@class='ant-picker-content']/tbody/tr/td[@class='ant-picker-cell ant-picker-cell-in-view']/div[text()='2'])[2]")).click();
			driver.findElement(By.xpath("//span[text()='Please select multiple selection']/../div")).click();
			driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='wed']")).click();
			driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[3]/input")).click();
			driver.findElement(By.xpath("(//table[@class='ant-picker-content']/tbody/tr/td/div)[100]")).click();
			
			driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[9]/span/input")).click();
			
			driver.findElement(By.xpath("//div[@class='show-option_kVysT']/span[text()='23']")).click();
			
			
			
			
	
	
	}
	}

