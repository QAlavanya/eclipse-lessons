package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class LoginStepDefinition {

WebDriver driver;

	@Given("^user is already on the home page$")
	public void user_is_already_on_login_page(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");		
		
	}	
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_Free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	//	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is on the home page$")
	public void user_on_home_page(){
		String title = driver.getTitle();
		System.out.println("Home page title: "+ title);
		Assert.assertEquals("CRMPRO", title);
	}
	
}
