package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("lavanya");    // using xpath locator
    	// xpath is my 2nd priority if not a hierarchy based xpath
	    // absolute xpath should not be used  ---  html/body/div/[1]/div[3]/div[5]/a
		// relative xpath should be used   ---     //*[@id='email']
		
		driver.findElement(By.id("pass")).sendKeys("sai");    					// using id locator
															// id is my 1st priority
		driver.findElement(By.name("firstname")).sendKeys("Lavanya");           // using name locator
															// name is my 3rd priority	
		driver.findElement(By.cssSelector("#u_0_e")).sendKeys("sai");           // using css selector
															// css selector is also my 2nd priority	
		//	driver.findElement(By.linkText("Forgot account?")).click();             // using Linkedtext locator 
															// for links my first priority is linked text
	//	driver.findElement(By.partialLinkText("Why do I")).click();             // using partiallinkedtext
		//Generally partial linked text is not recommended
		
		//classname  - not recommended and not useful.      // 4th priority
	    //	driver.findElement(By.className("")).click();
	
		//handle drop down
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jul");
		Select select1 = new Select(driver.findElement(By.id("day")));
	    select1.selectByIndex(7);
		Select select2 = new Select(driver.findElement(By.id("year")));
        select2.selectByValue("2014");
		
        driver.findElement(By.xpath("//*[@id='u_0_s']/span[1]/label")).click();
        
        driver.findElement(By.xpath("//*[@id='u_0_u']")).click();
        
	//	driver.quit();
		
	}

}
