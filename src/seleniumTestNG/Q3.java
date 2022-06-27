package seleniumTestNG;

import org.testng.annotations.Test;


import org.openqa.selenium.*;			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.chrome.ChromeDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;

public class Q3 {
	
	WebDriver driver;			
    String driverPath = "C:\\chromedriver.exe";		
    @Test (priority=1)		
    public void openBrowser() {				
    	System.setProperty("webdriver.chrome.driver", driverPath); 
        driver = new ChromeDriver();				
    }		

  			
    @Test (priority=2)		
    public void launchFacebook() {				
        driver.get("http://www.facebook.com");						
    }
    
    
    @Test (priority=3)		
    public void checkTagName() {
    	
    	String tagName = driver.findElement(By.id("email")).getTagName();
    	System.out.println(tagName); 
    	driver.close(); 
        							
    }	
}
