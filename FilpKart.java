package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FilpKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement Electronics = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(Electronics).perform();
		//builder.moveToElement(Electronics).moveToElement(driver.findElement(By.xpath("//span[text()='Apple']"))).click().build().perform();
	//	driver.findElementByXPath("//span[text()='Apple']").click();
	
	//	driver.close();
		
	}

}
