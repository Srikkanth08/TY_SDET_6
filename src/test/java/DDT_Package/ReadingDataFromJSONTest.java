package DDT_Package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingDataFromJSONTest 
{
	@Test
	public void readingDataFromJSONTest() throws Throwable
	{
		//Step-1: Convert Physical File into Java Object
		FileReader FR = new FileReader(".//CommonData.json");
		
		//Step-2: Convert JSON Object into Java Object
		JSONParser JP = new JSONParser();
		Object jobj = JP.parse(FR);
		
		//Step-3: Reading The Data
		HashMap hp = (HashMap)jobj;
		String URL = (String) hp.get("url");
		System.out.println(URL);
		
//		String URL1 = (String) hp.get("un");
//		System.out.println(URL1);
		
//		String URL2 = (String) hp.get("pwd");
//		System.out.println(URL2);
	}
}
