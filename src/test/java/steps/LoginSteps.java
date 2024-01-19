package steps;

import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void isUserInIndexPage() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.demoblaze.com/");
	}
	
	@When("the user clicks the login button")
	public void userClicksLoginButton() {
		driver.findElement(By.id("login2")).click();
	}
	
	@When("^the user enters (.*) in the username")
	public void userEntersTheUsername(String username) {
		driver.findElement(By.id("loginusername")).sendKeys(username);
	}
	
	@When("^the user enters (.*) in the password")
	public void userEntersThePassword(String password) {
		driver.findElement(By.id("loginpassword")).sendKeys(password);
	}
	
	@When("the user clicks login")
	public void userClicksLogin() {
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
	}
	
	@Then("the user is logged in")
	public void isUserLoggedIn() {
		String name = driver.findElement(By.id("nameofuser")).getText();
		
		Assert.assertTrue(name != null);
	}
}
