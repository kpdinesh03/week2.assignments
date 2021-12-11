package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Surya");
		driver.findElement(By.name("lastname")).sendKeys("Surya");
		driver.findElement(By.name("reg_email__")).sendKeys("Surya@surya.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Surya@surya.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Surya@surya.com");
		driver.findElement(By.name("sex")).click();
		 WebElement drop = driver.findElement(By.id("day"));
		Select select = new Select(drop);
		select.selectByVisibleText("3");
		
		WebElement drop2 = driver.findElement(By.id("month"));
		Select select2 = new Select(drop2);
		int size = select2.getOptions().size();
		select2.selectByIndex(size-2);
		
		WebElement drop3 = driver.findElement(By.id("year"));
		Select select3 = new Select(drop3);
		select3.selectByVisibleText("1995");


	}

}
