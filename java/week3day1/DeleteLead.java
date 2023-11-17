package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("8610854096");
		driver.findElement(By.className("x-btn-text")).click();
		//driver.findElement(By.className("x-tool x-tool-close ")).click();
		String idName = driver.findElement(By.linkText("10417")).getText();
        System.out.println("Lead ID: "+idName);
        driver.findElement(By.linkText("10417")).click();
        
        driver.findElement(By.className("subMenuButtonDangerous")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys("10417");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        String message = driver.findElement(By.className("x-paging-info")).getText();
        System.out.println("Confirm Message: "+message);
        driver.close();
        
	}

}
