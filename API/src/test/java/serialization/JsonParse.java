package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonParse {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
    
		
		int[] phNos= {9888,9777,9666};
		Employee emp = new Employee("Subrat", 002, false, phNos);
		ObjectMapper objMap = new ObjectMapper();
		objMap.writeValue( new File("./jsonEmployee.json"), emp);
		
		
	}

}
