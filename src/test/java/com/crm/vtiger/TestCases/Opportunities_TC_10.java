package com.crm.vtiger.TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_TC_10 
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
	
/*	driver.findElement(By.xpath("(//a[text()='Campaigns'])[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("campaignname")).sendKeys("Abcd");
	Thread.sleep(3000);
	
	driver.findElement(By.name("assigntype")).click();
	Thread.sleep(3000);
	
	WebElement rad_button = driver.findElement(By.name("assigned_group_id"));
	rad_button.click();
	Select sel =new Select(rad_button);
	sel.selectByIndex(2);
	
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	*/
	
	driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("potentialname")).sendKeys("TestCase_10");
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
	
	driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
	Thread.sleep(3000);
	
	WebElement Sin_dropdown = driver.findElement(By.name("assigned_group_id"));
	Sin_dropdown.click();
	Thread.sleep(3000);
	
	Select sel = new Select(Sin_dropdown);
	sel.selectByIndex(2);
	
	driver.findElement(By.xpath("(//img[@title='Select'])[2]")).click();
	Thread.sleep(3000);
	
	Set<String> AllWindowHandle = driver.getWindowHandles();
	System.out.println(AllWindowHandle);
	Iterator<String> iterators = AllWindowHandle.iterator();
	String Parent_Window = iterators.next();
	System.out.println("ParentWindow"+driver.getTitle());
	String Child_Window = iterators.next();
	System.out.println("ChildWindow"+driver.getTitle());
	
	//For SwitchTo Child Window
	driver.switchTo().window(Child_Window);
	driver.findElement(By.id("1")).click();
//	driver.close();   //it will close parent window so we get NoSuchWindowException
	Thread.sleep(3000);
	
	driver.switchTo().window(Parent_Window);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	Thread.sleep(3000);
	
	String Act_Title = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(Act_Title.contains("TestCase_10"))
	{
		System.out.println("Test Case is Created Successfully, PASS");
	}
	else
	{
		System.out.println("Test Case is Not Created Successfully, FAIL");
	}
	
	Thread.sleep(3000);
	driver.quit();
	
	
	}
}
