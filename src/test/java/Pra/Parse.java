package Pra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parse {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
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
	        // Initialize ObjectMapper
	        ObjectMapper mapper = new ObjectMapper();

	        // Parse the JSON into a tree structure
	        JsonNode rootNode = mapper.readTree(jsonString);

	        // Navigate to the nested structure problems[0].Diabetes[0].medications[0].medicationsClasses[0].className[0]
	        JsonNode classNameNode = rootNode
	                .path("problems").get(0)
	                .path("Diabetes").get(0)
	                .path("medications").get(0)
	                .path("medicationsClasses").get(0)
	                .path("className").get(0);

	        // Get the associated drug name
	        JsonNode associatedDrug = classNameNode.path("associatedDrug").get(0);
	        String drugName = associatedDrug.path("name").asText();
	        System.out.println("The drug name is: " + drugName);
	    }
}

