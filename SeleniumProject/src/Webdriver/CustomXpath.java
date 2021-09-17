package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath { 
	// Customize xpaths are very powerful and very fast as compared to absolute xpath
	// absolute xpath:   //*[@id='headersearchbar']/div/div[2]/table/tbody/tr/td[2]/input --not recommended
	// absolute xpath: 1. because of so many layers in the absolute path it becomes very slow.(performance issue)
	// 2. not reliable.
	// 3. can be changed at any time in future.
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");

		// driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Java");       // given xpath

		// diff ways of writing the custom xpath

		// driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
		// driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		// driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("Java");
		// we can also write the xpath using contains function, in this case we should give comma instead of equal to in brackets
		
		// driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("Java");

		// Dynamic id - it changes everytime when we refresh the page where html tag is input
		
		// id = test_123 				we can use contains and starts with functions
		// id = test_456		
		// driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Java");
		
		// id = test_789				we can use starts-with for this case
		// id = test_test_2345_test 	we can use starts-with for this case
		// driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Java");
		
		// id = 1234_test_t 			we can use ends-with for these cases
		// id = 2345_test_t
		// id = 6789_test_t
		// driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Java");

		// for links: custom xpath
		// all the links are represented by <a> html tag
		// driver.findElement(By.xpath("//a[contains(text(),'My
		// eBay')]")).click(); // to click on the My eBay link
		driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click(); // to click on the sell link
																				
	}

}

/*    Custom xpaths  for   https://www.freecrm.com/index.html

link:
//a[text()='Features']
//a[contains( text(),'Features')]	- contains is recommended
//a[text()='Alerts']
//a[@title='Alerts']

button:
//button[@type='button' and @class='btn']
//button[text()='Sign Up']
//button[contains(text(),'Sign Up')]		- recomended

dynamic check box 
//a[text()='Devika Raj']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']


*/