package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://jqueryui.com/droppable/");

		// For most recent applications developers are not using frames. Its not
		// recommended.
		// Frames are deprecated
		// For old applications or any old UIs frames might be there.
		// If you want to know if there is any frame rtclick on the object and
		// see if there is a page source.
		// In the page source look for (crtl F) frame, if there is a iFrame tag,
		// then there is a frame.

		driver.switchTo().frame(0);    // switch to frame only if it is present
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();

	}

}
