package webdriverexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise {
		
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\madhu\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String pagetitle = driver.getTitle();
		System.out.println("Page Title: " + pagetitle);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);
		
		String pagesource = driver.getPageSource();
		System.out.println("Page Source: "+ pagesource);
	
	    Select dropdown1 = new Select(driver.findElement(By.id("month")));
	    dropdown1.selectByVisibleText("Mar");
	    
	    String str = dropdown1.getFirstSelectedOption().getText();
	    System.out.println("selected month is : "+ str);
		
		Thread.sleep(5);
		
	//		driver.quit();
		
	}

}
