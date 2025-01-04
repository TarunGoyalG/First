package Page;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileReader {
	public static void readJsonFile(String filePath) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(new File(filePath), User.class);
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		JsonFileReader.readJsonFile("D:\\Eclipse workspave\\AryaMadam\\src\\test\\java\\data.json");
	}
	
}
