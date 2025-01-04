package Pra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.Test;

public class JS {
	@Test
	public void m() throws FileNotFoundException, IOException, ParseException {
		JSONParser j=new JSONParser();
		Object mp = j.parse(new FileReader(".\\Json\\sample2.json"));
		JSONObject mu = (JSONObject)mp;
		
	 Boolean tam =  (Boolean)mu.get("gender");
	 
	 System.out.println(tam);

	 Number tama =  (Number)mu.get("age");
	 System.out.println(tama);

	  String t = (String)mu.get("firstName");
	 String pt=(String)mu.get("lastName");
   JSONObject ja=(JSONObject)mu.get("address");
   String m = (String)ja.get("city");
   System.out.println(m);
   Assert.assertEquals(m, "San Diego");
	 JSONArray pra = (JSONArray)mu.get("phoneNumbers");
	String ta = (String)((JSONObject) pra.get(0)).get("type");
	 System.out.println(ta);
	 
	 
	 
	 
	}
}




