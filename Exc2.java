package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exc2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\razum_000\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
driver.get("https://www.cnn.com/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.xpath("/html/body/footer/div[2]"));// Limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3-
		WebElement coloumndriver=footerdriver.findElement(By.xpath("/html/body/footer/div[2]/div/div[1]/ol[9]/li"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());

	}

}
}