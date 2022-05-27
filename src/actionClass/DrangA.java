package actionClass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DrangA {
	WebDriver driver;
	
	  @Test(enabled = true)
	  public void dragAndDrop() throws Exception{

          driver.get("http://www.seleniumlearn.com/drag-and-drop");
  
          Thread.sleep(7000);
         
          Actions act=new Actions(driver);
          WebElement source=driver.findElement(By.id("draggable"));
          WebElement target=driver.findElement(By.id("droptarget"));
          act.dragAndDrop(source,target).perform();
          
	  }
	  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium.LIB\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();

}
}
