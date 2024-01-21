package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class products {
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp() throws Exception {
		driver = SetUp.getDriver();
		wait = SetUp.getWait();
	}
	
	@When("the user clicks all the items in the first page")
	public void userClicksAllItemsInFirstPage() throws InterruptedException {
		for(int i=1; i<9; i++) {
			Thread.sleep(600);
			driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[" + i + "]/div/a/img")).click();
			driver.findElement(By.id("nava")).click();
		}
	}
	@When("the user clicks to next page button")
	public void userClicksNextPageButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("next2")).click();
	}
	@When("the user clicks all the items in the next page")
	public void userClicksAllItemsInNextPage() throws InterruptedException {
		for(int i=1; i<6; i++) {
			Thread.sleep(600);
			driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[" + i + "]/div/a/img")).click();
			driver.findElement(By.id("nava")).click();
			driver.findElement(By.id("next2")).click();
		}
	}
}
