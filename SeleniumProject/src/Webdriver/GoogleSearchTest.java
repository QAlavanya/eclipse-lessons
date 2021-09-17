package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	// To perform Dynamic search by using Dynamic Xpath
	// Steps: 1. Google search - pick a value from suggestions
			// 2. Search using xpath
			// 3. get the total count of suggestions
			// 4. use if conditions to match the value
			// 5. click on the matched value.

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		// driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("java"); // xpath for search box

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']")); 
		// xpath for listbox																										
		// whenever we are using driver.findElemets we have to use the List from java.util

		System.out.println("Total number of suggestions in the search box:--> " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("java tutorial")) {
				list.get(i).click();
				break;
			}
		}

	}

}
