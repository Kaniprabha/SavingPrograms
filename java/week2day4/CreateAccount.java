package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Source;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class CreateAccount {
	 private static final WebElement RagulKesav = null;

		public static void main(String[] args) {
	    	 ChromeDriver driver = new ChromeDriver();
	    	 driver.get("http://leaftaps.com/opentaps/.");
	    	 driver.manage().window().maximize();
	    	 
	    	 
	    	 WebElement userName = driver.findElement(By.id("username"));
	    	 userName.sendKeys("DemoCSR");
	    	 WebElement passWord = driver.findElement(By.id("password"));
	    	 passWord.sendKeys("crmsfa");
	    	 
	    	 
	    	 driver.findElement(By.className("decorativeSubmit")).click();
	    	 driver.findElement(By.id("label")).click();
	    	 driver.findElement(By.linkText("Create Account")).click();
	    	 
	    	 
	    	 WebElement accountName = driver.findElement(By.id("accountName"));
	    	 accountName.sendKeys("RagulKesav");
	    	 WebElement description = driver.findElement(By.name("description"));
	    	 description.sendKeys("Selenium Automation Tester.");
	    	 
	    	 
	    	 WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
	    	 Select Industry = new Select(IndustryDD);
	    	 Industry.selectByIndex(3);
	    	 
	    	 WebElement ownerShipDD = driver.findElement(By.name("ownershipEnumId"));
	    	 Select ownerShip = new Select(ownerShipDD);
	    	 ownerShip.selectByVisibleText("Corporation");
	    	 
	    	 WebElement SourceDD = driver.findElement(By.id("dataSourceId"));
	    	 Select Source = new Select(SourceDD);
	    	 Source.selectByValue("LEAD_EMPLOYEE");
	    	 
	    	 WebElement markCompaignDD = driver.findElement(By.id("marketingCampaignId"));
	    	 Select markCompaign = new Select(markCompaignDD);
	    	 markCompaign.selectByIndex(6);
	    	 
	    	 WebElement stateProvinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    	 Select stateProvince = new Select(stateProvinceDD);
	    	 stateProvince.selectByValue("TX");
	    	 
	    	 driver.findElement(By.className("smallSubmit")).click();
	    	 System.out.println(accountName);
	    	 if(accountName == RagulKesav) {
	    		System.out.println("Account Name Verified.");
	    	 }
	    	 else {
	    		 System.out.println("Check Account Name.");
	    	 }
	    	 driver.close();
		} 
	    	 
	    	 
	     

		private static Select Select(WebElement markCompaignDD) {
			// TODO Auto-generated method stub
			return null;
		}

}
