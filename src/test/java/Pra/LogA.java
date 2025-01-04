package Pra;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogA {
public static 	Logger log;
@Test 
public void m() {
	WebDriver driver=new ChromeDriver();
log=LogManager.getLogger("LogA");

	log.error("error");
	log.debug("debug");
	log.fatal("fatal");
	log.info("info");
	log.warn("warn");
	
}
}
