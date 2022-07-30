package com.crm.vtiger.Excel;

import java.io.IOException;

import org.openqa.selenium.By;

public class ADo extends Browser
{

	public static void main(String[] args) throws Throwable {
		
Browser bc=new Browser();
bc.openBrowser();
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.xpath("//a[text()='Organizations']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
String s= "Sain1100";
driver.findElement(By.name("accountname")).sendKeys(s);
Thread.sleep(2000);
driver.findElement(By.name("button")).click();
      Thread.sleep(2000);
/*WebElement title=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
String ti=title.getText();
System.out.println(ti);
if(ti.contains(s))
		{
	System.out.println("Successfully Verified'");
		}
else
{
	System.out.println("not Verified'");
	}
	 Thread.sleep(2000);
 Actions ac=new Actions(driver);
 WebElement addr=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
 ac.moveToElement(addr).perform();
 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
 Thread.sleep(2000);
 driver.close();*/


	}

}