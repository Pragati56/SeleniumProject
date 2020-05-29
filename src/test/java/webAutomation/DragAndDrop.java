package test.java.webAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
public class DragAndDrop {
 
	 @Test
	    public void dropdown() {
		ChromeDriver driver;
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SinghP90\\Desktop\\adb\\chromedriver.exe");
   	 
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--no-sandbox");
    	// Initialize browser
    	 driver = new ChromeDriver(options);
    	 
		driver = new ChromeDriver(options);
 
		driver.manage().window().maximize();
 
		driver.manage().deleteAllCookies();
 
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement webFrame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(webFrame);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		String colourBeforeDnD = target.getCssValue("color");
		
		//action.dragAndDrop(source, target).build().perform();
		
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
 
		String colorAfterDnD = target.getCssValue("color");
		
		System.out.println("Color before Drag and Drop : "+ colourBeforeDnD);
		
		System.out.println("Color after Drag and Drop : "+ colorAfterDnD);
	}
 
}