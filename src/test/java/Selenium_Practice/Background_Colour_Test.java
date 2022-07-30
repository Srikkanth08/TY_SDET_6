package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Background_Colour_Test 
{
	public static void main(String[] args) 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com");
		
		WebElement newAccount_btn = driver.findElement(By.name("login"));
		String bg_Colour = newAccount_btn.getCssValue("background-color");
		System.out.println(bg_Colour);
		
		String Hex_BG_Colour = Color.fromString(bg_Colour).asHex();
		System.out.println(Hex_BG_Colour);
		
		if(Hex_BG_Colour.equals("#1877f2"))
		{
			System.out.println("Back-Ground colour is same. So,Test is Pass");
		}
		
		else
		{
			System.out.println("Back-Ground colour is not same. So,Test is Fail");
		}
	}
}
