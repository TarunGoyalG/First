package Pramod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FR {
	@Test
	public void calculateSum() {
		 ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);
            {
	        driver.get("https://demo.applitools.com");
	        driver.findElement(By.id("username")).sendKeys("admin");
	        driver.findElement(By.id("password")).sendKeys("Password@123");
	        driver.findElement(By.id("log-in")).click();

	        double sum = 0;
	        List<WebElement> values = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr/td[5]"));

	        for (WebElement element : values) {
	            String text = element.getText().replace(" USD", "").replace(",", "").replace("+", "").trim();
	            try {
	                double value = Double.parseDouble(text);
	                sum += value; // Add value directly, assumes all values are positive or negative correctly
	            } catch (NumberFormatException e) {
	                System.out.println();
	            }
	        }

	        System.out.println("Total Sum: " + sum);
	    }  {
	        driver.quit(); // Ensure the driver is closed properly
	    }
	}
}
