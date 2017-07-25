package selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://www.leaftaps.com/");
driver.manage().window().maximize();
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByPartialLinkText("CRM/SFA").click();
driver.findElementByPartialLinkText("Create Contact").click();

driver.findElementById("firstNameField").sendKeys("Krishnaa");
driver.findElementById("lastNameField").sendKeys("moorthy");
driver.findElementByName("birthDate").sendKeys("1992-06-16");

Select dropdwn = new Select(driver.findElementById("createContactForm_preferredCurrencyUomId"));
dropdwn.selectByValue("GBP");

Select dropdwn1 = new Select(driver.findElementById("createContactForm_generalCountryGeoId"));
dropdwn1.selectByValue("GBR");

driver.findElementByName("submitButton").click();
Thread.sleep(5000);
driver.close();


	}

}

