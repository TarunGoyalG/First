package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Screenshot.BaseTest;

public class testUtils extends BaseTest {

	public void getscreenshot() throws IOException {
	
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(".//Screenshot//img.png"));
	
	}
	
	
}
