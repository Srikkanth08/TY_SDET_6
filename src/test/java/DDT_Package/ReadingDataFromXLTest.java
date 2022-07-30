package DDT_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadingDataFromXLTest 
{
	@Test
	public void ReadingDataFromXLTest() throws Throwable
	{
		//Step-1: Open The File In Read Mode 
		FileInputStream fis = new FileInputStream(".//Cricketers.xlsx");
		
		//Step-2: Get The Control Of The File
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step-3: Go To The Particular Sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Step-4: Go To The Particular Row
		Row r = sh.getRow(1);
		
		//Step-5: Go To The Particular Cell
		Cell ce = r.getCell(0);
		
		//Stpe-6: Go To The String Cell Value
		String scv = ce.getStringCellValue();
		
		//Step-7: Print It
		System.out.println(scv);
		
	}
}
