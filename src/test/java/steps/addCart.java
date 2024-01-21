package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class addCart {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@When("the user clicks the first product")
	public void userClicksTheProduct() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
	}
	
	@When("the user clicks add to cart")
	public void userClicksTheAddButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
	}
	
	@When("the user clicks ok")
	public void userClickOkButton() throws InterruptedException {
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@When("the user clicks the cart button")
	public void userClickTheCart() throws InterruptedException {
		driver.findElement(By.id("cartur")).click();
	}
	
	@Then("the user is in cart page with the product added")
	public void userChecksIfProductIsInCart() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.className("success"));
		
		Assert.assertTrue(element != null);
		SetUp.closeDriver();
	
	}
}
