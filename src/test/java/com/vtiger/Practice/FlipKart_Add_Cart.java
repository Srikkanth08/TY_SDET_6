package com.vtiger.Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart_Add_Cart 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='APPLE iPhone 13 Pro Max (Alpine Green, 512 GB)']")).click();
		
		Set<String> child = driver.getWindowHandles();
		for(String onechild : child)
		{
			String Title = driver.switchTo().window(onechild).getTitle();
			if(Title.contains("APPLE iPhone 13 Pro Max"))
			{
				String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
				System.out.println(price);
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='+']"));
		Point loc = element.getLocation();
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("window.scrollBy"+loc);
		driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]")).click();
		
		Thread.sleep(3000);
		
		String Phn_price = driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']")).getText();
		System.out.println("After Addition of Quantity : "+Phn_price);
		
		Thread.sleep(3000);
		driver.quit();
	}
}

