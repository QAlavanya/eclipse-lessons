package Webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();   // dynamic xpath is created in this case.
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		
		driver.switchTo().frame("mainpanel"); 					// for contacts tab
		
		// links --  //a href <http://www.google.com>   we test the link only if href in present in the link
		// images  --  //img href <http://www.test.com>
		
		// 1. get the list of all the links and images:
		List<WebElement> Linkslist = driver.findElements(By.tagName("a"));
		Linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of full links and images: --- "+Linkslist.size());
		List<WebElement> activelinks = new ArrayList<WebElement>(); 
		
		// 2. iterate Linkslist:  exclude all the links/images that doesn't have href attribute
		for(int i=0; i<Linkslist.size(); i++){
	//		System.out.println(Linkslist.get(i).getAttribute("href"));
			if(Linkslist.get(i).getAttribute("href")!=null && (! Linkslist.get(i).getAttribute("href").contains("javascript"))){
				activelinks.add(Linkslist.get(i));
			}				
		}
		// get the size of the active links list:
		System.out.println("Size of active links and images: --- "+ activelinks.size());

		// 3. Chk the href url, with http connection api:
		for(int j=0; j<activelinks.size(); j++){
		HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+"--->"+ response);
		}
		
		
	}

}
