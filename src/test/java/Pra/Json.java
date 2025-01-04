package Pra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Json {
	public static WebDriver driver;
@Test
public void m() throws FileNotFoundException, IOException, ParseException {
	JSONParser j=new JSONParser();
	Object mp = j.parse(new FileReader(".\\Json\\sample2.json"));
	JSONObject mu = (JSONObject)mp;
  String t = (String)mu.get("firstName");
 String pt=(String)mu.get("lastName");
 Number ptq=(Number)mu.get("age");
 JSONArray pra = (JSONArray)mu.get("phoneNumbers");
for(int i=0;i<pra.size();i++) {
	JSONObject jt = (JSONObject)pra.get(i);
	String tm = (String)jt.get("type");
	String ty = (String)jt.get("number");
	System.out.println(tm+ " "+ty);
	
}
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].getAttribute('value','aman')", null)
System.out.println(t +" "+pt+" "+ptq);
}
}
