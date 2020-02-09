package learningSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1Test {

	@Test
    public void exploreVariousElements() throws InterruptedException {

//set your chromeDriver as your default Driver
 
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
    
    //Instantiate ChromeDriver Object
    WebDriver driver = new ChromeDriver();
    
    //Implicit wait
    driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
    
    //delete cookies and history
    driver.manage().deleteAllCookies();
    
    //maximize browser
    driver.manage().window().maximize();
   
    //go to the site 
 driver.get("http://www.objectspy.space/"); 
 
 //slow down java 1000 mill seconds = 1 sec
 Thread.sleep(3000);
 
 //click on the radio button =male
 driver.findElement(By.id("sex-0")).click();
 
 Thread.sleep(3000);

 driver.findElement(By.name("firstname")).sendKeys("Desire");
 
 Thread.sleep(3000);
 
 driver.findElement(By.name("lastname")).sendKeys("Nkomezi");
 
 Thread.sleep(3000);
 
 
 //click on Link Text
 driver.findElement(By.linkText("Link Test : New Page")).click();
 Thread.sleep(3000);
 
 //Click on partial link
 driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
 
 //CSS
 //CSS element locators are the universal method that can give 
 //a value of any Tag that is not familiar:name,id,className....
 //Example: type, for....all are unfamiliar Tag. or CSS can resolve the code that are outside
 //attribute=value.
 
 //these pieces of the code will 
 //close the driver 
 driver.close();

 //quit the driver
 driver.quit();
 
 
    
    
	
	
	}
}