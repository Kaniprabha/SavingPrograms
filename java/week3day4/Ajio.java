package week3day4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
    	 driver.get("https://www.ajio.com/");
    	 driver.manage().window().maximize();
    	 
    	 WebElement search = driver.findElement(By.name("searchVal"));
         search.sendKeys("bags");
         driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
         
        
        // driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
         driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
         Thread.sleep(10);
         driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
         String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
         System.out.println("Count of Items found: "+count);
         String Brands = driver.findElement(By.xpath("//div[@class='brand']")).getText();
         System.out.println("List of Brands: "+Brands);
         String Names = driver.findElement(By.xpath("//div[@class='nameCls']")).getText();
         System.out.println("List of Brands: "+Names);
         
	}

}
