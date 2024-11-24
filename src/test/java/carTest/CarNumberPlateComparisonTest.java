package carTest;

import java.util.List;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import launchBrowserTearDown.TestSetup;
import pages.AutoTrader_VehicleSearchPage;

@Test
public class CarNumberPlateComparisonTest extends TestSetup {
	
	public void sort_test() {	
		// Reading Input and Output files 
		ReadNumberPlateFromInputFile NP = new ReadNumberPlateFromInputFile();
		ReadContentFromOutputFile CarOutput = new ReadContentFromOutputFile();
		String Output = CarOutput.carOuput();
		List<String> regNumbers= NP.numberPlate();
		
		// Searching Vehicle properties using Number plates from List
		for (String plate : regNumbers) {
			AutoTrader_VehicleSearchPage.vehicleRegistrationNumber(driver).sendKeys(plate);
			AutoTrader_VehicleSearchPage.vehicleMileage(driver).sendKeys("435434");
			AutoTrader_VehicleSearchPage.getInstantValuation(driver).click();


		String TopMessage = AutoTrader_VehicleSearchPage.getVehicleResultHeader(driver).getText();

		// Comparing the vehicle properties from AutoTrader with details in Output file
		if (TopMessage.equalsIgnoreCase("We've identified this car using the details you provided")) {
			for(int i=3;i<=6;i++){
			String propertyValue = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/main[1]/article[1]/div[1]/div[1]/div[1]/div["+i+"]/div[2]")).getText();
			
			if (Output.contains(propertyValue.toUpperCase())) {
			System.out.println(propertyValue + " Matches " + plate );}else {System.out.println("No properties matching");}
			} 
			driver.navigate().back(); 
		 } 	
		else {System.out.println("No Values displayed for this registration");} 
	 }
  }
}

