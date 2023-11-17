package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
        driver.findElement(By.xpath("//label[text()='Java']")).click();
        driver.findElement(By.xpath("//label[text()='Python']")).click();
        driver.findElement(By.xpath("//label[text()='Others']")).click();
        
        driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::div")).click();
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
        driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
        driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
        driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
        
        
        
	}

}
