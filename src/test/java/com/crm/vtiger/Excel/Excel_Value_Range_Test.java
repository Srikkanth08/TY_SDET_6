package com.crm.vtiger.Excel;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.vtiger.Generic.ExcelUtility;

public class Excel_Value_Range_Test 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, Throwable 
	{
		ExcelUtility ex = new ExcelUtility();
		for(int i=0; i<=ex.getLastRow("Sheet2"); i++)
		{
			int value = ex.readNumericDataFromExcel("Sheet2", i, 1);
			String salary = ex.readDatafromExcel("Sheet2", i, 0);
			
			if(value>=15000)
			{
				System.out.println(salary);
			}
		}
	}
}
