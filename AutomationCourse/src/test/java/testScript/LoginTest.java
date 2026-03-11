package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumbasics.TestNgBase;

public class LoginTest extends TestNgBase {
	
	@Test
	public void verifyUserLoginWithValidCreds() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		loginbutton.click();
	}
	
	
	@Test
	public void verifyValidUsernameInvalidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("incorrectpassword");
		
		loginbutton.click();
	}
	
	@Test
	public void verifyInvalidUsernameValidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		username.sendKeys("invalidusername");
		password.sendKeys("secret_sauce");
		
		loginbutton.click();
	}
	
	@Test
	public void verifyInvalidCredentials() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		username.sendKeys("invalidusername");
		password.sendKeys("invalidpassword");
		
		loginbutton.click();
	}

}
