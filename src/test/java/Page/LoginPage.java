package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(name="username")
public WebElement user;

@FindBy(name="password")
public WebElement pass;

@FindBy(xpath="//button[text()='Submit ']")
public WebElement signin;

public void username(String name) {

	user.sendKeys(name);
}

public void password(String name) {
	
	pass.sendKeys(name);
}

public void sign() {
	signin.click();
}


}
