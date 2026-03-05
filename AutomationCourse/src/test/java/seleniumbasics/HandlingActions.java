package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void verifyRightClick() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver); //aCTION IS A CLASS
		action.contextClick(others).build().perform();   //rightclick always use build and perform to any action
	}
	
	public void verifyMouseOver() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.moveToElement(others).build().perform();
	}
	
	
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
        act.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyboardAction() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions ha = new HandlingActions();
		ha.browserLaunch();
	//	ha.verifyRightClick();
	//	ha.verifyMouseOver();
		ha.verifyDragAndDrop();
		try {
			ha.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
