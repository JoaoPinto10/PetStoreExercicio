package petStoreExercicioBDD.steps;

import org.openqa.selenium.WebDriver;

import Config.WebDriverConfig;
import PageObjects.GeneralPage;
import PageObjects.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest {
	
	WebDriver driver;
	RegisterPage registerPage;
	GeneralPage generalPage;
	
	@Given("I have a Selenium using {string}")
	public void i_have_a_selenium_using(String browser) {
		driver = WebDriverConfig.StartBrowser(browser);
		registerPage = new RegisterPage(driver);
		generalPage = new GeneralPage(driver);

	}
	
	@And("I navigate to the register page")
	public void i_navigate_to_the_register_page() {
	    driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
	}
	
	@When("the user enters valid registration details")
	public void the_user_enters_valid_registration_details() {
	    registerPage.writeCredencials("test123", 
	    							  "test123", 
	    							  "João", 
	    							  "Pinto", 
	    							  "935845625", 
	    							  "rua andre", 
	    							  "lote 1", 
	    							  "Edinburgo", 
	    							  "Scot", 
	    							  "8456-564", 
	    							  "Escócia");
	}
	
	@And("I click on the save account button")
	public void i_click_on_the_save_account_button() {
	    registerPage.clickSaveAccountButton();
	}
	
	@Then("I should be successfully registered")
	public void i_should_be_successfully_registered() {
	    registerPage.clickSignInButton();
	    registerPage.writeRegisterCredencialsToSignInButton("test123");
	    registerPage.clickToLoginButton();
	    registerPage.confirmLogin();
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
