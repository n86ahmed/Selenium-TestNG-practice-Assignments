package seleniumTestNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.chrome.ChromeDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;
public class Q5 {	
	
	WebDriver driver;			
    String driverPath = "C:\\chromedriver.exe";	
    
    @Test (priority=1)		
    public void openBrowser() {
    	System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();	
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  
    }		
		
    @Test (priority=2)		
    public void launchGoogle() {				
        driver.get("http://www.google.com");						
    }		
	
    @Test (priority=3)		
    public void peformSeachAndClick1stLink() {				
        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");	
    }		
	
    @Test (priority=4)		
    public void FaceBookPageTitleVerification() throws Exception {				
        driver.findElement(By.name("btnK")).click();						
        Thread.sleep(3500);		
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
    }	

    @Test (priority=5)		
    public void driverexit() {				
    	driver.close(); 
    }		
}	