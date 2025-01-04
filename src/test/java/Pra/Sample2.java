package Pra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void m() throws FileNotFoundException, IOException, ParseException {
		JSONParser j=new JSONParser();
		Object mp = j.parse(new FileReader(".\\Json\\example_2.json"));
		JSONObject mu = (JSONObject)mp;
		JSONObject t = (JSONObject)mu.get("quiz");
   JSONObject l = (JSONObject)t.get("sport");
   JSONObject tu = (JSONObject)l.get("q1");
 String e = (String)	tu.get("question");
	JSONArray rt = (JSONArray)tu.get("options");
	 for(int i=0;i<rt.size();i++) {
		System.out.println( rt.get(i));
	 }
	JSONObject jt = (JSONObject) t.get("maths");
	JSONObject te = (JSONObject)jt.get("q1");
	System.out.println(te);
	String qt = (String)te.get("answer");
//	System.out.println(qt);
	JSONArray w = (JSONArray)te.get("options");
System.out.println(w.get(2));



	}
}
