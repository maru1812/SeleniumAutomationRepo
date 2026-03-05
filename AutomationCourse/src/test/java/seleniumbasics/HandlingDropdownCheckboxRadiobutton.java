package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownCheckboxRadiobutton extends Base{

	public void verifyDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
	//	select.selectByIndex(2); 
	//	select.selectByValue("c#");
		select.selectByVisibleText("SQL");
	}
	
	public void verifyRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='green']"));
		
		radiobutton.click();
	}
	
	
	public static void main(String[] args) {

		HandlingDropdownCheckboxRadiobutton drop = new HandlingDropdownCheckboxRadiobutton();
		drop.browserLaunch();
		drop.verifyDropdown();
		drop.verifyRadiobutton();
	}

}
