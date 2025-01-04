import java.util.List;

import org.json.JSONObject;

import com.jayway.jsonpath.JsonPath;

public class Inter {
public static void main(String[] args) {
	String m="{\r\n"
			+ "    \"testData\": [\r\n"
			+ "        {\r\n"
			+ "            \"username\": \"user1\",\r\n"
			+ "            \"password\": \"password1\",\r\n"
			+ "            \"email\": \"user1@example.com\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"username\": \"user2\",\r\n"
			+ "            \"password\": \"password2\",\r\n"
			+ "            \"email\": \"user2@example.com\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"username\": \"user3\",\r\n"
			+ "            \"password\": \"password3\",\r\n"
			+ "            \"email\": \"user3@example.com\"\r\n"
			+ "        }\r\n"
			+ "    ]\r\n"
			+ "}\r\n"
			+ "";
	JSONObject ma=new JSONObject(m);
	List<String>  r=   JsonPath.read(ma.toString(),"$.testData[0]");
	System.out.println(r);
	
	
	
	
	
	
	
	
	
}
}
