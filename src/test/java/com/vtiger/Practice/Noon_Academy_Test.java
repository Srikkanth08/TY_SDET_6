package com.vtiger.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Noon_Academy_Test 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.learnatnoon.com/");
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[name()='svg' and @class='icon icon-noon pointer']")).click();
		
		driver.navigate().to("https://www.icc-cricket.com/");
		driver.findElement(By.xpath("//div[normalize-space()='Fixtures']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Men's Fixtures']")).click();
		
	}
}