package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromebrowserTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// Mandatory options:
		// chrome version should be greater than 59 on mac and greater than 60 on windows
		// "window-size-1400,800"   -  by default 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size-1400,800");
		options.addArguments("Headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");
		System.out.println("Login Page Title:  "+ driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Home Page Title:  "+ driver.getTitle());				
		
	}

}
