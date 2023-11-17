package week4day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class EcomWeb {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buythevalue.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		

	}

}
