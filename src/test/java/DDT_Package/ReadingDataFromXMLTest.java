package DDT_Package;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDataFromXMLTest 
{
	@Test
	public void readingDataFromXMLTest(XmlTest xml)
	{
		System.out.println(xml.getParameter("url"));
//		System.out.println(xml.getParameter("un"));
//		System.out.println(xml.getParameter("pwd"));
	}
}
