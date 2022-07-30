package com.crm.vtiger.Excel;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.Generic.ExcelUtility;

public class Login_To_VTiger 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		ExcelUtility ed = new ExcelUtility();
		String un = ed.readDatafromExcel("Sheet3", 0, 1);
		
		int pwd = ed.readNumericDataFromExcel("Sheet3", 1, 1);
		String password = Integer.toString(pwd);
		int intvalue = (int) Math.round(pwd);
		System.out.println(intvalue);
		String pwd1 = Integer.toString(intvalue);
		System.out.println(pwd1);
		
		
//		System.out.println(un +"  "+pwd);
		
		
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd1);
	}
}

