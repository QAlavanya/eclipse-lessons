package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// global waits or dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   // for the page to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    // for all the elements in the web page to load
	// for dynamic waits, if the page is loaded before the time then the remaining time is ignored.	
	
		// Thread.sleep(2000);   
		// It is the hard wait, script will be paused for 20 secs everytime.
		// even after 20 secs if the element is still not available then it throws an error.
		// better to avoid, bcoz it makes it very slow.
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Java");
		
	}

}
