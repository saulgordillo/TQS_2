package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class placeOrder {
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@When("the user clicks the place order button")
	public void userClicksThePlaceOrderButton() {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
	}
	@When("^the user adds the (.*) in the name")
	public void userAddsTheName(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
	}
	@When("^the user adds the (.*) in the country")
	public void userAddsTheCountry(String country) {
		driver.findElement(By.id("country")).sendKeys(country);
	}
	@When("^the user adds the (.*) in the city")
	public void userAddsTheCity(String city) {
		driver.findElement(By.id("city")).sendKeys(city);
	}
	@When("^the user adds the (.*) in the credit Card")
	public void userAddsTheCreditCard(String CreditCard) {
		driver.findElement(By.id("card")).sendKeys(CreditCard);
	}
	@When("^the user adds the (.*) in the month")
	public void userAddsTheMonth(String month) {
		driver.findElement(By.id("month")).sendKeys(month);
	}
	@When("^the user adds the (.*) in the year")
	public void userAddsTheYear(String year) {
		driver.findElement(By.id("year")).sendKeys(year);
	}
	@When("the user clicks the purchase button")
	public void userClicksThePurchaseButton() {
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
	}
	@Then("check if the purchase is correct")
	public void userChecksIfThePurchaseIsCorrect() throws InterruptedException {
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[10]/h2"));
		
		Assert.assertTrue(element != null);
		
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		
		SetUp.closeDriver();
	}
}
