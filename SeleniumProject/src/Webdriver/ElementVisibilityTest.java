package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register/");

		// isDisplayed() method - applicable for all the buttons.
		// will return true if displayed and false if not displayed.
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); // for submit button
		System.out.println("Submit button is displayed: "+b1);
		
		// isEnabled() method  - used mostly with buttons
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("Submit Button is enabled: "+ b2);
		
		//select I Agree Checkbox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("Submit Button is enabled: "+ b3);
		
		// isSelected() method - only applicable for checkboxes, radiobuttons, dropdowns
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("I Agree check box is selected: "+b4);
		
		// de-Select the check box 
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("I Agree check box is selected: "+b5);
			
		
	}

}
