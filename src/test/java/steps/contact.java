package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contact {
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void SetUp() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	@When("the user clicks the contact button")
	public void userClickTheContactButton() {
		driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[2]/a")).click();
	}
	@When("^the user enters the (.*) in the mail")
	public void userEntersTheEmail(String email) {
		driver.findElement(By.id("recipient-email")).sendKeys(email);
	}
	@When("^the user enters the (.*) in the name")
	public void userEntersTheName(String name) {
		driver.findElement(By.id("recipient-name")).sendKeys(name);
	}
	@When("^the user enters the (.*) in the message")
	public void userEntersTheText(String text) {
		driver.findElement(By.id("message-text")).sendKeys(text);
	}
	@When("the user clicks the send message button")
	public void userClicksSendMessageButton() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
