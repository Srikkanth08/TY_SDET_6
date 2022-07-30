package com.vtiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympic_Test 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://olympics.com/en/athletes/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);
        WebElement dda=  driver.findElement(By.name("filtertext"));
        dda.sendKeys("Nathan CHEN"+Keys.ENTER);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@aria-label=\"Clear Input\"]")).click();
        driver.findElement(By.xpath("//img[@alt=\"Nathan CHEN\"]")).click();
        Thread.sleep(2000);
        WebElement a=   driver.findElement(By.xpath("//div[@class=\"col-right d-flex\"]"));
        System.out.println(a.getText());
        
        Thread.sleep(3000);
        driver.quit();
     }
}

