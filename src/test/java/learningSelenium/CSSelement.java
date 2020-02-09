package learningSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSelement {
@Test
public void handleCSSelement() throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	    
	    WebDriver driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().window().maximize();
	  
	    driver.get("http://www.objectspy.space/"); 
	    
	    Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#sex-0")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("input[value='Female']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("label.radio[for='sex-1']")).click();
        Thread.sleep(3000);
        
        //Xpath = always start with grandfather= (html/head)
        //N.B in order to get css you need to heat button ctrl&F
        
         driver.close();
         driver.quit();
         
        
}
}