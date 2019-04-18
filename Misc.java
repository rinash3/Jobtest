package intro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class Misc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\razum_000\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			WindowsUtils.killByName("excel.exe");
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
			//login page- verify login url
			
			
		/*	driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));*/
		
		
	}

}
