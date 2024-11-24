package launchBrowserTearDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestSetup {
		
	public WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void test_setup()throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.autotrader.co.uk/cars/valuation");

// AutoTrader Cookie frame to accept code but somehow its not working"
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//       
//        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='notice']//button[@title='Accept All']")));
//
//      
//        acceptButton.click();
		}
		
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
}


