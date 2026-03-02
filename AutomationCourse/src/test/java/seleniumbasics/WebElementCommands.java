package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{

	public void verifyWebElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement msgbox =	driver.findElement(By.id("single-input-field"));
	msgbox.sendKeys("Test Message");
	
	WebElement showbutton = driver.findElement(By.id("button-one"));
	showbutton.click();
	
	WebElement yourmsg = driver.findElement(By.id("message-one"));
	System.out.println(yourmsg.getText());
	
	msgbox.clear();
	}
	

	
	public static void main(String[] args) {
		
		WebElementCommands commands = new WebElementCommands();
		commands.browserLaunch();
		
		commands.verifyWebElement();

	}

}
