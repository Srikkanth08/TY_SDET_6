package DDT_Package;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadingDataFromPropertyTest
{
	@Test
	public void readingDataFromPropertyTest() throws Throwable
	{
		//Step-1: Convert Physical File into Java Object
		FileInputStream fis = new FileInputStream("./CommonData.properties");
		
		//Step-2: Create an Object for Properties & Load The Java Object
		Properties p = new Properties();
		p.load(fis);
		
		//Step-3: Read The Data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pwd"));
		
	}
	
	
}
