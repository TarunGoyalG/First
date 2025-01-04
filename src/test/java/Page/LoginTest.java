package Page;

import org.testng.annotations.Test;

public class LoginTest {
	  @Test(dataProvider = "jsonDataProvider", dataProviderClass = DataProviderClass.class)
	    public void testLogin(TestData testData) {
	        System.out.println("Testing with Username: " + testData.getUsername());
	        System.out.println("Password: " + testData.getPassword());
	        System.out.println("Email: " + testData.getEmail());
	        
	        // Here, you can use testData.getUsername(), testData.getPassword(), etc.
	        // to perform login or other operations in your test
	    }
}
