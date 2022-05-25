package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Grouptest2 {
	WebDriver driver;
	
	
	
  @Test (groups = {"sanity"})
  public void facebook() {
	  driver.get("https:\\facebook.com");
	  
  }
 
  @Test (groups = {"smoke"})
  public void google() {
driver.get("https:\\google.com");
	  
  }
  
  @Test (groups = {"sanity"})
  public void gmail() {
driver.get("https:\\gmail.com");
	  
  }
  
  @Test (groups = {"regression"})
  public void Prologis() {
driver.get("http:\\prologis.com");
	  
  }
  
  @Test (groups = {"regression"})
  public void vastek() {
driver.get("http:\\vastekgroup.com");
	  
  }
  
  
  
  @BeforeTest (groups = {"regression"})
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
