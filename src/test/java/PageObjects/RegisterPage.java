package PageObjects;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class RegisterPage {
	
	private final WebDriver driver;
	
	private final By userIDElement = By.name("username");
	private final By newPasswordIDElement = By.name("password");
	private final By repeatPasswordIDElement = By.name("repeatedPassword");
	private final By firstNameElement = By.name("account.firstName");
	private final By lastNameElement = By.name("account.lastName");
	private final By emailElement = By.name("account.email");
	private final By phoneElement = By.name("account.phone");
	private final By adress1Element = By.name("account.address1");
	private final By adress2Element = By.name("account.address2");
	private final By cityElement = By.name("account.city");
	private final By stateElement = By.name("account.state");
	private final By zipElement = By.name("account.zip");
	private final By countryElement = By.name("account.country");
	private final By saveAccountElement = By.name("newAccount");
	private final By myAccountElement = By.xpath("//a[normalize-space()='My Account']");
	private final By signInElement = By.xpath("//a[normalize-space()='Sign In']");
	private final By loginElement = By.name("signon");
	
	private static final String[] names = { "ana", "maria", "pedro", "joao", "carlos", "davi", "beatriz", "joana", "jose", "alberto" };
    private static final String[] surname = { "silva", "souza", "ferreira", "alves", "pereira", "matos", "melo", "costa", "nunes", "rodrigues" };
	
	private WebElement waitRegisterFields;
	private static String generatedUsername;
	
	public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public static String generateUsername() {
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        String randomSurname = surname[random.nextInt(surname.length)];
        int randomNumber = random.nextInt(1000);
        generatedUsername = randomName + randomSurname + randomNumber;
        return generatedUsername;
    }
	
	public static String generateEmail() {
        Random random = new Random();
        String domain = "@gmail.com";
        String randomName = names[random.nextInt(names.length)];
        String randomSurname = surname[random.nextInt(surname.length)];
        return randomName + randomSurname + domain;
        
    }
	
	public void writeCredencials(String password, 
								 String repeatPassword, 
								 String firstName, 
								 String lastName,  
								 String phone, 
								 String adress1, 
								 String adress2, 
								 String city, 
								 String state, 
								 String zip, 
								 String country) {
    	
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(userIDElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(generatedUsername);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(newPasswordIDElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(password);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(repeatPasswordIDElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(repeatPassword);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(firstNameElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(firstName);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(lastNameElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(lastName);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(emailElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(generateEmail());
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(phoneElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(phone);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(adress1Element));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(adress1);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(adress2Element));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(adress2);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(cityElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(city);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(stateElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(state);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(zipElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(zip);
		
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(countryElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(country);  	
    	
    }
	
	public void clickSaveAccountButton() {
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(saveAccountElement));
		
		waitRegisterFields.click();
    }
	
	public void clickSignInButton() {
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(signInElement));
		
		waitRegisterFields.click();
    }
	
	public void writeRegisterCredencialsToSignInButton(String password) {
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(userIDElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(generatedUsername);
		
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(newPasswordIDElement));
		
		waitRegisterFields.clear();
		waitRegisterFields.sendKeys(password);
    }
	
	public void clickToLoginButton() {
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(loginElement));
		
		waitRegisterFields.click();
    }
	
	public void confirmLogin() {
		waitRegisterFields = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(myAccountElement));
				
				String left_text = waitRegisterFields.getText();
				Assert.assertTrue(left_text.equals("My Account"));
    }
	
}
