package Pra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Or {
@Test
public void m() throws FileNotFoundException, IOException, ParseException {
	JSONParser p=new JSONParser();
Object m = p.parse(new FileReader(".\\Json\\Org.json"));
JSONObject t = (JSONObject)m;
JSONObject r=new JSONObject(t);

String jsonString = """
{
"problems": [{
    "Diabetes": [{
        "medications": [{
            "medicationsClasses": [{
                "className": [{
                    "associatedDrug": [{
                        "name": "asprin",
                        "dose": "",
                        "strength": "500 mg"
                    }],
                    "associatedDrug#2": [{
                        "name": "somethingElse",
                        "dose": "",
                        "strength": "500 mg"
                    }]
                }]
            }]
        }]
    }]
}]
}
""";
//System.out.println(t);
//JSONArray r = (JSONArray)t.get("problems");
//JSONObject te = (JSONObject)r.get(0);
//JSONArray e = (JSONArray)te.get("Diabetes");
//JSONObject w = (JSONObject)e.get(0);
//JSONArray el = (JSONArray)w.get("medications");
//JSONObject wl = (JSONObject)el.get(0);
//JSONArray ele = (JSONArray)wl.get("medicationsClasses");
//JSONObject wle = (JSONObject)ele.get(0);
//JSONArray elet = (JSONArray)wle.get("className");
//JSONObject wlet = (JSONObject)elet.get(0);
//JSONArray elew = (JSONArray)wlet.get("associatedDrug");
//System.out.println(elew);
//JSONObject tr = (JSONObject)elew.get(0);
//String wq = (String)tr.get("name");
//System.out.println(wq);
//Assert.assertEquals(wq,"asprin","not equal");

ObjectMapper mt=new ObjectMapper();
JsonNode pr = mt.readTree(jsonString);
String ju=pr.path("problems").get(0).path("Diabetes").get(0)
.path("medications").get(0).path("medicationsClasses").get(0)
.path("className").get(0).path("associatedDrug").get(0).path("name").asText();
System.out.println(pr);
System.out.println(ju);
Assert.assertEquals(ju, "asprin");

}}
