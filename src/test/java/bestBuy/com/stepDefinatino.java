package bestBuy.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinatino {
	
	WebDriver driver; 
	
	@Given("User is already in the login page")
	public void user_is_already_in_the_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","/Users/shajib/Documents/study/QA/development/java/Exercise/testing/chromedriver");
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    
	}

	@When("Title of the login page is Best Buy")
	public void title_of_the_login_page_is_best_buy() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}

	@Then("User enter username")
	public void user_enter_username() {
//	    driver.findElement(By.xpath("//input[@name='fld-e']")).sendKeys("iamsajib1@gmail.com");
		System.out.println("User entered usename");
	}

	@Then("User enter password")
	public void user_enter_password() {
		System.out.println("User entered password");
	}

	@Then("User click on login button")
	public void user_click_on_ligin_button() {
		System.out.println("Clicking on login");
	   
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("User entered usename");
	   
	}


}
