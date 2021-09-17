package Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://popuptest.com/");
		
	driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[8]/b/a")).click();
		// xpath of the pop up window link   (Modeless Window)
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent Window ID: "+ parentWindowId );
		String childWindowId = it.next();
		System.out.println("Child Window Id: "+ childWindowId );
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("Child Window Title: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title: "+driver.getTitle());
		driver.close();
	
				
	}

}
