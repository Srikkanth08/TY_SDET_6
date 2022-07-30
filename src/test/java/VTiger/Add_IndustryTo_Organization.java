package VTiger;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Add_IndustryTo_Organization 
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
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='MS Technologies'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("Edit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("industry")).click();
		Thread.sleep(3000);
		
		WebElement dd = driver.findElement(By.name("industry"));
		Select sel = new Select(dd);
		sel.selectByIndex(7);
		Thread.sleep(5000);
		
		if(sel.isMultiple())
		{
			System.out.println("It is a Multiple Drop-down");
		}
		else
		{
			System.out.println("It is Not a Multiple Drop-down");
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("button")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
