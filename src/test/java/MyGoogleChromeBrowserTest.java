/**
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SiddhiVinayaka
 *
 */
public class MyGoogleChromeBrowserTest {
	
	public WebDriver DoUseGoogleChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	

}
