package com.vtiger.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank_Apply 
{
	public static void main(String[] args) throws Throwable 
	{	
/*	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.hdfcbank.com/");
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@class='closeSummer']")).click();
//	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
//	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//div[@class='dropdown'])[1]")).click();
//	Thread.sleep(3000);
	
/*	List<WebElement> Allops = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']"));
	System.out.println(Allops.size());
	
	for(int i=0; i<=Allops.size()-1; i++)
	{
		if(Allops.get(i).getText().contains("Accounts"))
		{
			Allops.get(i).click();
			break;
		}
	}  */
	
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		d.findElement(By.id("nvpush_cross")).click();
		Thread.sleep(3000);
		d.findElement(By.id("onetrust-close-btn-container")).click();

		Thread.sleep(3000);
		d.findElement(By.xpath("//img[@src=\"https://www.hdfcbank.com/static/features/%5BBBHOST%5D/feature-hdfc-slick-slider/media/pop-close.png\"]")).click();
		Thread.sleep(3000);       
		d.findElement(By.xpath("//a[.='Select Product Type']")).click();
		d.findElement(By.xpath("//li[text()='Accounts']")).click();
		Thread.sleep(3000); 
        d.findElement(By.xpath("//a[text()='Select Product']")).click();
        d.findElement(By.xpath("//li[text()='Salary Accounts']")).click();
        Thread.sleep(3000);
        //d.close();

	
	
	}
}
