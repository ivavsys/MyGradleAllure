/**
 * 
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.testng.AllureTestListener;

/**
 * @author SiddhiVinayaka
 *
 */

public class MyAllureReports
{
	MyGoogleChromeBrowser mgc = new MyGoogleChromeBrowser();
	WebDriver driver = mgc.DoUseGoogleChromeBrowser();
	AllureTestListener atl = new AllureTestListener();
	//File f1 = new File("allure.html");
	//AllureReportGenerator alrg = new AllureReportGenerator(f1);
	
	/**
	 * @param args
	 */
	//public static void main(String[] args)
	public boolean Test000MyAllureTestMain()
	{
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return true;
		
	}


	public boolean Test001NavigateToGoogleWebSite()
	{
		driver.navigate().to("http://google.com");
		return true;
	}
	

	public boolean Test002CloseGoogleChromeWebBrowser()
	{
		driver.close();
		driver.quit();
		//alrg.generate(f1);
		return true;
		
	}
	

	
}
