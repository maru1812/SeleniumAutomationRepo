package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base{

	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
	Alert al=	driver.switchTo().alert();
	al.accept();
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("confirmbutton"));
		simplealert.click();
	Alert al=	driver.switchTo().alert();
	al.dismiss();
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
	Alert al=	driver.switchTo().alert();
	al.sendKeys("Marina");
	al.accept();
	}
	public static void main(String[] args) {
		HandlingAlert alertobj = new HandlingAlert();
		alertobj.browserLaunch();
		alertobj.verifyPromptAlert();
	}

}
