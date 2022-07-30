package com.vtiger.Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_IncognitoMode 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://google.com");
//		driver.manage().window().maximize();
		
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("Start-maximized");
//		chromeOption.addArguments("incognito");
		chromeOption.addArguments("headless");
		
		ChromeDriver cd = new ChromeDriver(chromeOption);
	}
}
