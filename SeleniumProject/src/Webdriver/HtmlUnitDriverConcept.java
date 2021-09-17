package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();    // launch chrome
		
		WebDriver driver = new HtmlUnitDriver();
	// HtmlUnitDriver concept is not available in Selenium 3.x version.
	// HtmlUnitDriver  -- To use this concept we have to download HtmlUnitDriver JAR file
		
	// Advantages: 
	// 1. testing is happening behind the scenes -- no browser is launched.
	// 2. very fast - execution of test cases - performance of the script.
	// 3. not suitable for Actions class  - user actions - mousemovement, doubleclick, drag and drop
	// 4. Also called Ghost Driver - headless browser:  1. HtmlUnitDriver - Java,   2. PhantomJS - Javascript.

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("Before Login Page title: "+ driver.getTitle());

		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveenk");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		
		System.out.println("After Login Page title: "+ driver.getTitle());
			
		
	}

}
