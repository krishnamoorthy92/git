package challenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// load the browser with url
		driver.get("http://jqueryui.com/");
		
		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		// Type Casting
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		
		// Scroll Buttom
		je.executeScript("scroll(0,1300);");
		
		((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		

	//	Thread.sleep(3000);
		
		// Scroll Into view
		//WebElement x = driver.findElementByLinkText("Using jQuery UI");		
		//je.executeScript("arguments[0].scrollIntoView(true)", x);
		
		System.out.println("Completes");
		
		
		
		
		
		
		
		
	}

}

