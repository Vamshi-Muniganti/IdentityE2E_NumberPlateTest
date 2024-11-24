package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoTrader_VehicleSearchPage {
	
	//This is example of Encapsulation hiding data elements and methods and used by getter & setter methods
	private static WebElement element = null;
	
	
	public static WebElement vehicleRegistrationNumber(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#valuations-reg"));
		return element;
	}

	public static WebElement vehicleMileage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#valuations-mileage"));
		return element;
	}
	
	public static WebElement getInstantValuation(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'Get my instant valuation')]"));
		return element;
	}
	
	public static WebElement getVehicleResultHeader(WebDriver driver) {
		element = driver.findElement(By.tagName("h1"));
		return element;
	}
			
}



