package com.crm.vtiger.TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_TC_05 
{
	public static void main(String[] args) throws Throwable 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("potentialname")).sendKeys("abc");
	Thread.sleep(3000);
	
	WebElement Related = driver.findElement(By.id("related_to_type"));
	Related.click();
	Select sel = new Select(Related);
	sel.selectByVisibleText("Contacts");
	Thread.sleep(3000);
	
	WebElement datefield = driver.findElement(By.name("closingdate"));
	datefield.click();
	datefield.clear();
	datefield.sendKeys("2018-01-09");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
	Thread.sleep(3000);
	
	Set<String> AllWindowHandles = driver.getWindowHandles();
	System.out.println(AllWindowHandles);
	Iterator<String> iterator = AllWindowHandles.iterator();
	String ParentWindow = iterator.next();
	System.out.println("ParentWindow"+driver.getTitle());
	String ChildWindow = iterator.next();
	System.out.println("ChildWindow"+driver.getTitle());
	
	//For SwitchTo Child Window
	driver.switchTo().window(ChildWindow);
	driver.findElement(By.id("1")).click();
//	driver.close();   //it will close parent window so we get NoSuchWindowException
	Thread.sleep(3000);
	
	driver.switchTo().window(ParentWindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@title='Clear'])[1]")).click();
	System.out.println("Organization Data is Cleared, PASS");
	Thread.sleep(3000);
	
	driver.quit();
	
	
//	for(String OneWindowHandle:AllWindowHandles)
//	{
//		String Title = driver.switchTo().window(OneWindowHandle);
//		if(Title.contains("localhost:8888/index.php"))
//		{
//			driver.findElement(By.id("1")).click();
//		}
//	}
	
	

	
	}
}
