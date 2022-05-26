package actionClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScrollUPandDown {
	WebDriver driver;
	
		
  @Test
  public void scrollDown() throws Exception{
	  Logger logger= Logger.getLogger("Google Web ");
	  PropertyConfigurator.configure("log4j.properties");
	 
	  driver.get("https://www.vastekgroup.com/");
	  logger.info("URL Vastek Opened");
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("scroll(0,1000)");
	  logger.info("scrolled down");
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void scrollUp() throws Exception{
	  Logger logger= Logger.getLogger("Google Web ");
	  PropertyConfigurator.configure("log4j.properties");
	  
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("scroll(2000,0)");
	  logger.info("scrolled up");
	  Thread.sleep(2000);
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	 
	  
	  
  }

 
}
