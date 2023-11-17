package week4day3;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;

import java.util.Set;

import java.util.TreeSet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		Actions action = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS"+Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU"+Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> traintable = driver.findElements(By.xpath("//table[contains(@class,'DataTable')]/tbody/tr/td[2]"));
				
		System.out.println("No-of-Rows: "+traintable.size());
		
		Set<String> TrainNames = new TreeSet<String>();
		for(int i=1; i<traintable.size(); i++) {
			List<WebElement> trainName = driver.findElements(By.xpath("//table[contains(@class,'DataTable')]/tbody/tr/td[2]"));
		    String TrainRow = trainName.get(i).getText();
		    for(int j=1; j<traintable.size(); j++) {
		    	System.out.println("train "+j+" is"+ TrainRow);
		    }
			
		  //System.out.println(TrainNames.size());			
					
		}
		if((traintable.size()-1) == TrainNames.size()) {
			System.out.println("There is no duplicates.");
		}else {
			System.out.println("There is duplicate in Names");
		}
		
		//driver.findElement(By.xpath(""));

	}


	

}
