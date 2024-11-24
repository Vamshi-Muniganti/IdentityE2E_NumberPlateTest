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
	
	//public WebDriver driver = new ChromeDriver();
	
	public WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void test_setup()throws Exception {
		//WebDriver driver = new ChromeDriver();
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--start-maximized", "chrome.switches", "--disable-extensions");
		//WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.autotrader.co.uk/cars/valuation");
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Locate the "Accept All" button using its XPath or CSS Selector
//        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='notice']//button[@title='Accept All']")));
//
//        // Click the "Accept All" button to dismiss the cookie popup
//        acceptButton.click();
		}
		
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
}


