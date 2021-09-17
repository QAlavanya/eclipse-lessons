package webdriverexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailApi {
		
	public static void main(String[] args) throws Throwable  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/");
		
		driver.manage().window().maximize();
		Thread.sleep(10);
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Lavanya@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='next']")).click();
			
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("lavanya");
		
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
	//	driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("password");		
				
	//	driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
	//	driver.navigate().back();
		
	//    driver.quit();
		
		
		
	}

}
