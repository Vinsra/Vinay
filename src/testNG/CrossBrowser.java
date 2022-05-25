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

public class CrossBrowser {
	WebDriver driver;

	@Test
	public void google() throws Exception
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Parallel Browser Testing In Selenium with TestNG");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Parameters({ "browsers" })
	@BeforeTest
	public void openBrowser(String browser) {
		
		 try {

	            if (browser.equalsIgnoreCase("FirefoxBroswer")) {
	            	System.setProperty("webdriver.gecko.driver","D:\\Selenium.LIB\\geckodriver.exe");
	                driver = new FirefoxDriver();
	            } 

	            else if (browser.equalsIgnoreCase("Chrome")) 
	            {
	                System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	                driver = new ChromeDriver();
	            } 
	            /*
	            else if (browser.equalsIgnoreCase("IE")) {
	                System.setProperty("webdriver.ie.driver","D:\\lib\\IEDriverServer.exe");
	                driver = new InternetExplorerDriver();
	            }

	           else if (browser.equalsIgnoreCase("opera")) {
	                System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
	                driver=new OperaDriver();
	             }

	        else if (browser.equalsIgnoreCase("safari")) {
	            System.setProperty("webdriver.safari.driver", "D:\\lib\\SafariDriver.exe"); //To stop uninstall each time
	             driver = new SafariDriver();
	             }
	             */
	        } 
	        catch (WebDriverException e) {
	            System.out.println(e.getMessage());
	        }
		
	}

}