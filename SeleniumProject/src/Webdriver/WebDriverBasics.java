package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

	// Automation part
		// FireFox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\madhu\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		/*// chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); */
		
		driver.get("http://www.google.com");

		String title = driver.getTitle();
		System.out.println(title);
		
	// validation point   - this is called the automation testing
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
