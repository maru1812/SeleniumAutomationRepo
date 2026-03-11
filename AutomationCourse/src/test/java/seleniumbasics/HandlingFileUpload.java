package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{

	
	public void verifyFileuploadSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement file = driver.findElement(By.name("uploadfile_0"));
		file.sendKeys("C:\\Users\\marin\\git\\SeleniumAutomationRepo\\AutomationCourse\\src\\test\\resources\\Assignment__superpdf.pdf");
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement sub = driver.findElement(By.id("submitbutton"));
		sub.click();


	}
	
	public void verifyFileuploadRobot() {
		driver.navigate().to(" https://www.ilovepdf.com/pdf_to_word");
	}
	
	public static void main(String[] args) {
		HandlingFileUpload hf = new HandlingFileUpload();
		hf.browserLaunch();
		hf.verifyFileuploadSendKeys();
	}

}
