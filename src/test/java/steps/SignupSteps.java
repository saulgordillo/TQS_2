package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignupSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUpsetU() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@When("the user clicks the signup button")
	public void userClicksSignupButton() {
		driver.findElement(By.id("signin2")).click();
	}
	
	@When("^the user enters (.*) in the new username")
	public void userEntersTheNewUsername(String username) {
		driver.findElement(By.id("sign-username")).sendKeys(username);
	}
	
	@When("^the user enters (.*) in the new password")
	public void userEntersTheNewPassword(String password) {
		driver.findElement(By.id("sign-password")).sendKeys(password);
	}
	
	@When("the user clicks signup")
	public void userClicksSignup() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]")).click();
	}
	
	@Then("the user is signed up")
	public void isUserSignedUp() throws InterruptedException {
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.print(text);
		Assert.assertTrue(text != null);
		SetUp.closeDriver();
	}
}
