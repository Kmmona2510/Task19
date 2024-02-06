package Task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();  //launch the driver
		
		driver.get("https://www.guvi.in/register");   //load the url
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));   //give waits to find webelement
		
		driver.manage().window().maximize();                   //maximize the window
		
		//driver.findElement(By.id("name")).sendKeys("mohana");  //use locator id to the full name field
		
		driver.findElement(By.className("form-control")).sendKeys("mohana");        //use the locator class name to the name field
		
		
		driver.findElement(By.id("email")).sendKeys("mohanamoorthi003@gmail.com");  //use locator id for email field
		
		//driver.findElement(By.tagName("input")).sendKeys("mohanamooerthi003@gmail.com");   //use locator tagname for email filed
		
		driver.findElement(By.id("password")).sendKeys("Nova@123");     //use id locator for password
		
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("7200968670");  //use cssselector to locate the mobile number
		
		
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();           //use xpath to locate the signup button
		
		

	}

}
