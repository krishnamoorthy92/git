package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRailway {

	public static void main(String[] args) throws InterruptedException {
		
//Set property
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("jkljlhjhkh");
		driver.findElementById("userRegistrationForm:password").sendKeys("K01#lklklkl");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("K01#lklklkl");
		//WebElement kk1 = driver.findElementById("userRegistrationForm:securityQ");
		
		//Select dropdown = new Select(kk1);
		new Select(driver.findElement(By.id("userRegistrationForm:securityQ"))).selectByVisibleText("What is your all time favorite sports team?");
		/*	dropdown.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Ramu");
		WebElement kk2 = driver.findElementById("userRegistrationForm:prelan");
		Select dropdown1 = new Select(kk2);
		dropdown1.selectByVisibleText("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("krishna");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("moorthy");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement kk3 = driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown2 = new Select(kk3);
		dropdown2.selectByValue("16");
		WebElement kk4 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown3 = new Select(kk4);
		dropdown3.selectByVisibleText("JUN");
		WebElement kk5 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown4 = new Select(kk5);
		dropdown4.selectByVisibleText("1992");
		WebElement kk6 = driver.findElementById("userRegistrationForm:occupation");
		Select dropdown5 = new Select(kk6);
		dropdown5.selectByVisibleText("Private");
		driver.findElementById("userRegistrationForm:email").sendKeys("mmkrishnaece@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9043195530");
		WebElement kk7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdown6 = new Select(kk7);
		dropdown6.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("16 Anna Street, Ramapuram, chennai");
		WebElement kk8 = driver.findElementById("userRegistrationForm:countries");
		Select dropdown7 = new Select(kk8);
		dropdown7.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600029");
		Thread.sleep(15000);
		driver.findElementById("userRegistrationForm:cityName").click();
		
		Thread.sleep(6000);
		WebElement kk9 = driver.findElementById("userRegistrationForm:cityName");
		Select dropdown8 = new Select(kk9);
		dropdown8.selectByValue("Chennai");
		Thread.sleep(6000);
		driver.findElementById("userRegistrationForm:postofficeName").click();
		WebElement kk10 = driver.findElementById("userRegistrationForm:postofficeName");
		Select dropdown9 = new Select(kk10);
		dropdown9.selectByVisibleText("Aminjikarai S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("442446092");
		driver.findElementById("userRegistrationForm:resAndOff:1").click();
		Thread.sleep(9000);
		driver.close();*/
		

		
		
	}
	
	
}


