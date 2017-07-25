package challenge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// opening Firefox browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("https://www.naukri.com/");
		
		driver.findElementById("input_resumeParser").click();

		Thread.sleep(10000);

		// Store the copied text in the clipboard
		
	 UploadFile kk = new UploadFile();
	 kk.upload("c:\\Resume.pdf");
	 System.out.println("completed");
		
	}
		public void upload(String Filenames){
			
		
		StringSelection stringSelection = new StringSelection(Filenames);
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(arg0, arg1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			int kk = Toolkit.getDefaultToolkit().getScreenResolution();
			
			System.out.println("Screen size   " +kk);
		try {
			// Paste it using Robot class
			Robot robot = new Robot();

			// Enter to confirm it is uploaded
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			//robot.keyPress(KeyEvent.);

			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

















	}


