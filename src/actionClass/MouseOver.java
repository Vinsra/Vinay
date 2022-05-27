package actionClass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseOver {
	WebDriver driver;
	
  @Test(enabled = false)
  public void rightClick() throws InterruptedException {
	  driver.get("https://www.vastekgroup.com/");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/a"))).perform();
  }
  
  @Test (enabled = false)
  public void doubleClick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/double-click");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().perform();
	  
  }
	  
	  @Test(enabled = true)
	  public void dragAndDrop() throws Exception{
//		  driver.get("http://www.seleniumlearn.com/drag-and-drop");
//		  Thread.sleep(4000);
		  
//	//	  Actions act = new Actions(driver);
//		  WebElement Source = driver.findElement(By.id("draggable"));
//		  Thread.sleep(4000);
//		  WebElement target = driver.findElement(By.id("droptarget"));
//		  act.dragAndDrop(Source,target).perform();
		  
//		  Actions act=new Actions(driver);
//          WebElement source=driver.findElement(By.id("draggable"));
//          WebElement target=driver.findElement(By.id("droptarget"));
//          act.dragAndDrop(source,target).perform();
//		  
		  
	      
          driver.get("http://www.seleniumlearn.com/drag-and-drop");
  
          Thread.sleep(3000);
         
          Actions act=new Actions(driver);
          WebElement source=driver.findElement(By.id("draggable"));
          WebElement target=driver.findElement(By.id("droptarget"));
          act.dragAndDrop(source,target).perform();
          
	  }
	  
	  
	  
		  @Test (enabled= false )
		  public void mouseOver() throws Exception {
		      driver.get("http://vastekgroup.com");
		      Thread.sleep(4000);
		      Actions act=new Actions(driver);
		      act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/a"))).build().perform();
		      Thread.sleep(3000);
		      act.moveToElement(driver.findElement(By.linkText("java.html"))).click().perform();

		  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
