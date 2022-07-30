package com.crm.vtiger.Excel;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.vtiger.Generic.ExcelUtility;

public class Adding_data 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, Throwable 
	{
//		ArrayList<Integer> al = new ArrayList<Integer>();
		
		ExcelUtility ex = new ExcelUtility();
		Map<String, Integer> hp = new HashedMap<String,Integer>();
		
		for(int i=0; i<=ex.getLastRow("Sheet2");i++)
		{
			String name = ex.readDatafromExcel("Sheet2", i, 0);
			int value = ex.readNumericDataFromExcel("Sheet2", i, 1);
			hp.put(name, value);
			
		}
		System.out.println(hp);
	}
}
