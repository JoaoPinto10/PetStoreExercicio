package petStoreExercicioBDD.steps;

import org.openqa.selenium.WebDriver;

import Config.WebDriverConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginTest {
	//username - JoaoPinto0001
	//Pass - test123
	
	WebDriver driver;
	
	@Given("I have a Selenium using {string}")
	public void i_have_a_selenium_using(String browser) {
		driver = WebDriverConfig.StartBrowser(browser);

	}
	
	
	@And("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		
	}
	
	
}

