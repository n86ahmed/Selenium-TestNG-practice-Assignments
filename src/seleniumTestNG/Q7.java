package seleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q7 {
	
	String driverPath = "C:\\chromedriver.exe";
	
	public WebDriver driver ;
	
	@Test
	public void loginToLinkedIn() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");	
	  driver.findElement(By.id("username")).sendKeys("nayeem.ahmed@ryerson.ca");
	  driver.findElement(By.id("password")).sendKeys("Iqbal_1530");
	  driver.findElement(By.className("btn__primary--large")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("www.linkedin.com/feed"));
	  driver.close();
	}
}

