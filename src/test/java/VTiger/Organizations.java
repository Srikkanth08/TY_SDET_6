package VTiger;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Organizations 
{
	public static void main(String[] args) throws Throwable 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='edit']")).click();
		Thread.sleep(3000);
		
		WebElement Ed = driver.findElement(By.name("accountname"));
		Ed.click();
		Ed.clear();
		Thread.sleep(3000);
		Ed.sendKeys("MS Technologies");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='MS Technologies' and @title='Organizations']")).click();
		Thread.sleep(3000);
		
//		WebElement Exp_Title = driver.findElement();
		String Act_Title = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//		System.out.println(Act_Title);
		if(Act_Title.contains("ACC"))
		{
			System.out.println("Successfully Created, PASS");
		}
		else
		{
			System.out.println("Not Created, FAIL");
		}
		
		
//		System.out.println("New Organization Created. Name is : "+Act_Title.getText()+" PASS");
//		Thread.sleep(3000);
		
	/*	if(Act_Title.contains(Exp_T))
		{
//			System.out.println("Organization is displayed, PASS");
			System.out.println(Act_Title.getText());
		}
		else
		{
			System.out.println("Organization is not displayed, Fail");
		}
		*/
		
		WebElement Ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.moveToElement(Ele).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		Thread.sleep(3000);
		driver.quit(); 
		
	}
}
