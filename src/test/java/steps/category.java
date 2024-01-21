package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class category {
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void SetUp() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@Given("^the user clicks the (.*) in the left")
	public void userClicksCategory(String Category) {
		driver.findElement(By.linkText(Category)).click();
	}
	@Then("^the user lands in the correct (.*) page")
	public void didUserLandInTheCorrectPage(String Product) throws InterruptedException {
		Thread.sleep(1000);
		
		String name = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).getText();
		Assert.assertTrue(name.matches(Product));
	}
	
}
