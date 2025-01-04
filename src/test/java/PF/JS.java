package PF;

import org.testng.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JS {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String ma="{\r\n"
			+ "  \"people\" : [\r\n"
			+ "    {\r\n"
			+ "       \"firstName\": \"Joe\",\r\n"
			+ "       \"lastName\": \"Jackson\",\r\n"
			+ "       \"gender\": \"male\",\r\n"
			+ "       \"age\": 28,\r\n"
			+ "       \"number\": \"7349282382\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "       \"firstName\": \"James\",\r\n"
			+ "       \"lastName\": \"Smith\",\r\n"
			+ "       \"gender\": \"male\",\r\n"
			+ "       \"age\": 32,\r\n"
			+ "       \"number\": \"5678568567\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "       \"firstName\": \"Emily\",\r\n"
			+ "       \"lastName\": \"Jones\",\r\n"
			+ "       \"gender\": \"female\",\r\n"
			+ "       \"age\": 24,\r\n"
			+ "       \"number\": \"456754675\"\r\n"
			+ "    }\r\n"
			+ "  ]\r\n"
			+ "}";
	ObjectMapper m=new ObjectMapper();
JsonNode z = m.readTree(ma);
	
String tu = z.path("people").get(2).path("lastName").asText();
 int tul = z.path("people").get(2).path("age").asInt();
System.out.println(tul);
Assert.assertEquals(tul,24
		);
	System.out.println(tu);
	Assert.assertEquals(tu,"Jones");
}
}
