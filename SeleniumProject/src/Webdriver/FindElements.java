package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		// get the total count of links on the page.

		// all the links are represented by <a> html tag
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// whenever we use driver.findElements we have to use List <WebElement>
		System.out.println("No of links: " + links.size()); // to get the size of the links

		// all the input fields are represented by <input> html tag
		List<WebElement> links1 = driver.findElements(By.tagName("input"));
		System.out.println("No of input feilds:" + links1.size());

		// all the button fields are represented by <button> html tag
		List<WebElement> linklist1 = driver.findElements(By.tagName("button"));
		System.out.println("No of button feilds:" + linklist1.size());

		// get the text of each link in the page.

		System.out.println("Links present in Facebook:  ");

		for (int i = 0; i < links.size(); i++) {
			String linktext = links.get(i).getText();
			System.out.println(i + ":  "+ linktext);
		}
		// there are some texts without any name they are blank texts

	}

}
