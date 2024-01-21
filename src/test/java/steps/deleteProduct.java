package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteProduct {

	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@When("the user clicks the delete button")
	public void userClickTheDeleteButton() throws InterruptedException {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Then("the user is in cart page with the product removed")
	public void userClicksChecksTheCart() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.className("success"));
		
		Assert.assertTrue(element == null);
		SetUp.closeDriver();
	
	}
}
