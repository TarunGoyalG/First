package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JAvas {
	WebDriver driver;
	public JAvas(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="q")
	public WebElement t;
	
@FindBy(xpath="//ul[@role='listbox']/li/div/div[2]/div[contains(@aria-label,'\"+s+\"')]")
public List<WebElement> j;

public void j() {
	t.sendKeys("Selenium");
}

  public void s(String s) throws InterruptedException {
	  
for(WebElement i:j) {
	if(i.getText().equalsIgnoreCase(s)) {
		i.click();
		Thread.sleep(3000);
		break;
	}
}
}
}
