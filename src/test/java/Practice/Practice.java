package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
@Test
public void m() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/search?q=java&rlz=1C1CHBD_enIN1123IN1123&oq=java&gs_lcrp=EgZjaHJvbWUyFAgAEEUYORhDGIMBGLEDGIAEGIoFMgYIARBFGEAyDggCEEUYJxg7GIAEGIoFMgwIAxAjGCcYgAQYigUyDwgEEAAYQxixAxiABBiKBTINCAUQABiDARixAxiABDIMCAYQLhhDGIAEGIoFMgYIBxBFGD3SAQgxNDQ3ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
	JavascriptExecutor js=((JavascriptExecutor)driver);
js.executeScript("scroll(0,1000)");



}
}
