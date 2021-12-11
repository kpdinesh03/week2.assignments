package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		WebElement element = driver.findElement(By.id("email"));
		System.out.println(element.getAttribute("value"));
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("abc@gmail.com", Keys.TAB);	
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();	
		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());	


		

		

	}

}
