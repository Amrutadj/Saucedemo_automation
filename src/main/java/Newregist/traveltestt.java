package Newregist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class traveltestt {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()   {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
	}
	
	@Test
	public void LoginTest() {
		driver.findElement(By.id("Email")).sendKeys("amrutadjadhav22@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Wel@1234come");
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Book");
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

}
