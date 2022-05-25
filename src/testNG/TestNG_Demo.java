package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Demo {
	WebDriver driver;
	
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  }

  @Test (description= "facebook", priority =1 )
  public void testcase_001() {
	  driver.get("https:\\facebook.com");
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
