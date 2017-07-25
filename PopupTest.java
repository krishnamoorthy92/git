package selenium;

import java.awt.datatransfer.StringSelection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String main_wind=driver.getWindowHandle();
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Set<String> all_hand = driver.getWindowHandles();
		int i=1;
		for (String each_hand : all_hand) {
			System.out.println("loop");
			driver.switchTo().window(each_hand);
			System.out.println(driver.getTitle());
			System.out.println(driver.getWindowHandle());
			
			if (i==2){
				System.err.println(driver.getCurrentUrl());
				
			}
			i++;
			
			
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

		//StringSelection kk = new StringSelection(data)
		//driver.switchTo().window(main_wind);
		//System.out.println(driver.getTitle());

	}
}
