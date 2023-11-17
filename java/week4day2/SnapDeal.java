package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//span[@class='catText']")).click();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	    String count= driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
	    System.out.println("Count of Sports Shoes: "+count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//WebElement Phoneprice = driver.findElement(By.xpath("lfloat product-price"));
		
		List<WebElement> phonePrice =driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        List<Integer> TShoes = new ArrayList<Integer>();
        for(int i=0; i<phonePrice.size(); i++) {
        	String Rs = phonePrice.get(i).getText();
        	String replace = Rs.replaceAll(".", "").replaceAll("a^", "");
        	if(!replace.isEmpty()) {
        		TShoes.add(Integer.parseInt(replace));
        	} 
        }
        
        Collections.sort(TShoes);
        
        System.out.println("List: "+TShoes);
		
		
		
	}

}
