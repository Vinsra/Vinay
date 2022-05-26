package actionClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
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
  
  @Test (priority = 3)
  public void SelectedElementsScrollDown() throws Exception{
	driver.get("https://www.vastekgroup.com/job-postings.html");
	Thread.sleep(2000);
	
	WebElement element = (WebElement) driver.findElement(By.xpath("//*[@id=\"ts-cta-area\"]/div/div/div[2]/div/a"));
	Coordinates coordinate = ((Locatable) element).getCoordinates();
	coordinate.onPage();
	coordinate.inViewPort();
	
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("scroll(2000,0)");
	
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	 
	  
	  
  }

 
}
