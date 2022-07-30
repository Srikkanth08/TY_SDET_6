package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithOut_Sendkeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		
		
	}
}
