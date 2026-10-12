package Newregist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewRegist {
	
	WebDriver driver;
@BeforeMethod
 public void setupt() {
    
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      
}

     @Test 
     public void logintest(){
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     driver.findElement(By.id("password")).sendKeys("secret_sauce");
     driver.findElement(By.id("login-button")).click();
    }
     
     
     
}