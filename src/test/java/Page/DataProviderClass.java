package Page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	  @DataProvider(name = "jsonDataProvider")
	    public Iterator<Object[]> jsonDataProvider() {
	        String filePath = "src/main/resources/testdata.json"; // Path to JSON file

	        // Read data from JSON file
	        TestDataList testDataList = JsonUtil.readTestData(filePath);

	        // Prepare list of Object arrays for DataProvider
	        List<Object[]> data = new ArrayList<>();
	        for (TestData testData : testDataList.getTestData()) {
	            data.add(new Object[]{testData});
	        }

	        return data.iterator();
	    }
}
