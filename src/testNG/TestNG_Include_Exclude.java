package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Include_Exclude {
	WebDriver driver;
	


	  
	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/input")).sendKeys("biryani");
	}
	
	
	
	
	@Parameters({"browser"})
	@BeforeTest
	  public void openBrowser(String browser) throws InterruptedException {
		  
		try {
			
			 if (browser.equalsIgnoreCase("Firefox")) {
		           	System.setProperty("webdriver.gecko.driver","D:\\Selenium.LIB\\geckodriver.exe");
		               driver = new FirefoxDriver();
		               driver.manage().window().maximize();
		               Thread.sleep(2000);
		           } 
			 
			 else if (browser.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
			}
		

	}
		  catch (WebDriverException e) {
	            System.out.println(e.getMessage());
	        }
	}
	
	

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
