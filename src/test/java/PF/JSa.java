package PF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSa {
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	 String jsonString = "{ \"people\" : [ { \"firstName\": \"Joe\", \"lastName\": \"Jackson\", \"gender\": \"male\", \"age\": 28, \"number\": \"7349282382\" }, { \"firstName\": \"James\", \"lastName\": \"Smith\", \"gender\": \"male\", \"age\": 32, \"number\": \"5678568567\" }, { \"firstName\": \"Emily\", \"lastName\": \"Jones\", \"gender\": \"female\", \"age\": 24, \"number\": \"456754675\" } ] }";
//     JSONObject jsonObject = new JSONObject(jsonString);
//     JSONArray peopleArray = jsonObject.getJSONArray("people");
//
//     for (int i = 0; i < peopleArray.length(); i++) {
//         JSONObject person = peopleArray.getJSONObject(i);
//         String number = person.getString("number");
//
//         if (isValidPhoneNumber(number)) {
//             System.out.println("Phone number for " + person.getString("firstName") + " is valid.");
//         } else {
//             System.out.println("Phone number for " + person.getString("firstName") + " is invalid.");
//         }
//     }
// }
//
// public static boolean isValidPhoneNumber(String number) {
//     // Check if number has exactly 10 digits and contains only numeric characters
//     return number.matches("\\d{10}");
	
}
}
