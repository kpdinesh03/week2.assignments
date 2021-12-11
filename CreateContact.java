package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
		driver.findElement(By.id("lastNameField")).sendKeys("KP");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("KP");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("KP");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("KP");
		driver.findElement(By.id("createContactForm_description")).sendKeys("KP");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kp@gmail.com");



		WebElement eledrop4 = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select select4 = new Select(eledrop4);
		select4.selectByVisibleText("India");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement eledrop5 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select5 = new Select(eledrop5);
		select5.selectByVisibleText("TAMILNADU");

		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();


		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("kP");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();



		String title = driver.getTitle();
		System.out.println(title);

	}

}
