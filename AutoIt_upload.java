package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt_upload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/upload/");
		driver.findElementByXPath("//input[@class='upload_txt']").click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\auto_it.exe");

	}

}
