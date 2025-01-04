package Page;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	  public static TestDataList readTestData(String filePath) {
	        ObjectMapper mapper = new ObjectMapper();
	        TestDataList testDataList = null;

	        try {
	            // Read JSON file and map it to TestDataList class
	            testDataList = mapper.readValue(new File(filePath), TestDataList.class);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return testDataList;
	    }
}
