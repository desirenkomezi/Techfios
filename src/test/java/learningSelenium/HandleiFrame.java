package learningSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFrame {

	@Test
	public void handleiFrames() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://docs.oracle.com/javase/8/docs/api/");
	
	driver.switchTo().frame(2);
	Thread.sleep(1000);

	driver.findElement(By.linkText("java.applet")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("AppletContext")).click();
	Thread.sleep(5000);
	driver.close();
	driver.quit();

	
}
}