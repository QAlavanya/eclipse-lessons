package Webdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		// Take a screenshot and store as a file format
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now copy the screenshot to desired location using copyfile    //method
	    FileUtils.copyFile(src, new File("C:\\Users\\madhu\\workspace\\SeleniumProject\\src\\Webdriver\\facebook.jpg"));
	    
		
		
	}

}
