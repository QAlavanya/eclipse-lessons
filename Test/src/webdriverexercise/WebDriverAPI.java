package webdriverexercise;

// this is for opening facebook.com page using fire fox browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverAPI {	

	public static void main(String[] args) throws InterruptedException {
			//throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
	    driver.manage().window().maximize();
	
		driver.findElement(By.id("email")).sendKeys("training@dkmrbh.com");
		driver.findElement(By.name("pass")).sendKeys("training");
	    driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("Lavanya");
	    driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Pitchuka");
	    driver.findElement(By.xpath(".//*[@id='u_0_k']/span[1]/label")).click();
	    driver.findElement(By.xpath(".//*[@id='u_0_k']/span[1]/label")).click();
	    
	    Select sele1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	    		sele1.selectByVisibleText("Sep");
		Select sele2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
				sele2.selectByValue("6");
		Select sele3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
				sele3.selectByIndex(3);
		
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).click();
	
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back();
		
		Thread.sleep(10);
		
	   driver.quit();
			
	}
	
}
