package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AboutUsSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUpsetU() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@When("the user clicks the About us button")
	public void userClicksTheAboutUsButton() {
		driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[3]/a")).click();
	}
	
	@When("the user clicks in the video")
	public void userClicksInTheVideo() {
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div/div[1]")).click();
	}
	
	@When("the user clicks close button")
	public void userClickCloseButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button")).click();
	}
	
	@Then("did user land in the index page")
	public void didUserLandInIndexPage() {
		String name = driver.findElement(By.id("nava")).getText();
		
		Assert.assertTrue(name != null);
		SetUp.closeDriver();
	}
}
