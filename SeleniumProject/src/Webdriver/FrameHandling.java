package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();   // dynamic xpath is created in this case.
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		
		// for contacts tab
	/*	driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click();   
	*/	// if given without the switchTo() the above statement it will throw an error, bcoz it is in a frame.
		
		//for timeline tab
		driver.switchTo().frame("leftpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='navMenu']/ul/li[6]/a")).click();
				
	}

}
