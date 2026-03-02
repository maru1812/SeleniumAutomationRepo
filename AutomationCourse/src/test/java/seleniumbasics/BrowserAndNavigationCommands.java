package seleniumbasics;

public class BrowserAndNavigationCommands extends Base{

	String title;
	String URL,windowhandle,source;
	public void verifyBrowsercommands(){
		title = driver.getTitle();
		System.out.println(title);
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		source = driver.getPageSource();
		System.out.println(source);
		}
	
	public void verifyNavigationCommands() {
		driver.navigate().to("https://www.amazon.ca/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {

		BrowserAndNavigationCommands br = new BrowserAndNavigationCommands();
		br.browserLaunch();
	//	br.verifyBrowsercommands();
		br.verifyNavigationCommands();
		
	}

}
