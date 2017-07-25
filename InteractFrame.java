package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	    driver.switchTo().frame("iframeResult");
	    //driver.switchTo().fr
	    driver.findElementByXPath("/html/body/button").click();
	    Alert kk = driver.switchTo().alert();
	    System.out.println(kk.getText());
	    kk.sendKeys("KRISHNA");
	    Thread.sleep(5000);
	    //driver.switchTo().parentFrame();
	    kk.accept();
	    
	    String chkname = driver.findElementById("demo").getText();
	    
	    if (chkname.contains("KRISHNA"))
	    {
	    	System.out.println("The given String is present");
	    	
	    }
	    
	    else
	    {
	    	System.out.println("The given String is not present");

	    	
	    }
	    
	
	
	}
	
	
	

}
