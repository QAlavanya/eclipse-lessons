package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpLoadPopUp {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.get("https://html.com/input-type-file/");
		
		//type="file" should be present when we spy on that button for Browse/Attach/Upload File buttons
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\madhu\\Desktop\\Doc1.docx");
		Thread.sleep(5000);
		
	}

}
