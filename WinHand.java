package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WinHand {

	final static Logger logger = Logger.getLogger(WinHand.class);

	public static void main(String[] args) throws InterruptedException {
		
//Set property


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		String main_wind = driver.getWindowHandle();
		System.out.println(main_wind);
		
		
		driver.findElementByLinkText("Contact Us").click();
		Set<String> km = driver.getWindowHandles();
		System.out.println(km.size());
		//logger.info(message);
	
		
		for (String allwindow : km) {
			driver.switchTo().window(allwindow);
			//System.out.println(driver.getTitle());		
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(main_wind);
//		driver.quit();
		//driver.close();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		}
	
	
}


