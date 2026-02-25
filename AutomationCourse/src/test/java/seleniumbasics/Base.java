package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	public void browserLaunch()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void quitAndClose() {
		driver.quit();
	}
	public static void main(String[] args) {

		Base base = new Base();
		base.browserLaunch();
		base.quitAndClose();
	}

}
