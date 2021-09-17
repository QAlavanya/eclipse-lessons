package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();   // click on the go button
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		//validation 
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")){
			System.out.println("Correct alert message");
		}
		else{
			System.out.println("Incorrect alert message");
		}
		alert.accept();   // to click on the ok button on the pop up window
	//  alert.dismiss();	to click on the cancel button on the pop up window
				
	}

}
