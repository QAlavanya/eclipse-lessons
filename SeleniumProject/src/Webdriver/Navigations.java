package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		// back and forward simulation
		driver.navigate().to("https://www.aldi.us/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
        driver.navigate().back();	
        
        driver.navigate().refresh();
        
   //     difference b/t navigate().to() and get()  - 
   //  both are used to launch the URL, 
   //  but navigate().to() is used to launch the external URL
		
	}

}
