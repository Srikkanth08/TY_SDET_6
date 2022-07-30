package Selenium_Practice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobile_Device_Emulation 
{
	public static void main(String[] args) 
	{
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		DevTools devTools = driver.getDevTools();

		devTools.createSession();
 /*	    devTools.send(Emulation.setDeviceMetricsOverride(399, 
	    		844, 
	    		100, 
	    		true, 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty(), 
	    		Optional.empty())); */  
	    
		Map<String, Object> dm = new HashMap<String, Object>();
		dm.put("width", 390);
		dm.put("height", 844);
		dm.put("deviceScaleFactor", 100);
		dm.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", dm);
		
		driver.get("https://www.selenium.dev/");

	}
}
