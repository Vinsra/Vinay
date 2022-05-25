package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Grouptest {
	WebDriver driver;
	

  @BeforeTest(groups ={"sanity"})
  public void beforeTest() {
	  
	System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }
	  
	@Test(groups ={"sanity"})
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@Test(groups ={"smoke"})
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}

	@Test(groups ={"regression"})
	public void twitter() {
		driver.get("https://www.twitter.com");
	}

	@Test(groups ={"smoke"})
	public void gmail() {
		driver.get("https://www.gmail.com");
	}

	@Test(groups ={"sanity"})
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
