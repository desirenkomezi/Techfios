package learningSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
@Test
public void validUserShouldbeAbleTologin() throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("http://techfios.com/test/billing/?ng=login=adm/"); 
	    
    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
   
  
   driver.close();
   driver.quit();
   
   
   
    
    
}
}
   

 
 
 
 
 
 
     
         
        

