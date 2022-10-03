package SerializationandDeserializaton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import PojoSerializationandDeserialization.EmployeeDetails;

public class Serialization {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		int[] phnos= {4444,6666};
		EmployeeDetails emp = new EmployeeDetails("subrat", "M10", "@gamil", phnos);
		ObjectMapper objmap = new ObjectMapper();
		objmap.writeValue(new File("./jsonEmplyee.json"), emp);
		
	}

}
