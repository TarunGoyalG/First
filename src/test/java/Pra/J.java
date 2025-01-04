package Pra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class J {
	@Test
	public void m() throws FileNotFoundException, IOException, ParseException {
		JSONParser j=new JSONParser();
		Object mp = j.parse(new FileReader(".\\Json\\example_2.json"));
		JSONObject mu = (JSONObject)mp;
JSONObject t = (JSONObject)mu.get("quiz");
JSONObject pt = (JSONObject)t.get("maths");
 JSONObject pta = (JSONObject)t.get("q1");
	//JSONObject pt = (JSONObject)t.get("sport");
//	JSONObject pta = (JSONObject)t.get("q1");
//	String mt = (String)pta.get("answer");
	String mt = (String)pta.get("question");
	System.out.println(mt);
	
	
	}
}
