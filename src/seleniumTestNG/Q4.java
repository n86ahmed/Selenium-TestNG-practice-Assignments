package seleniumTestNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.chrome.ChromeDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;

public class Q4 {
	WebDriver driver;			
    String driverPath = "C:\\chromedriver.exe";		
    @Test (priority=1)		
    public void openBrowser() {				
    	System.setProperty("webdriver.chrome.driver", driverPath); 
        driver = new ChromeDriver();				
    }		
		
    @Test (priority=2)		
    public void launchGuru() {				
        driver.get("https://lambdatest.github.io/sample-todo-app/");						
    }
		
    @Test (priority=3)		
    public void checkAndAddElements() {
    	
    	driver.findElement(By.name("li2")).click();
    	driver.findElement(By.name("li4")).click();
    	driver.findElement(By.id("sampletodotext")).clear();
    	driver.findElement(By.id("sampletodotext")).sendKeys("Nayeem AHmed");
    	driver.findElement(By.id("addbutton")).click();
   							
    }	
}


