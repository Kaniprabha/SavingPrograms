package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBookAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("RagulKesav");
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("gk");
		
		WebElement MobNumOrEmail = driver.findElement(By.name("reg_email__"));
		MobNumOrEmail.sendKeys("8610854096");
        
		
		WebElement NewPassword = driver.findElement(By.id("password_step_input"));
		NewPassword.sendKeys("ragul35");
		
		WebElement Day = driver.findElement(By.id("day"));
		Day.sendKeys("5");
		
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("July");
		
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("2005");
		
	    
		
	}
	

}
