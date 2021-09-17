package Webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiesFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\madhu\\workspace\\SeleniumProject\\src\\Webdriver\\config.properties");

		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browsername = prop.getProperty("browser");
		System.out.println(browsername);

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			} 
		else if (browsername.equals("FF")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\madhu\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("IE")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\madhu\\Downloads\\internetexplorerdriver_win32\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname-xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname-xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("email-xpath"))).sendKeys(prop.getProperty("email"));

		
	}

}
