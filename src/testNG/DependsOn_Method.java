package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DependsOn_Method {
	WebDriver driver;
	

  @BeforeTest
  public void beforeTest() {
	  
	System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	  
  }
  
  @Test(dependsOnMethods = {"method_002"})
  public void method_001() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[2]/a")).click();
	  Thread.sleep(2000);
  }
  
  @Test
  public void method_002() throws InterruptedException {
	  driver.get("https://zomato.com");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
