package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//String Pagetitle = driver.getTitle();
		//System.out.println("Title: "+Pagetitle);
		//if(Pagetitle.contains("Dashboard")) {
		//	System.out.println("Page Title Verified.");
		//}
	
		
		
	}

}
