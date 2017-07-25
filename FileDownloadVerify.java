package download_file;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.*;

public class FileDownloadVerify {

private WebDriver driver;
	
	public static String downloadPath = "D:\\seleniumdownloads";
	 protected static String URL="http://spreadsheetpage.com/index.php/file/C35/P10/"; 
	
	@BeforeClass
	public void testSetup() throws Exception{
		driver = new FirefoxDriver(firefoxProfile());	
		driver.manage().window().maximize();
	}
	
	/*@Test
	public void example_VerifyDownloadWithFileName()  {
		driver.get(URL);
	    driver.findElement(By.linkText("mailmerge.xls")).click();
	    Assert.assertTrue(isFileDownloaded(downloadPath, "mailmerge.xls"), "Failed to download Expected document");
	}
	*/
        @Test
	public void example_VerifyDownloadWithFileExtension() throws InterruptedException  {
		driver.get(URL);
	    driver.findElement(By.linkText("mailmerge.xls")).click();
	    Thread.sleep(9000);
	    //Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".xls"), "Failed to download document which has extension .xls");
	    
	    if(isFileDownloaded_Ext(downloadPath, "mailmerge.xls")) {
	    	System.out.println("files downloaded successfully");
	    }else
	    	System.out.println("some problem occured while downloading file");
	}

	/*@Test
	public void example_VerifyExpectedFileName() {
		driver.get(URL);
	    driver.findElement(By.linkText("mailmerge.xls")).click();
	    File getLatestFile = getLatestFilefromDir(downloadPath);
	    String fileName = getLatestFile.getName();
	    Assert.assertTrue(fileName.equals("mailmerge.xls"), "Downloaded file name is not matching with expected file name");
	}
	*/

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
public static FirefoxProfile firefoxProfile() throws Exception {
		
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("browser.download.folderList",2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
		firefoxProfile.setPreference("browser.download.dir",downloadPath);
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		
		return firefoxProfile;
	}


	private boolean isFileDownloaded_Ext(String dirPath, String ext){
	boolean flag=false;
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    if (files == null || files.length == 0) {
        flag = false;
    }	
    
    for (int i = 1; i < files.length; i++) {
    	System.out.println(files[i].getName());
    	if(files[i].getName().contains(ext)) {
    		flag=true;
    	}
    }
    System.out.println("flag vlaue" +flag);
    return flag;
}
	
	
}
