package challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFiles_FireFoxProfiles {
	public static void main(String[] args) throws InterruptedException {
	    //Create FireFox Profile object
		String downloadPath = "D\\WebDriverDownloads";
		FirefoxProfile firefoxProfile = new FirefoxProfile();
 
		//Set Location to store files after downloading.
		firefoxProfile.setPreference("browser.download.folderList",2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
		firefoxProfile.setPreference("browser.download.dir",downloadPath);
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		
 
		//Pass FProfile parameter In webdriver to use preferences to download file.
		FirefoxDriver driver = new FirefoxDriver(firefoxProfile);  
 
		// Open APP to download application
		driver.get("http://toolsqa.com/automation-practice-form/");
 
		// Click to download 
		driver.findElement(By.linkText("Test File to Download")).click();
 
		//Halting the execution for 5 secs to donwload the file completely
		Thread.sleep(5000);
 
		driver.close();
 
	}
}
