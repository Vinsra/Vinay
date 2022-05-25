package Log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {
	WebDriver driver;
	
  @Test
  public void log4jmethod() throws InterruptedException {
	  Logger logger= Logger.getLogger("Google Web ");
	  PropertyConfigurator.configure("log4j.properties");
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  logger.info("Browser Launched and maximized");
	  
	  driver.get("https:\\zomato.com");
	  logger.info("URL Zomato Lauched");
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/input")).sendKeys("Biryani");
	  logger.info("Entered Biryani in search path");
	  
	  Thread.sleep(1000);
	  logger.info("wait for minute");
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/input")).sendKeys(Keys.ENTER);
	  logger.info("Enter button pressed in keyboard");
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[4]/a/div[1]/img")).click();
	  logger.info("clicked on Night Life and clubs");
	  
	  
	  
  }
 

}
