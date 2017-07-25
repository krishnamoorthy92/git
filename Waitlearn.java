package download_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitlearn {

	public static void main(String[] args){
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	 driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	//WebElement element =  driver.findElement(By.xpath("//p[text()='WebDriver']"));
WebDriverWait wait = new WebDriverWait(driver, 2);


WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

	boolean found = element.isDisplayed();
	
	if (found){
	 System.out.println("element found");
	}else{
		System.out.println("not found");

	}
	
	
	}
	
}
