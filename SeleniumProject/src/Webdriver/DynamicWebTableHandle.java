package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");

		driver.findElement(By.xpath("//input[@type='submit']")).click(); // dynamic xpath is created for login button in this case.
																			
		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click(); // contacts tab on the main panel
																				
		// In Html, tr is rows & td is columns

		// *[@id='vContactsForm']/table/tbody/tr[5]/td[2] xpath for 2nd contact
		// *[@id='vContactsForm']/table/tbody/tr[6]/td[2] xpath for 3rd contact
		// *[@id='vContactsForm']/table/tbody/tr[7]/td[2] xpath for 4th contact
		// *[@id='vContactsForm']/table/tbody/tr[8]/td[2] xpath for 5th contact
		// *[@id='vContactsForm']/table/tbody/tr[9]/td[2] xpath for 6th contact

		 // Method -1:
			//		Iterate row and column and get the cell value
			//		Using the for loop
			//		Get total rows and iterate table
			//		Put if(string matches) then select the value
			//		Lengthy method.
						
//		 String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		 String after_xpath = "]/td[2]";
//		
//		 for (int i = 5; i <= 9; i++) {
//		 String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//		 System.out.println(name);
//		 if (name.contains("Devika Raj")) {
//		 // *[@id='vContactsForm']/table/tbody/tr[7]/td[1]/input 				xpath for Devika Raj
//		 driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" + i + "]/td[1]/input")).click();
//		 }
//	 }

		// Method-2:
			//		Using custom xpath
			//		Using parent and preceding sibling tags
			//		No need to write for loop
			//		No full iteration of table
			//		Single Line statement
			//		More dynamic and efficient and fast
		
		driver.findElement(By
				.xpath("//a[contains(text(),'Devika Raj')]/parent::td//preceding-sibling::td//input[@name='contact_id']"))
				.click();
		driver.findElement(By
				.xpath("//a[contains(text(),'Ashwin Unknown')]/parent::td//preceding-sibling::td//input[@name='contact_id']"))
				.click();
		
		// preceding-sibling is the before sibling for that element
		// forwarding-sibling is the next sibling in line for that element
		
	}

}
