package webdriverexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewExercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(""))).doubleClick().build().perform(); // Double click
																								
		action.contextClick(driver.findElement(By.xpath(""))).build().perform();               // Rt click
		
		action.moveToElement(driver.findElement(By.xpath(""))).build().perform();            // mouse hover
																					
		action.clickAndHold(driver.findElement(By.xpath("")))
				.moveToElement(driver.findElement(By.xpath("")))
					.release().build().perform(); 										//   drag & drop
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
