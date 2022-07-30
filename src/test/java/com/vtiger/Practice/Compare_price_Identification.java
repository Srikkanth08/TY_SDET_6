package com.vtiger.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compare_price_Identification 
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
		driver.findElement(By.name("q")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB) (6 GB RAM)");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String Flip_price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(Flip_price);
		
		driver.quit();
		
		Thread.sleep(3000);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
		driver1.navigate().to("https://www.amazon.in/");
		driver1.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver1.findElement(By.name("field-keywords")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB) (6 GB RAM)");
		driver1.findElement(By.id("nav-search-submit-button")).click();
		
		String Amazon_price = driver1.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(Amazon_price);
		
		String New_Flip_price = Flip_price.replaceAll("[^a-zA-Z0-9]", "");
		String New_Amaz_price = Amazon_price.replaceAll("[^a-zA-Z0-9]", "");
		
		int a = Integer.parseInt(New_Flip_price);
		int b = Integer.parseInt(New_Amaz_price);
		System.out.println(a+" "+b);
		
		if(a>b) 
		{
			System.out.println("Flipkart Price is higher than Amazon : "+a);
		}
		else if(a==b)
		{
			System.out.println("Both prices are equal");
		}
		else
		{
			System.out.println("Amazon Price is higher than Flipkart : "+b);
		}
		
		Thread.sleep(3000);
		driver1.quit();
	}
}
