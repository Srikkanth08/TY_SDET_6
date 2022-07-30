package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Drop_Downs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/select[1]"));
		Thread.sleep(3000);
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Bangladesh");
		System.out.println(dropdown);
	}
}
