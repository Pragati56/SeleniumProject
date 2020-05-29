package test.java.webAutomation;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebTestCase {
	WebDriver driver;
	
	 @Test
	    public void fchromeCase() {
	    	System.out.println("inside test");
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SinghP90\\Desktop\\adb\\chromedriver.exe");
	    	 
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--no-sandbox");
	    	// Initialize browser
	    	 driver = new ChromeDriver(options);
	    	 
	    	 
	    	// Open facebook
	    	driver.get("https://www.google.com/");
	    	
	    	 
	    	// Maximize browser
	    String title = 	 driver.getTitle();
	    System.out.println("Title is "+title);
	   // driver.findElement(By.id("tsf"));
	   //WebElement element2 = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
	   assertTrue(title.equals("Google"));
	   
	   assertTrue(title.equalsIgnoreCase("Google"));
		   
		   WebElement empID = driver.findElement(By.xpath( "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
	    System.out.println("Check element is present "+  empID.isDisplayed());
	   empID.sendKeys("selenium");
	   
	    
	    	driver.manage().window().maximize();
	    	
	    }

	 @AfterMethod
	 public void closeMethod()
	 {
		 driver.quit();
		 
	 }
	 
	 
	 
}